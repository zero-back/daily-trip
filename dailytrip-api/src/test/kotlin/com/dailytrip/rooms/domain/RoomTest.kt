package com.dailytrip.rooms.domain

import io.kotest.matchers.shouldBe
import org.junit.jupiter.api.Test

class RoomTest {

    @Test
    fun `방 등록`() {
        val expectedId = 1L
        val expectedType = Type.SINGLE_ROOM
        val expectedName = "O-PEACE 제주 (오피스제주)"
        val expectedStandardPersonnel = 2
        val expectedMaximumPersonnel = 2
        val expectedMinimumStay = 1
        val expectedFacilities = listOf(
            Facilities.create(1, "전용 화장실", "toilet-url"),
            Facilities.create(1, "전용 욕실", "bathroom-url"),
            Facilities.create(1, "TV", "tv-url"),
        )
        val expectedImages = listOf(
            Image.create(1, 1L, "imageUrl-1"),
            Image.create(2, 2L, "imageUrl-2"),
            Image.create(3, 3L, "imageUrl-2"),
        )
        val expectedPrice = 150_000L
        val expectedContent = "[✨객실소개] 뷰 최고입니다 :)"

        val newRoom = FixtureRoom.aRoom(content = expectedContent)

        newRoom.id shouldBe expectedId
        newRoom.type shouldBe expectedType
        newRoom.name shouldBe expectedName
        newRoom.standardPersonnel shouldBe expectedStandardPersonnel
        newRoom.maximumPersonnel shouldBe expectedMaximumPersonnel
        newRoom.minimumStay shouldBe expectedMinimumStay
        newRoom.facilities.size shouldBe 3
        newRoom.facilities[0].name shouldBe expectedFacilities[0].name
        newRoom.facilities[1].name shouldBe expectedFacilities[1].name
        newRoom.facilities[2].name shouldBe expectedFacilities[2].name
        newRoom.images.size shouldBe 3
        newRoom.images[0].imageUrl shouldBe expectedImages[0].imageUrl
        newRoom.images[1].imageUrl shouldBe expectedImages[1].imageUrl
        newRoom.images[2].imageUrl shouldBe expectedImages[2].imageUrl
        newRoom.price shouldBe expectedPrice
        newRoom.content shouldBe expectedContent
    }

    @Test
    fun `타입 변경`() {
        val expectedType = Type.DOUBLE_ROOM
        val newRoom = FixtureRoom.aRoom()
        newRoom.changeType(expectedType)
        newRoom.type shouldBe expectedType
    }

    @Test
    fun `이름 변경`() {
        val expectedName = "가평 하늘숲펜션"
        val newRoom = FixtureRoom.aRoom()
        newRoom.changeName(expectedName)
        newRoom.name shouldBe expectedName
    }

    @Test
    fun `기준 인원 변경`() {
        val expectedStandardPersonnel = 4
        val newRoom = FixtureRoom.aRoom()
        newRoom.changeStandardPersonnel(expectedStandardPersonnel)
        newRoom.standardPersonnel shouldBe expectedStandardPersonnel
    }

    @Test
    fun `최대 인원 변경`() {
        val expectedMaximumPersonnel = 6
        val newRoom = FixtureRoom.aRoom()
        newRoom.changeMaximumPersonnel(expectedMaximumPersonnel)
        newRoom.maximumPersonnel shouldBe expectedMaximumPersonnel
    }

    @Test
    fun `최소 예약일 변경`() {
        val expectedMinimumStay = 2
        val newRoom = FixtureRoom.aRoom()
        newRoom.changeMinimumStay(expectedMinimumStay)
        newRoom.maximumPersonnel shouldBe expectedMinimumStay
    }

    @Test
    fun `편의시실 변경`() {
        val expectedFacilities = listOf(
            Facilities.create(4, "에어컨", "airConditioner-url"),
            Facilities.create(5, "테이블", "table-url"),
        )
        val newRoom = FixtureRoom.aRoom()
        newRoom.changeFacilities(expectedFacilities)
        newRoom.facilities.size shouldBe expectedFacilities.size
        newRoom.facilities[0].name shouldBe expectedFacilities[0].name
        newRoom.facilities[0].iconImageUrl shouldBe expectedFacilities[0].iconImageUrl
        newRoom.facilities[1].name shouldBe expectedFacilities[1].name
        newRoom.facilities[1].iconImageUrl shouldBe expectedFacilities[1].iconImageUrl
    }

    @Test
    fun `이미지 변경`() {
        val expectedImages = listOf(
            Image.create(4, 1L, "imageUrl-4"),
            Image.create(5, 2L, "imageUrl-5"),
        )
        val newRoom = FixtureRoom.aRoom()
        newRoom.changeImages(expectedImages)
        newRoom.images.size shouldBe expectedImages.size
        newRoom.images[0].priority shouldBe expectedImages[0].priority
        newRoom.images[0].imageUrl shouldBe expectedImages[0].imageUrl
        newRoom.images[1].priority shouldBe expectedImages[1].priority
        newRoom.images[1].imageUrl shouldBe expectedImages[1].imageUrl
    }

    @Test
    fun `금액 변경`() {
        val expectedPrice = 320_000L
        val newRoom = FixtureRoom.aRoom()
        newRoom.changePrice(expectedPrice)
        newRoom.price shouldBe expectedPrice
    }

    @Test
    fun `객실 소개 변경`() {
        val expectedContent = "[🎁제공서비스] 웰컴스낵키트"
        val newRoom = FixtureRoom.aRoom()
        newRoom.changeContent(expectedContent)
        newRoom.content shouldBe expectedContent
    }

}

class FixtureRoom {
    companion object {
        fun aRoom(
            id: Long = 1L,
            type: Type = Type.SINGLE_ROOM,
            name: String = "O-PEACE 제주 (오피스제주)",
            standardPersonnel: Int = 2,
            maximumPersonnel: Int = 2,
            minimumStay: Int = 1,
            facilities: List<Facilities> = listOf(
                Facilities.create(1, "전용 화장실", "toilet-url"),
                Facilities.create(1, "전용 욕실", "bathroom-url"),
                Facilities.create(1, "TV", "tv-url"),
            ),
            images: List<Image> = listOf(
                Image.create(1, 1L, "imageUrl-1"),
                Image.create(2, 2L, "imageUrl-2"),
                Image.create(3, 3L, "imageUrl-2"),
            ),
            price: Long = 150_000L,
            content: String? = null,
        ) = Room.create(
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
}