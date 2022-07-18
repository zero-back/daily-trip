package com.dailytrip.rooms.domain

class Room private constructor(
    val id: Long,
    type: Type,
    name: String,
    standardPersonnel: Int = 2,
    maximumPersonnel: Int = 2,
    minimumStay: Int = 1,
    facilities: List<Facilities>,
    images: List<Image>,
    price: Long,
    content: String? = null,
) {

    companion object {
        fun create(
            id: Long,
            type: Type,
            name: String,
            standardPersonnel: Int,
            maximumPersonnel: Int,
            minimumStay: Int,
            facilities: List<Facilities>,
            images: List<Image>,
            price: Long,
            content: String?,
        ) = Room(
            id = id,
            type = type,
            name = name,
            standardPersonnel = standardPersonnel,
            maximumPersonnel = maximumPersonnel,
            minimumStay = minimumStay,
            facilities = facilities,
            images = images,
            price = price,
            content = content,
        )
    }

    var type = type
        private set

    var name = name
        private set

    var standardPersonnel = standardPersonnel
        private set

    var maximumPersonnel = maximumPersonnel
        private set

    var minimumStay = minimumStay
        private set

    var facilities = facilities
        private set

    var images = images
        private set

    var price = price
        private set

    var content = content
        private set

    fun changeType(type: Type) {
        this.type = type
    }

    fun changeName(name: String) {
        this.name = name
    }

    fun changeStandardPersonnel(standardPersonnel: Int) {
        this.standardPersonnel = standardPersonnel
    }

    fun changeMaximumPersonnel(maximumPersonnel: Int) {
        this.maximumPersonnel = maximumPersonnel
    }

    fun changeMinimumStay(minimumStay: Int) {
        this.minimumStay = minimumStay
    }

    fun changeFacilities(facilities: List<Facilities>) {
        this.facilities = facilities
    }

    fun changeImages(images: List<Image>) {
        this.images = images
    }

    fun changePrice(price: Long) {
        this.price = price
    }

    fun changeContent(content: String?) {
        this.content = content
    }

}