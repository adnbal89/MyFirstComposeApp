package com.aceofhigh.borutoapp.domain.repository

import com.aceofhigh.borutoapp.domain.model.Hero

interface LocalDataSource {
    suspend fun getSelectedHero(heroId: Int): Hero
}