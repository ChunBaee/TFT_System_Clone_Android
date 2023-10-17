package com.chunbae.tft_android.data.data

data class Unit(
    val name : String,
    val unitCost : Int,
    val unitStatus : UnitStatus, // 유닛의 현재 상태이다. 걸어가는 중인지, CC를 당했는지 등의 상태!
    val thumbNail : String, // 유닛의 초상화 이미지이며, 서버를 통한 ImagePath를 예상하여 String으로 선언했다.
    val model : String, // 유닛의 모델링을 가정한 이미지이며, 역시 서버를 통한 ImagePath를 예상해 String으로 선언했다.
    val trait : List<Trait>, // 특성 시너지이다. 각 유닛이 최소 2개 최대 3개를 가지므로 List로 선언했다.
    val rate : Int, // 현재 유닛의 별 등급이다.
    val hp : Int,
    val mp : Int,
    val defaultMp : Int, // 가끔 전투 시작시부터 마나를 들고 시작하기도 하며, 시작 마나에 직접적인 연관을 주는 아이템이 있으므로 따로 선언했다.
    val attackDamage : Int,
    val abilityPower : Int,
    val defence : Int,
    val antiMagic : Int,
    val attackSpeed : Int,
    val moveSpeed : Int,
    val attackRange : Int,
    val passiveSkill : Skill,
    val activeSkill : Skill,
    val equipItem : List<Item> // 하나의 유닛은 아이템을 총 3개까지 장착할 수 있으므로 List로 선언했다.
)

enum class UnitStatus() {
    STAND,
    MOVE,
    CROWN_CONTROL,
    PROVOKE,
    DEAD,
    READY_REVIVE // 특정 유닛의 경우 부활하기도 한다.
}
