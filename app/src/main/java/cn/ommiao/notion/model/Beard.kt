package cn.ommiao.notion.model

import androidx.annotation.DrawableRes
import cn.ommiao.notion.R

enum class Beard(@DrawableRes val part: Int, @DrawableRes val preview: Int) :
    AbstractAvatarResource {

    BEARD_0(R.drawable.ic_empty, R.drawable.ic_empty),
    BEARD_1(R.drawable.beard_part_1, R.drawable.beard_preview_1),
    BEARD_2(R.drawable.beard_part_2, R.drawable.beard_preview_2),
    BEARD_3(R.drawable.beard_part_3, R.drawable.beard_preview_3),
    BEARD_4(R.drawable.beard_part_4, R.drawable.beard_preview_4),
    BEARD_5(R.drawable.beard_part_5, R.drawable.beard_preview_5),
    BEARD_6(R.drawable.beard_part_6, R.drawable.beard_preview_6),
    BEARD_7(R.drawable.beard_part_7, R.drawable.beard_preview_7),
    BEARD_8(R.drawable.beard_part_8, R.drawable.beard_preview_8),
    BEARD_9(R.drawable.beard_part_9, R.drawable.beard_preview_9),
    BEARD_10(R.drawable.beard_part_10, R.drawable.beard_preview_10),
    ;

    override fun part() = AvatarPart.AVATAR_PART_BEARD
    override fun resourceKey() = name
    override fun partResource() = part
    override fun previewResource() = preview
}