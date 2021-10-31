package cn.ommiao.notion.ui

import androidx.annotation.DrawableRes
import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.core.tween
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.Icon
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import cn.ommiao.notion.R
import cn.ommiao.notion.ui.theme.NotionTheme

private val elevation = 0.dp

@OptIn(ExperimentalMaterialApi::class)
@Composable
fun AvatarPartIcon(
    @DrawableRes drawableRes: Int,
    contentDescription: String,
    selected: Boolean = false,
    onClick: () -> Unit
) {
    Card(
        shape = RoundedCornerShape(12.dp),
        backgroundColor = NotionTheme.colors.iconCardBackground,
        elevation = elevation,
        onClick = onClick
    ) {
        Box {
            val alpha by animateFloatAsState(
                targetValue = if (selected) 1f else 0f,
                animationSpec = tween(500)
            )
            val dotColor = NotionTheme.colors.iconCardSelectedDot
            Canvas(
                modifier = Modifier
                    .padding(8.dp)
                    .size(8.dp)
                    .align(Alignment.TopEnd)
            ) {
                drawCircle(color = dotColor, alpha = alpha)
            }
            Image(
                painter = painterResource(id = drawableRes),
                contentDescription = contentDescription,
                modifier = Modifier
                    .size(96.dp)
                    .padding(32.dp)
            )
        }
    }
}

@OptIn(ExperimentalMaterialApi::class)
@Composable
fun AvatarPartSmallIcon(
    @DrawableRes drawableRes: Int,
    contentDescription: String,
    onClick: () -> Unit
) {
    Card(
        shape = RoundedCornerShape(8.dp),
        backgroundColor = NotionTheme.colors.iconCardBackground,
        elevation = elevation,
        onClick = onClick
    ) {
        Box {
            Image(
                painter = painterResource(id = drawableRes),
                contentDescription = contentDescription,
                modifier = Modifier
                    .size(32.dp)
                    .padding(8.dp)
            )
        }
    }
}

@OptIn(ExperimentalMaterialApi::class)
@Composable
fun AvatarActionIcon(
    @DrawableRes drawableRes: Int,
    contentDescription: String,
    onClick: () -> Unit
) {
    Card(
        shape = RoundedCornerShape(8.dp),
        backgroundColor = NotionTheme.colors.iconCardBackground,
        elevation = elevation,
        onClick = onClick
    ) {
        Box {
            Image(
                painter = painterResource(id = drawableRes),
                contentDescription = contentDescription,
                modifier = Modifier
                    .size(64.dp)
                    .padding(8.dp)
            )
        }
    }
}

@OptIn(ExperimentalMaterialApi::class)
@Composable
fun AvatarPreviewIcon(
    modifier: Modifier = Modifier,
    @DrawableRes drawableRes: List<Int>
) {
    Card(
        modifier = modifier,
        shape = RoundedCornerShape(16.dp),
        backgroundColor = NotionTheme.colors.iconCardBackground,
        elevation = elevation
    ) {
        drawableRes.forEach {
            Image(
                painter = painterResource(id = it),
                contentDescription = stringResource(R.string.avatar_preview_description),
                contentScale = ContentScale.FillBounds,
                modifier = Modifier
                    .size(240.dp)
            )
        }
    }
}