package com.example.SpringBootKotlinRestAPI.datasource.network.dto

import com.example.SpringBootKotlinRestAPI.model.Bank

data class BankList (
    val results : Collection<Bank>
        )
