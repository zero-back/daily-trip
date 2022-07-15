package com.dailytrip.users.interfaces

import org.springframework.beans.factory.annotation.Value
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class HomeController {

    @Value("\${spring.application.name}")
    private val applicationName: String? = null

    @GetMapping("/")
    fun home(): String? = "Welcome $applicationName"
}