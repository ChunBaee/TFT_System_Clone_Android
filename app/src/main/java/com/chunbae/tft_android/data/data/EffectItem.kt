package com.chunbae.tft_android.data.data

data class EffectItem(
    val name : String,
    val thumbNail : String,
    val type : EffectItemType
)

enum class EffectItemType() {
    COPY_UNDER_3_COST_UNIT, // 하급 챔피언 복제기
    COPY_UNIT, // 챔피언 복제기
    REMOVE_EQUIP_ITEM,
    ROLL_ITEM
}
