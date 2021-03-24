package com.sergiolopezmi.mongodbdemo

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class MongodbdemoApplication

fun main(args: Array<String>) {
	runApplication<MongodbdemoApplication>(*args)
}
