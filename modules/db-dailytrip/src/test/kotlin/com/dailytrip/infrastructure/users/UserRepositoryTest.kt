package com.dailytrip.infrastructure.users

import org.junit.jupiter.api.Test
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest
import com.dailytrip.infrastructure.users.UserEntity
import com.dailytrip.infrastructure.users.UserRepository
import org.springframework.beans.factory.annotation.Autowired

@DataJpaTest
class UserRepositoryTest @Autowired constructor(
    val userRepository: UserRepository
) {

    @Test
    fun `Store User Test`() {
        val userEntity = UserEntity(null, "username", "name")
        val storedUser = userRepository.save(userEntity)
    }
}