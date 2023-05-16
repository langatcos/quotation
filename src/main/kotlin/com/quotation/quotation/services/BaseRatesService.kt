package com.quotation.quotation.services

import com.quotation.quotation.dataclasses.BaseRates
import com.quotation.quotation.repositories.BaseRatesRepository
import io.swagger.annotations.ApiOperation
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.CrossOrigin
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController

@RestController
class BaseRatesService (val baseRatesRepository: BaseRatesRepository){
    @CrossOrigin
    @GetMapping("getAllBaserates")
    @ApiOperation(value="Get All Base Rates", notes = "Get All Base Rates")
    fun getAllBaseRates():List<BaseRates>{
        return baseRatesRepository.getAllBaserates()
    }
    @CrossOrigin
    @GetMapping("getBaseratesByBenefiID/{benefitid}")
    @ApiOperation(value="Get All Base Rates By Benefit ID", notes = "Get All Base Rates By Benefit ID")
    fun getRatesByID(@PathVariable benefitid:Int):ResponseEntity<List<BaseRates>>{
        val rates=baseRatesRepository.getBaseRatesByBenefitid(benefitid)
        return if (rates !=null){
            ResponseEntity.ok(rates)
        }
        else{
            ResponseEntity.notFound().build()
        }
    }
    @CrossOrigin
    @GetMapping("getBaseratesByProductId/{productid}")
    @ApiOperation(value="Get All Base Rates By Product ID", notes = "Get All Base Rates By Product ID")
    fun getRatesByProductID(@PathVariable productid:Int):ResponseEntity<List<BaseRates>>{
        val rates=baseRatesRepository.getBaseRatesByProductid(productid)
        return if (rates !=null){
            ResponseEntity.ok(rates)
        }
        else{
            ResponseEntity.notFound().build()
        }
    }
}