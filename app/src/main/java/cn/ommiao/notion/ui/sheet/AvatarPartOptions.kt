package cn.ommiao.notion.ui.sheet

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.*
import androidx.compose.material.BottomSheetState
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import cn.ommiao.notion.Action
import cn.ommiao.notion.LocalActor
import cn.ommiao.notion.LocalState
import cn.ommiao.notion.model.AvatarPart
import cn.ommiao.notion.ui.AvatarPartIcon
import cn.ommiao.notion.ui.AvatarPartSmallIcon
import cn.ommiao.notion.ui.theme.NotionTheme
import kotlinx.coroutines.launch

@OptIn(ExperimentalMaterialApi::class)
@Composable
fun AvatarPartOptions(sheetPeekHeight: Dp, sheetState: BottomSheetState) {
    val state = LocalState.current
    val actor = LocalActor.current
    val scope = rememberCoroutineScope()
    val columnState = rememberLazyListState()
    LazyRow(
        modifier = Modifier.height(sheetPeekHeight),
        contentPadding = PaddingValues(16.dp),
        horizontalArrangement = Arrangement.spacedBy(16.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        itemsIndexed(AvatarPart.values()) { index, avatarPart ->
            val drawableRes = state.getSelectedAvatarPartIcon(avatarPart)
            AvatarPartSmallIcon(
                drawableRes = drawableRes,
                contentDescription = avatarPart.name
            ) {
                scope.launch {
                    if (sheetState.isCollapsed) {
                        sheetState.expand()
                    }
                    columnState.animateScrollToItem(index)
                }
            }
        }
    }
    LazyColumn(
        modifier = Modifier.height(320.dp),
        state = columnState
    ) {
        items(AvatarPart.values()) { avatarPart ->
            SheetDescription(text = stringResource(id = avatarPart.label))
            LazyRow(
                contentPadding = PaddingValues(
                    start = 16.dp,
                    end = 16.dp,
                    bottom = 8.dp
                ),
                horizontalArrangement = Arrangement.spacedBy(16.dp)
            ) {
                items(avatarPart.getAvatarResources()) { resource ->
                    Box {
                        AvatarPartIcon(
                            drawableRes = resource.partResource(),
                            contentDescription = resource.resourceKey(),
                            selected = state.getSelectedAvatarPartIcon(avatarPart) == resource.partResource()
                        ) {
                            actor(Action.ChangeAvatarPart(resource))
                        }
                    }
                }
            }
        }
    }
}

@Composable
fun SheetDescription(text: String) {
    Text(
        text = text,
        style = MaterialTheme.typography.subtitle1,
        color = NotionTheme.colors.textSecondary,
        modifier = Modifier
            .padding(horizontal = 16.dp)
            .padding(top = 16.dp, bottom = 8.dp)
    )
}