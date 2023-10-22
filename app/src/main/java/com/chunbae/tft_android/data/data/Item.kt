package com.chunbae.tft_android.data.data

data class Item (
    val name : String,
    val thumbNail : String,
    val itemType : EquipItemType, // 두 개 이상의 특성을 동시에 가질 수 없으므로 List가 아니다.
    val itemStat : UnitStat, // 이 아이템이 직접적으로 올려주는 유닛의 스텟이다.
    val itemEffect : List<ItemEffectType> // 한 아이템이 두 가지 이상의 기능을 할 수 있으므로 List로 설정했다. ex) 방어력, 마법저항력 증가 / 공격력과 체력 증가 등
)

enum class EquipItemType() { // 유닛이 착용 가능한 아이템의 종류
    HALF, // 재료 아이템 2개를 조합해 완성 아이템 1개를 만드는 형식이므로, half 와 full로 표기하는게 좋을 것 같다고 생각했다.
    FULL,
    RELIC, // 오른의 유물 아이템
    BRILLIANT, // 찬란한 아이템
    SUPPORT //지원 아이템
}

enum class ItemEffectType() {
    DAMAGE_AP,
    DAMAGE_AD,
    HEAL,
    SHIELD,
    RAISE_DEFENCE,
    RAISE_ANTI_MAGIC,
    REDUCE_DAMAGE, // 받는 피해 감소
    REDUCE_AS, // 공격 속도 감소
    AIRBORNE,
    MANA_REGEN,
    MANA_BURN
}