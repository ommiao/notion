package cn.ommiao.notion.model

import androidx.annotation.DrawableRes
import cn.ommiao.notion.R

enum class Festival(@DrawableRes val part: Int, @DrawableRes val preview: Int) :
    AbstractAvatarResource {

    HALLOWEEN_0(R.drawable.ic_empty, R.drawable.ic_empty),
    HALLOWEEN_1(R.drawable.halloween_part_1, R.drawable.halloween_preview_1),
    HALLOWEEN_2(R.drawable.halloween_part_2, R.drawable.halloween_preview_2),
    HALLOWEEN_3(R.drawable.halloween_part_3, R.drawable.halloween_preview_3),
    HALLOWEEN_4(R.drawable.halloween_part_4, R.drawable.halloween_preview_4),
    HALLOWEEN_5(R.drawable.halloween_part_5, R.drawable.halloween_preview_5),
    ;

    override fun part() = AvatarPart.AVATAR_PART_FESTIVAL
    override fun resourceKey() = name
    override fun partResource() = part
    override fun previewResource() = preview
}