package com.dailytrip.infrastructure.users

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

@Entity
class UserEntity(
    @Id @GeneratedValue var id: Long? = null,
    val username: String,
    val name: String,
)