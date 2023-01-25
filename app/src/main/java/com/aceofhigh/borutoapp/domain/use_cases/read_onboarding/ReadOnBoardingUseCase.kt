package com.aceofhigh.borutoapp.domain.use_cases.read_onboarding

import com.aceofhigh.borutoapp.data.repository.Repository
import kotlinx.coroutines.flow.Flow

class ReadOnBoardingUseCase(
    private val repository: Repository
) {
    suspend operator fun invoke(): Flow<Boolean> =
        repository.readOnBoardingState()

}