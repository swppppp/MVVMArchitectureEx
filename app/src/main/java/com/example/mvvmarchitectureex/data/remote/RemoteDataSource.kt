package com.example.mvvmarchitectureex.data.remote

import com.example.mvvmarchitectureex.data.service.HarryPotterService
import com.example.mvvmarchitectureex.model.Character

interface RemoteDataSource {
    suspend fun getCharacters(type: String) : List<Character>
}

class RemoteDataSourceImpl(private val service: HarryPotterService): RemoteDataSource {
    override suspend fun getCharacters(type: String): List<Character> = service.getCharacters(type)
}