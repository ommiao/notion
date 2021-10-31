package cn.ommiao.notion.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import cn.ommiao.notion.R

interface AbstractAvatarResource {
    fun part(): AvatarPart

    fun resourceKey(): String

    @DrawableRes
    fun partResource(): Int

    @DrawableRes
    fun previewResource(): Int
}

enum class AvatarPart(@StringRes val label: Int) {

    AVATAR_PART_FACE(R.string.avatar_part_face),
    AVATAR_PART_NOSE(R.string.avatar_part_nose),
    AVATAR_PART_MOUTH(R.string.avatar_part_mouth),
    AVATAR_PART_EYES(R.string.avatar_part_eyes),
    AVATAR_PART_EYEBROWS(R.string.avatar_part_eyebrows),
    AVATAR_PART_HAIR(R.string.avatar_part_hair),
    AVATAR_PART_GLASSES(R.string.avatar_part_glasses),
    AVATAR_PART_BEARD(R.string.avatar_part_beard),
    AVATAR_PART_ACCESSORIES(R.string.avatar_part_accessories),
    AVATAR_PART_DETAILS(R.string.avatar_part_details),
    AVATAR_PART_FESTIVAL(R.string.avatar_part_festival),

    ;

    fun getAvatarResources(): Array<out AbstractAvatarResource> {
        return when (this) {
            AVATAR_PART_FACE -> Face.values()
            AVATAR_PART_NOSE -> Nose.values()
            AVATAR_PART_MOUTH -> Mouth.values()
            AVATAR_PART_EYES -> Eyes.values()
            AVATAR_PART_EYEBROWS -> Eyebrows.values()
            AVATAR_PART_HAIR -> Hair.values()
            AVATAR_PART_GLASSES -> Glasses.values()
            AVATAR_PART_BEARD -> Beard.values()
            AVATAR_PART_ACCESSORIES -> Accessories.values()
            AVATAR_PART_DETAILS -> Details.values()
            AVATAR_PART_FESTIVAL -> Festival.values()
        }
    }

}