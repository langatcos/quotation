package com.quotation.quotation

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.data.jdbc.repository.config.EnableJdbcRepositories

@SpringBootApplication
@EnableJdbcRepositories
class QuotationApplication

fun main(args: Array<String>) {
	runApplication<QuotationApplication>(*args)
}
