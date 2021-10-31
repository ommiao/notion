package cn.ommiao.notion.model

import androidx.annotation.DrawableRes
import cn.ommiao.notion.R

enum class Eyes(@DrawableRes val part: Int, @DrawableRes val preview: Int) :
    AbstractAvatarResource {

    EYES_0(R.drawable.eyes_part_0, R.drawable.eyes_preview_0),
    EYES_1(R.drawable.eyes_part_1, R.drawable.eyes_preview_1),
    EYES_2(R.drawable.eyes_part_2, R.drawable.eyes_preview_2),
    EYES_3(R.drawable.eyes_part_3, R.drawable.eyes_preview_3),
    EYES_4(R.drawable.eyes_part_4, R.drawable.eyes_preview_4),
    EYES_5(R.drawable.eyes_part_5, R.drawable.eyes_preview_5),
    EYES_6(R.drawable.eyes_part_6, R.drawable.eyes_preview_6),
    EYES_7(R.drawable.eyes_part_7, R.drawable.eyes_preview_7),
    EYES_8(R.drawable.eyes_part_8, R.drawable.eyes_preview_8),
    EYES_9(R.drawable.eyes_part_9, R.drawable.eyes_preview_9),
    EYES_10(R.drawable.eyes_part_10, R.drawable.eyes_preview_10),
    ;

    override fun part() = AvatarPart.AVATAR_PART_EYES
    override fun resourceKey() = name
    override fun partResource() = part
    override fun previewResource() = preview
}