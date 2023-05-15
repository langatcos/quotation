package com.quotation.quotation.repositories

import com.quotation.quotation.dataclasses.Beneficiary
import org.springframework.data.repository.CrudRepository

interface BeneficiaryRepository :CrudRepository<Beneficiary,String>{
    fun getAllBeneficiaries():List<Beneficiary>
}