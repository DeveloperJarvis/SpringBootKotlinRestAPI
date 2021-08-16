package com.example.SpringBootKotlinRestAPI.datasource

import com.example.SpringBootKotlinRestAPI.model.Bank

interface BankDataSource {

    fun retrieveBanks(): Collection<Bank>
    fun retrieveBank(accountNumber: String): Bank
    fun createBank(bank: Bank): Bank
    fun modifyBank(bank: Bank): Bank
    fun removeBank(accountNumber: String)
}