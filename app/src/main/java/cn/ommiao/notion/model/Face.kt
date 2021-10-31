package cn.ommiao.notion.model

import androidx.annotation.DrawableRes
import cn.ommiao.notion.R

enum class Face(@DrawableRes val part: Int, @DrawableRes val preview: Int) :
    AbstractAvatarResource {

    FACE_0(R.drawable.face_part_0, R.drawable.face_preview_0),
    FACE_1(R.drawable.face_part_1, R.drawable.face_preview_1),
    FACE_2(R.drawable.face_part_2, R.drawable.face_preview_2),
    FACE_3(R.drawable.face_part_3, R.drawable.face_preview_3),
    FACE_4(R.drawable.face_part_4, R.drawable.face_preview_4),
    FACE_5(R.drawable.face_part_5, R.drawable.face_preview_5),
    FACE_6(R.drawable.face_part_6, R.drawable.face_preview_6),
    FACE_7(R.drawable.face_part_7, R.drawable.face_preview_7),
    FACE_8(R.drawable.face_part_8, R.drawable.face_preview_8),
    FACE_9(R.drawable.face_part_9, R.drawable.face_preview_9),
    FACE_10(R.drawable.face_part_10, R.drawable.face_preview_10),
    ;

    override fun part() = AvatarPart.AVATAR_PART_FACE
    override fun resourceKey() = name
    override fun partResource() = part
    override fun previewResource() = preview
}