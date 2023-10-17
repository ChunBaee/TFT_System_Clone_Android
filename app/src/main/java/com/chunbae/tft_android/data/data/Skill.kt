package com.chunbae.tft_android.data.data

data class Skill(
    val name : String,
    val thumbNail : String, // 스킬에도 아이콘 이미지가 존재한다!
    val type : List<SkillType>, // 스킬이 여러가지 타입일 수 있으므로 List로 선언했다.
    val skillRange : Int?, // 스킬 범위
    val skillTarget : Unit? // 특정 유닛 타겟일 경우를 대비 ex) 체력이 가장 낮은 아군
    val damageType : List<DamageType> // 데미지 타입이 복합적일수도 있으므로 List로 선언했다.
)

enum class SkillType() {
    DAMAGE,
    SHIELD,
    HEAL,
    AIRBORNE,
    STUN,
    PROVOKE, //도발
    SLOW_MOVE,
    SLOW_ATTACK_SPEED,
    GAIN_HP,
    MOVE,
    CROWD_CONTROL_IMMUNE // 군중 제어 무시, 흔히 CC면역이라고 한다.
}

enum class DamageType() {
    ATTACK,
    ABILITY,
    TRUE_DAMAGE
}
