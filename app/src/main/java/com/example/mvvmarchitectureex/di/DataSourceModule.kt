package com.example.mvvmarchitectureex.di

import com.example.mvvmarchitectureex.data.remote.RemoteDataSource
import com.example.mvvmarchitectureex.data.remote.RemoteDataSourceImpl
import org.koin.dsl.module

val dataSourceModule = module {
    single<RemoteDataSource> { RemoteDataSourceImpl(service = get()) }
}