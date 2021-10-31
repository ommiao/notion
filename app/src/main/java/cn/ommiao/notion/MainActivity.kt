package cn.ommiao.notion

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.SideEffect
import androidx.compose.runtime.compositionLocalOf
import androidx.compose.ui.graphics.Color
import androidx.core.view.WindowCompat
import androidx.lifecycle.viewmodel.compose.viewModel
import cn.ommiao.notion.ui.NotionScreen
import cn.ommiao.notion.ui.theme.NotionTheme
import com.google.accompanist.systemuicontroller.rememberSystemUiController

val LocalState = compositionLocalOf<MainViewModel.State> { error("not provide") }
val LocalActor = compositionLocalOf<(Action) -> Unit> { error("not provide") }

class MainActivity : ComponentActivity() {

    @OptIn(ExperimentalMaterialApi::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        WindowCompat.setDecorFitsSystemWindows(window, false)
        setContent {
            val viewModel: MainViewModel = viewModel()
            val state = viewModel.state
            val actor = viewModel::dispatch
            CompositionLocalProvider(
                LocalState provides viewModel.state,
                LocalActor provides actor
            ) {
                NotionTheme(theme = state.theme) {
                    SystemUiController()
                    NotionScreen()
                }
            }
        }
    }

    @Composable
    private fun SystemUiController() {
        val systemUiController = rememberSystemUiController()
        val darkIcons = NotionTheme.theme == NotionTheme.Theme.Light
        SideEffect {
            systemUiController.setStatusBarColor(color = Color.Transparent, darkIcons = darkIcons)
        }
    }
}