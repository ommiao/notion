package cn.ommiao.notion.model

import androidx.annotation.DrawableRes
import cn.ommiao.notion.R

enum class Hair(@DrawableRes val part: Int, @DrawableRes val preview: Int) :
    AbstractAvatarResource {

    HAIR_0(R.drawable.ic_empty, R.drawable.ic_empty),
    HAIR_1(R.drawable.hair_part_1, R.drawable.hair_preview_1),
    HAIR_2(R.drawable.hair_part_2, R.drawable.hair_preview_2),
    HAIR_3(R.drawable.hair_part_3, R.drawable.hair_preview_3),
    HAIR_4(R.drawable.hair_part_4, R.drawable.hair_preview_4),
    HAIR_5(R.drawable.hair_part_5, R.drawable.hair_preview_5),
    HAIR_6(R.drawable.hair_part_6, R.drawable.hair_preview_6),
    HAIR_7(R.drawable.hair_part_7, R.drawable.hair_preview_7),
    HAIR_8(R.drawable.hair_part_8, R.drawable.hair_preview_8),
    HAIR_9(R.drawable.hair_part_9, R.drawable.hair_preview_9),
    HAIR_10(R.drawable.hair_part_10, R.drawable.hair_preview_10),
    HAIR_11(R.drawable.hair_part_11, R.drawable.hair_preview_11),
    HAIR_12(R.drawable.hair_part_12, R.drawable.hair_preview_12),
    HAIR_13(R.drawable.hair_part_13, R.drawable.hair_preview_13),
    HAIR_14(R.drawable.hair_part_14, R.drawable.hair_preview_14),
    HAIR_15(R.drawable.hair_part_15, R.drawable.hair_preview_15),
    HAIR_16(R.drawable.hair_part_16, R.drawable.hair_preview_16),
    HAIR_17(R.drawable.hair_part_17, R.drawable.hair_preview_17),
    HAIR_18(R.drawable.hair_part_18, R.drawable.hair_preview_18),
    HAIR_19(R.drawable.hair_part_19, R.drawable.hair_preview_19),
    HAIR_20(R.drawable.hair_part_20, R.drawable.hair_preview_20),
    HAIR_21(R.drawable.hair_part_21, R.drawable.hair_preview_21),
    HAIR_22(R.drawable.hair_part_22, R.drawable.hair_preview_22),
    HAIR_23(R.drawable.hair_part_23, R.drawable.hair_preview_23),
    HAIR_24(R.drawable.hair_part_24, R.drawable.hair_preview_24),
    HAIR_25(R.drawable.hair_part_25, R.drawable.hair_preview_25),
    HAIR_26(R.drawable.hair_part_26, R.drawable.hair_preview_26),
    HAIR_27(R.drawable.hair_part_27, R.drawable.hair_preview_27),
    HAIR_28(R.drawable.hair_part_28, R.drawable.hair_preview_28),
    HAIR_29(R.drawable.hair_part_29, R.drawable.hair_preview_29),
    HAIR_30(R.drawable.hair_part_30, R.drawable.hair_preview_30),
    ;

    override fun part() = AvatarPart.AVATAR_PART_HAIR
    override fun resourceKey() = name
    override fun partResource() = part
    override fun previewResource() = preview
}