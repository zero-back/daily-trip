package com.dailytrip.rooms.domain

enum class Type(val title: String) {
    WOMEN_DORMITORY("여성 토미토리"),
    MAN_DORMITORY("남성 도미토리"),
    MIX_DORMITORY("혼성 도미토리"),
    SINGLE_ROOM("1인실"),
    DOUBLE_ROOM("2인실"),
    FAMILY_ROOM("3인이상 가족룸"),
    WHOLE_HOUSE("집 전체"),
}