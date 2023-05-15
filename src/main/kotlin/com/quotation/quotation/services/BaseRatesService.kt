package com.quotation.quotation.services

import com.quotation.quotation.dataclasses.BaseRates

import com.quotation.quotation.repositories.BaseRatesRepository
import io.swagger.annotations.ApiOperation
import org.springframework.web.bind.annotation.CrossOrigin
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class BaseRatesService(val baseRatesRepository: BaseRatesRepository) {
    @CrossOrigin
    @GetMapping("getAllBaserates")
    @ApiOperation(value="Get All Base Rates", notes = "Get All Base Rates")
    fun getAllBaseRates():List<BaseRates>{
        return baseRatesRepository.getAllBaserates()
    }
}