package com.quotation.quotation.dataclasses

import org.springframework.data.annotation.Id

class Beneficiary (
        @Id val id:Int,
        val firstname:String,
        val surname:String,
        val dob:String,
        val relationship:String
)