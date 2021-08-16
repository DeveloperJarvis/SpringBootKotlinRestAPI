package com.example.SpringBootKotlinRestAPI.service

import com.example.SpringBootKotlinRestAPI.datasource.BankDataSource
import com.example.SpringBootKotlinRestAPI.model.Bank
import org.springframework.beans.factory.annotation.Qualifier
import org.springframework.stereotype.Service

@Service
class BankService (@Qualifier("network") private val dataSource: BankDataSource){

    fun getBanks(): Collection<Bank> = dataSource.retrieveBanks()
    fun getBank(accountNumber: String): Bank = dataSource.retrieveBank(accountNumber)
    fun addBank(bank: Bank): Bank = dataSource.createBank(bank)
    fun updateBank(bank: Bank): Bank = dataSource.modifyBank(bank)
    fun deleteBank(accountNumber: String): Unit = dataSource.removeBank(accountNumber)

}