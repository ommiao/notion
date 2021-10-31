package cn.ommiao.notion.model

import androidx.annotation.DrawableRes
import cn.ommiao.notion.R

enum class Accessories(@DrawableRes val part: Int, @DrawableRes val preview: Int) :
    AbstractAvatarResource {

    ACCESSORIES_0(R.drawable.ic_empty, R.drawable.ic_empty),
    ACCESSORIES_1(R.drawable.accessories_part_1, R.drawable.accessories_preview_1),
    ACCESSORIES_2(R.drawable.accessories_part_2, R.drawable.accessories_preview_2),
    ACCESSORIES_3(R.drawable.accessories_part_3, R.drawable.accessories_preview_3),
    ACCESSORIES_4(R.drawable.accessories_part_4, R.drawable.accessories_preview_4),
    ACCESSORIES_5(R.drawable.accessories_part_5, R.drawable.accessories_preview_5),
    ACCESSORIES_6(R.drawable.accessories_part_6, R.drawable.accessories_preview_6),
    ACCESSORIES_7(R.drawable.accessories_part_7, R.drawable.accessories_preview_7),
    ACCESSORIES_8(R.drawable.accessories_part_8, R.drawable.accessories_preview_8),
    ACCESSORIES_9(R.drawable.accessories_part_9, R.drawable.accessories_preview_9),
    ACCESSORIES_10(R.drawable.accessories_part_10, R.drawable.accessories_preview_10),
    ;

    override fun part() = AvatarPart.AVATAR_PART_ACCESSORIES
    override fun resourceKey() = name
    override fun partResource() = part
    override fun previewResource() = preview
}