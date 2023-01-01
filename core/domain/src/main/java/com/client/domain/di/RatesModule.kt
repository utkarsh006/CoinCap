package com.client.domain.di

import com.client.domain.usecase.rates.GetRatesUseCase
import com.client.domain.usecase.rates.GetRatesUseCaseImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
interface RatesModule {

    @Binds
    fun bindRatesUseCase(rateUseCase: GetRatesUseCaseImpl): GetRatesUseCase
}
