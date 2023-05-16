package com.quotation.quotation.repositories

import com.quotation.quotation.dataclasses.BaseRates
import org.springframework.data.jdbc.repository.query.Query
import org.springframework.data.repository.CrudRepository


interface BaseRatesRepository:CrudRepository<BaseRates,String> {
    @Query("select * from baseratesder order by description,agefrom asc")
    fun getAllBaserates():List<BaseRates>
    fun getBaseRatesByBenefitid(benefitid:Int):List<BaseRates>
    fun getBaseRatesByProductid(productid:Int):List<BaseRates>

}