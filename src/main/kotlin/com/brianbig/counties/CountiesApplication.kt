package com.brianbig.counties

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class CountiesApplication

fun main(args: Array<String>) {
	runApplication<CountiesApplication>(*args)
}
