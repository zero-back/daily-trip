package com.dailytrip.users

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class DailyTripApplication

fun main(args: Array<String>) {
    runApplication<DailyTripApplication>(*args)
}