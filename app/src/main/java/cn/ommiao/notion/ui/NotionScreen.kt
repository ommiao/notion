package cn.ommiao.notion.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import cn.ommiao.notion.*
import cn.ommiao.notion.R
import cn.ommiao.notion.extension.clickableWithoutRipple
import cn.ommiao.notion.model.AvatarPart
import cn.ommiao.notion.ui.sheet.AvatarPartOptions
import cn.ommiao.notion.ui.theme.NotionTheme
import com.google.accompanist.insets.ProvideWindowInsets
import com.google.accompanist.insets.statusBarsPadding

@OptIn(ExperimentalMaterialApi::class)
@Composable
fun NotionScreen() {
    val scaffoldState = rememberBottomSheetScaffoldState()
    val sheetPeekHeight = 64.dp
    BottomSheetScaffold(
        scaffoldState = scaffoldState,
        sheetPeekHeight = sheetPeekHeight,
        sheetContent = {
            AvatarPartOptions(
                sheetPeekHeight = sheetPeekHeight,
                sheetState = scaffoldState.bottomSheetState
            )
        },
        backgroundColor = NotionTheme.colors.background,
        sheetBackgroundColor = NotionTheme.colors.background,
        sheetContentColor = NotionTheme.colors.textPrimary,
        sheetElevation = 16.dp
    ) {
        Box(Modifier.padding(it)) {
            Content()
        }
    }
}

@OptIn(ExperimentalMaterialApi::class)
@Composable
private fun Content() {
    val actor = LocalActor.current
    Column(Modifier.fillMaxSize()) {
        ProvideWindowInsets {
            Box(
                Modifier
                    .fillMaxWidth()
            ) {
                Image(
                    painter = painterResource(id = R.drawable.ic_sun),
                    contentDescription = null,
                    alignment = Alignment.TopEnd,
                    modifier = Modifier
                        .align(Alignment.TopEnd)
                        .size(280.dp),
                    contentScale = ContentScale.FillWidth,
                    colorFilter = ColorFilter.tint(color = NotionTheme.colors.textPrimary)
                )
                Column(modifier = Modifier.fillMaxWidth()) {
                    Text(
                        text = stringResource(id = R.string.top_title),
                        color = NotionTheme.colors.textPrimary,
                        style = MaterialTheme.typography.h6,
                        modifier = Modifier
                            .fillMaxWidth()
                            .statusBarsPadding()
                            .padding(horizontal = 32.dp, vertical = 16.dp)
                    )
                    AvatarPreview(modifier = Modifier.padding(top = 32.dp))
                    Box(modifier = Modifier.fillMaxWidth().padding(16.dp)) {
                        Row(modifier = Modifier.align(Alignment.Center)) {
                            AvatarActionIcon(
                                drawableRes = R.drawable.ic_dice,
                                contentDescription = stringResource(R.string.dice_description)
                            ) {
                                actor(Action.RandomAvatar)
                            }
                        }
                    }
                }
            }
        }
    }
}

@Composable
private fun AvatarPreview(modifier: Modifier = Modifier) {
    val state = LocalState.current
    Box(modifier.fillMaxWidth()) {
        val previewResourcesList =
            AvatarPart.values().map { state.getSelectedAvatarPreviewIcon(it) }
        AvatarPreviewIcon(
            modifier = Modifier.align(Alignment.Center),
            drawableRes = previewResourcesList
        )
    }
}

