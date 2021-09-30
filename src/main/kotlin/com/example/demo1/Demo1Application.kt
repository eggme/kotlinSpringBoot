package com.example.demo1

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.data.jpa.repository.config.EnableJpaAuditing

@SpringBootApplication
@EnableJpaAuditing(modifyOnCreate = true)
class Demo1Application

fun main(args: Array<String>) {
    runApplication<Demo1Application>(*args)
}
