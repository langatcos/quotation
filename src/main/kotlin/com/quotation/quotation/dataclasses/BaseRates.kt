package com.quotation.quotation.dataclasses

import org.springframework.data.annotation.Id
import org.springframework.data.relational.core.mapping.Table
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType

@Table("baserates")
class BaseRates (
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        val id:Int?,
        val desctription:String,
        val benefitid:Int,
        val productid:Int,
        val agefrom:Int,
        val ageto:Int,
        val principle:Int,
        val spouse:Int,
        val child:Int
)