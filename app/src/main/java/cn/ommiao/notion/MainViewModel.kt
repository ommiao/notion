package cn.ommiao.notion

import androidx.annotation.DrawableRes
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import cn.ommiao.notion.model.*
import cn.ommiao.notion.ui.theme.NotionTheme

sealed class Action {
    object ChangeTheme : Action()
    object RandomAvatar : Action()
    data class ChangeAvatarPart(val resource: AbstractAvatarResource) : Action()
}

class MainViewModel : ViewModel() {

    val state: State = State()

    fun dispatch(action: Action) {
        when (action) {
            Action.ChangeTheme -> changeTheme()
            Action.RandomAvatar -> randomAvatar()
            is Action.ChangeAvatarPart -> changeAvatarResource(action.resource)
        }
    }

    private fun randomAvatar() {
        state.face = Face.values().toMutableList().apply { shuffle() }.first()
        state.nose = Nose.values().toMutableList().apply { shuffle() }.first()
        state.mouth = Mouth.values().toMutableList().apply { shuffle() }.first()
        state.eyes = Eyes.values().toMutableList().apply { shuffle() }.first()
        state.eyebrows = Eyebrows.values().toMutableList().apply { shuffle() }.first()
        state.hair = Hair.values().toMutableList().apply { shuffle() }.first()
        state.glasses = Glasses.values().first()
        state.beard = Beard.values().first()
        state.accessories = Accessories.values().first()
        state.details = Details.values().first()
        state.festival = Festival.values().first()
    }

    private fun changeAvatarResource(resource: AbstractAvatarResource) {
        when (resource.part()) {
            AvatarPart.AVATAR_PART_FACE -> state.face = resource as Face
            AvatarPart.AVATAR_PART_NOSE -> state.nose = resource as Nose
            AvatarPart.AVATAR_PART_MOUTH -> state.mouth = resource as Mouth
            AvatarPart.AVATAR_PART_EYES -> state.eyes = resource as Eyes
            AvatarPart.AVATAR_PART_EYEBROWS -> state.eyebrows = resource as Eyebrows
            AvatarPart.AVATAR_PART_HAIR -> state.hair = resource as Hair
            AvatarPart.AVATAR_PART_GLASSES -> state.glasses = resource as Glasses
            AvatarPart.AVATAR_PART_BEARD -> state.beard = resource as Beard
            AvatarPart.AVATAR_PART_ACCESSORIES -> state.accessories = resource as Accessories
            AvatarPart.AVATAR_PART_DETAILS -> state.details = resource as Details
            AvatarPart.AVATAR_PART_FESTIVAL -> state.festival = resource as Festival
        }
    }

    private fun changeTheme() {
        state.theme = when (state.theme) {
            NotionTheme.Theme.Light -> NotionTheme.Theme.Dark
            NotionTheme.Theme.Dark -> NotionTheme.Theme.Light
        }
    }


    inner class State {
        var theme: NotionTheme.Theme by mutableStateOf(NotionTheme.Theme.Light)
        var face by mutableStateOf(Face.FACE_0)
        var nose by mutableStateOf(Nose.NOSE_0)
        var mouth by mutableStateOf(Mouth.MOUTH_0)
        var eyes by mutableStateOf(Eyes.EYES_0)
        var eyebrows by mutableStateOf(Eyebrows.EYEBROWS_0)
        var hair by mutableStateOf(Hair.HAIR_1)
        var glasses by mutableStateOf(Glasses.GLASSES_0)
        var beard by mutableStateOf(Beard.BEARD_0)
        var accessories by mutableStateOf(Accessories.ACCESSORIES_0)
        var details by mutableStateOf(Details.DETAILS_0)
        var festival by mutableStateOf(Festival.HALLOWEEN_0)

        @DrawableRes
        fun getSelectedAvatarPartIcon(avatarPart: AvatarPart): Int {
            return when (avatarPart) {
                AvatarPart.AVATAR_PART_FACE -> face.part
                AvatarPart.AVATAR_PART_NOSE -> nose.part
                AvatarPart.AVATAR_PART_MOUTH -> mouth.part
                AvatarPart.AVATAR_PART_EYES -> eyes.part
                AvatarPart.AVATAR_PART_EYEBROWS -> eyebrows.part
                AvatarPart.AVATAR_PART_HAIR -> hair.part
                AvatarPart.AVATAR_PART_GLASSES -> glasses.part
                AvatarPart.AVATAR_PART_BEARD -> beard.part
                AvatarPart.AVATAR_PART_ACCESSORIES -> accessories.part
                AvatarPart.AVATAR_PART_DETAILS -> details.part
                AvatarPart.AVATAR_PART_FESTIVAL -> festival.part
            }
        }

        @DrawableRes
        fun getSelectedAvatarPreviewIcon(avatarPart: AvatarPart): Int {
            return when (avatarPart) {
                AvatarPart.AVATAR_PART_FACE -> face.preview
                AvatarPart.AVATAR_PART_NOSE -> nose.preview
                AvatarPart.AVATAR_PART_MOUTH -> mouth.preview
                AvatarPart.AVATAR_PART_EYES -> eyes.preview
                AvatarPart.AVATAR_PART_EYEBROWS -> eyebrows.preview
                AvatarPart.AVATAR_PART_HAIR -> hair.preview
                AvatarPart.AVATAR_PART_GLASSES -> glasses.preview
                AvatarPart.AVATAR_PART_BEARD -> beard.preview
                AvatarPart.AVATAR_PART_ACCESSORIES -> accessories.preview
                AvatarPart.AVATAR_PART_DETAILS -> details.preview
                AvatarPart.AVATAR_PART_FESTIVAL -> festival.preview
            }
        }
    }
}
