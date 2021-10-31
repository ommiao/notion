package cn.ommiao.notion.model

import androidx.annotation.DrawableRes
import cn.ommiao.notion.R

enum class Nose(@DrawableRes val part: Int, @DrawableRes val preview: Int) :
    AbstractAvatarResource {

    NOSE_0(R.drawable.nose_part_0, R.drawable.nose_preview_0),
    NOSE_1(R.drawable.nose_part_1, R.drawable.nose_preview_1),
    NOSE_2(R.drawable.nose_part_2, R.drawable.nose_preview_2),
    NOSE_3(R.drawable.nose_part_3, R.drawable.nose_preview_3),
    NOSE_4(R.drawable.nose_part_4, R.drawable.nose_preview_4),
    NOSE_5(R.drawable.nose_part_5, R.drawable.nose_preview_5),
    NOSE_6(R.drawable.nose_part_6, R.drawable.nose_preview_6),
    NOSE_7(R.drawable.nose_part_7, R.drawable.nose_preview_7),
    NOSE_8(R.drawable.nose_part_8, R.drawable.nose_preview_8),
    NOSE_9(R.drawable.nose_part_9, R.drawable.nose_preview_9),
    NOSE_10(R.drawable.nose_part_10, R.drawable.nose_preview_10),
    ;

    override fun part() = AvatarPart.AVATAR_PART_NOSE
    override fun resourceKey() = name
    override fun partResource() = part
    override fun previewResource() = preview
}