package com.quotation.quotation.dataclasses

import org.springframework.data.relational.core.mapping.Table

@Table("benefits")
data class Benefits (
        val Benefitid:Int,
        val description:String,
        val productid:Int
)