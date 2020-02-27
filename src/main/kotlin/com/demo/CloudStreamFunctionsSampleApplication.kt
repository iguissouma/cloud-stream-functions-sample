package com.demo

import mu.KLogger
import mu.KotlinLogging.logger
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Bean
import java.util.function.Consumer

@SpringBootApplication
class CloudStreamFunctionsSampleApplication(private val log: KLogger = logger { }) {

    @Bean
    fun simpleConsumer1() = Consumer<String> {
        log.info { "==================> Consumer1: $it" }
    }

    @Bean
    fun simpleConsumer2() = Consumer<String> {
        log.info { "==================> Consumer2: $it" }
    }
}

fun main(args: Array<String>) {
    runApplication<CloudStreamFunctionsSampleApplication>(*args)
}
