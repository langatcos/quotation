package com.quotation.quotation.services

import com.quotation.quotation.dataclasses.Beneficiary
import com.quotation.quotation.repositories.BeneficiaryRepository
import io.swagger.annotations.ApiOperation
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.CrossOrigin
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController
class BeneficiaryService (val beneficiaryRepository: BeneficiaryRepository) {
    @CrossOrigin
    @GetMapping("getallbeneficiaries")
    @ApiOperation(value="Get All Beneficiaries",notes="Get All Beneficiaries")
     fun getAllBen():List<Beneficiary>{
         return beneficiaryRepository.getAllBeneficiaries()
     }

    @CrossOrigin
    @PostMapping("createbeneficiary")
    @ApiOperation(value="Create New Beneficiary",notes="Create New Beneficiary")
    fun createBeneficiary(@RequestBody newBen:Beneficiary):ResponseEntity<Beneficiary>{
        val newBen=Beneficiary(null,newBen.firstname,newBen.surname,newBen.dob,newBen.relationship)
        val createdBen=beneficiaryRepository.save(newBen)
        return ResponseEntity.ok(createdBen)
    }

}