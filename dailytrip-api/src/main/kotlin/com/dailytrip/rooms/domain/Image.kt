package com.dailytrip.rooms.domain

class Image private constructor(
    val id:Long,
    val priority:Long,
    val imageUrl:String,
){

    companion object {
        fun create(id: Long, priority: Long, imageUrl: String) = Image(
            id = id,
            priority = priority,
            imageUrl = imageUrl,
        )
    }

}