package com.example.mvvmarchitectureex.data.repository

import com.example.mvvmarchitectureex.data.remote.RemoteDataSource
import com.example.mvvmarchitectureex.model.Character

interface Repository {
    suspend fun getCharacters(type: String) : List<Character>
}

class RepositoryImpl(private val remoteDataSource: RemoteDataSource) : Repository {
    override suspend fun getCharacters(type: String): List<Character>  = remoteDataSource.getCharacters(type)
}