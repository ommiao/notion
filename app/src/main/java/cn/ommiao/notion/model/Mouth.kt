package cn.ommiao.notion.model

import androidx.annotation.DrawableRes
import cn.ommiao.notion.R

enum class Mouth(@DrawableRes val part: Int, @DrawableRes val preview: Int) :
    AbstractAvatarResource {

    MOUTH_0(R.drawable.mouth_part_0, R.drawable.mouth_preview_0),
    MOUTH_1(R.drawable.mouth_part_1, R.drawable.mouth_preview_1),
    MOUTH_2(R.drawable.mouth_part_2, R.drawable.mouth_preview_2),
    MOUTH_3(R.drawable.mouth_part_3, R.drawable.mouth_preview_3),
    MOUTH_4(R.drawable.mouth_part_4, R.drawable.mouth_preview_4),
    MOUTH_5(R.drawable.mouth_part_5, R.drawable.mouth_preview_5),
    MOUTH_6(R.drawable.mouth_part_6, R.drawable.mouth_preview_6),
    MOUTH_7(R.drawable.mouth_part_7, R.drawable.mouth_preview_7),
    MOUTH_8(R.drawable.mouth_part_8, R.drawable.mouth_preview_8),
    MOUTH_9(R.drawable.mouth_part_9, R.drawable.mouth_preview_9),
    MOUTH_10(R.drawable.mouth_part_10, R.drawable.mouth_preview_10),
    ;

    override fun part() = AvatarPart.AVATAR_PART_MOUTH
    override fun resourceKey() = name
    override fun partResource() = part
    override fun previewResource() = preview
}