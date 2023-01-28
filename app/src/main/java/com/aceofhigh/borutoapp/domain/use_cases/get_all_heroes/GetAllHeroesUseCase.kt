package com.aceofhigh.borutoapp.domain.use_cases.get_all_heroes

import androidx.paging.PagingData
import com.aceofhigh.borutoapp.data.repository.Repository
import com.aceofhigh.borutoapp.domain.model.Hero
import kotlinx.coroutines.flow.Flow

class GetAllHeroesUseCase(
    private val repository: Repository
) {

    operator fun invoke(): Flow<PagingData<Hero>> {
        return repository.getAllHeroes()
    }
}