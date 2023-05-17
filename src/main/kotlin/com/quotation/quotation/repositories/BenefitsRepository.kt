package com.quotation.quotation.repositories

import com.quotation.quotation.dataclasses.Benefits
import org.springframework.data.jdbc.repository.query.Query
import org.springframework.data.repository.CrudRepository

interface BenefitsRepository:CrudRepository<Benefits,String> {
    @Query("select * from benefits order by benefitid asc")
    fun getAllBenefits():List<Benefits>
    fun getAllBenefitsByProductid(productid:Int):List<Benefits>
    fun getAllBenefitsByCategory(category:String):List<Benefits>


}