package com.quotation.quotation.repositories

import com.quotation.quotation.dataclasses.Beneficiary
import org.springframework.data.jdbc.repository.query.Query
import org.springframework.data.repository.CrudRepository

interface BeneficiaryRepository :CrudRepository<Beneficiary,String>{
    @Query("select * from beneficiary")
    fun getAllBeneficiaries():List<Beneficiary>
}