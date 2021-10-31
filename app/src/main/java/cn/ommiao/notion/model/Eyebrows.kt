package cn.ommiao.notion.model

import androidx.annotation.DrawableRes
import cn.ommiao.notion.R

enum class Eyebrows(@DrawableRes val part: Int, @DrawableRes val preview: Int) :
    AbstractAvatarResource {

    EYEBROWS_0(R.drawable.eyebrows_part_0, R.drawable.eyebrows_preview_0),
    EYEBROWS_1(R.drawable.eyebrows_part_1, R.drawable.eyebrows_preview_1),
    EYEBROWS_2(R.drawable.eyebrows_part_2, R.drawable.eyebrows_preview_2),
    EYEBROWS_3(R.drawable.eyebrows_part_3, R.drawable.eyebrows_preview_3),
    EYEBROWS_4(R.drawable.eyebrows_part_4, R.drawable.eyebrows_preview_4),
    EYEBROWS_5(R.drawable.eyebrows_part_5, R.drawable.eyebrows_preview_5),
    EYEBROWS_6(R.drawable.eyebrows_part_6, R.drawable.eyebrows_preview_6),
    EYEBROWS_7(R.drawable.eyebrows_part_7, R.drawable.eyebrows_preview_7),
    EYEBROWS_8(R.drawable.eyebrows_part_8, R.drawable.eyebrows_preview_8),
    EYEBROWS_9(R.drawable.eyebrows_part_9, R.drawable.eyebrows_preview_9),
    EYEBROWS_10(R.drawable.eyebrows_part_10, R.drawable.eyebrows_preview_10),
    ;

    override fun part() = AvatarPart.AVATAR_PART_EYEBROWS
    override fun resourceKey() = name
    override fun partResource() = part
    override fun previewResource() = preview
}