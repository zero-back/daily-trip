package com.dailytrip.rooms.domain

class Facilities private constructor(
    val id: Long,
    name: String,
    iconImageUrl: String? = null,
) {

    companion object {
        fun create(id: Long, name: String, iconImageUrl: String?) = Facilities(
            id = id,
            name = name,
            iconImageUrl = iconImageUrl,
        )
    }

    var name: String = name
        private set

    var iconImageUrl: String? = iconImageUrl
        private set

}