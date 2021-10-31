package cn.ommiao.notion.model

import androidx.annotation.DrawableRes
import cn.ommiao.notion.R

enum class Details(@DrawableRes val part: Int, @DrawableRes val preview: Int) :
    AbstractAvatarResource {

    DETAILS_0(R.drawable.ic_empty, R.drawable.ic_empty),
    DETAILS_1(R.drawable.details_part_1, R.drawable.details_preview_1),
    DETAILS_2(R.drawable.details_part_2, R.drawable.details_preview_2),
    DETAILS_3(R.drawable.details_part_3, R.drawable.details_preview_3),
    DETAILS_4(R.drawable.details_part_4, R.drawable.details_preview_4),
    DETAILS_5(R.drawable.details_part_5, R.drawable.details_preview_5),
    DETAILS_6(R.drawable.details_part_6, R.drawable.details_preview_6),
    DETAILS_7(R.drawable.details_part_7, R.drawable.details_preview_7),
    DETAILS_8(R.drawable.details_part_8, R.drawable.details_preview_8),
    DETAILS_9(R.drawable.details_part_9, R.drawable.details_preview_9),
    DETAILS_10(R.drawable.details_part_10, R.drawable.details_preview_10),
    ;

    override fun part() = AvatarPart.AVATAR_PART_DETAILS
    override fun resourceKey() = name
    override fun partResource() = part
    override fun previewResource() = preview
}