package com.quotation.quotation.repositories

import com.quotation.quotation.dataclasses.BaseRates
import org.springframework.data.jdbc.repository.query.Query
import org.springframework.data.repository.kotlin.CoroutineCrudRepository

interface BaseRatesRepository:CoroutineCrudRepository<BaseRates,String> {
    @Query("select * from baserates")
    fun getAllBaserates():List<BaseRates>

}