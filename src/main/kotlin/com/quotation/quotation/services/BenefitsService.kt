package com.quotation.quotation.services

import com.quotation.quotation.dataclasses.Benefits
import com.quotation.quotation.repositories.BenefitsRepository
import io.swagger.annotations.ApiOperation
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.CrossOrigin
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController

@RestController
class BenefitsService (val benefitsRepository: BenefitsRepository){
    @CrossOrigin
    @GetMapping("getproductBenefits/{productid}")
    @ApiOperation(value="Get All Benefits By Productid", notes = "Get All Benefits By Productid")
    fun getProductBenefits(@PathVariable productid:Int):ResponseEntity<List<Benefits>>{
        val benefits=benefitsRepository.getAllBenefitsByProductid(productid)
        return if (benefits !=null){
            ResponseEntity.ok(benefits)
        }else{
            ResponseEntity.notFound().build()
        }
    }
}