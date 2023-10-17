package com.chunbae.tft_android.data.data

data class FieldElement(
    val unit : Unit?, // 기물 정보 -> 칸이 비어있을때를 대비해 Optional 설정을 했다.
    val effectByAugment : Boolean, // 증강체에 의해 영향을 받는 칸인지를 나타낸다.
    val effectByItem : Boolean, // 아이템에 의해 영향을 받는 칸인지를 나타낸다.
    val effectItem : Item? // 영향을 주는 아이템이 없을 때를 대비해 Optional 설정을 했다.
)
