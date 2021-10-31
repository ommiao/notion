package cn.ommiao.notion.model

import androidx.annotation.DrawableRes
import cn.ommiao.notion.R

enum class Glasses(@DrawableRes val part: Int, @DrawableRes val preview: Int) :
    AbstractAvatarResource {

    GLASSES_0(R.drawable.ic_empty, R.drawable.ic_empty),
    GLASSES_1(R.drawable.glasses_part_1, R.drawable.glasses_preview_1),
    GLASSES_2(R.drawable.glasses_part_2, R.drawable.glasses_preview_2),
    GLASSES_3(R.drawable.glasses_part_3, R.drawable.glasses_preview_3),
    GLASSES_4(R.drawable.glasses_part_4, R.drawable.glasses_preview_4),
    GLASSES_5(R.drawable.glasses_part_5, R.drawable.glasses_preview_5),
    GLASSES_6(R.drawable.glasses_part_6, R.drawable.glasses_preview_6),
    GLASSES_7(R.drawable.glasses_part_7, R.drawable.glasses_preview_7),
    GLASSES_8(R.drawable.glasses_part_8, R.drawable.glasses_preview_8),
    GLASSES_9(R.drawable.glasses_part_9, R.drawable.glasses_preview_9),
    GLASSES_10(R.drawable.glasses_part_10, R.drawable.glasses_preview_10),
    ;

    override fun part() = AvatarPart.AVATAR_PART_GLASSES
    override fun resourceKey() = name
    override fun partResource() = part
    override fun previewResource() = preview
}