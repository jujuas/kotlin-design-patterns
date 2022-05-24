package com.design.patterns

import com.design.patterns.creational.factory_method.FactoryMethod
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class PatternsApplication


fun main(args: Array<String>) {
	runApplication<PatternsApplication>(*args)
	println(FactoryMethod("windows").perform())
}
