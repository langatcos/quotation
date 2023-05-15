package com.quotation.quotation.dataclasses

import org.springframework.data.annotation.Id
import org.springframework.data.relational.core.mapping.Table
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType

@Table("beneficiary")
data class Beneficiary (
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        val id:Int?= null,
        val firstname:String?,
        val surname:String?,
        val parentid:Int?,
        val dob:String?,
        val relationship:String?
)