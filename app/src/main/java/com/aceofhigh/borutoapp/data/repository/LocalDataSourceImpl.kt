package com.aceofhigh.borutoapp.data.repository

import com.aceofhigh.borutoapp.data.local.BorutoDatabase
import com.aceofhigh.borutoapp.domain.model.Hero
import com.aceofhigh.borutoapp.domain.repository.LocalDataSource

class LocalDataSourceImpl(borutoDatabase: BorutoDatabase) : LocalDataSource {
    private val heroDao = borutoDatabase.heroDao()

    override suspend fun getSelectedHero(heroId: Int): Hero {
        return heroDao.getSelectedHero(heroId = heroId)
    }
}