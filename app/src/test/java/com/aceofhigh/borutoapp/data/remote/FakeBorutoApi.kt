package com.aceofhigh.borutoapp.data.remote

import com.aceofhigh.borutoapp.domain.model.ApiResponse
import com.aceofhigh.borutoapp.domain.model.Hero

class FakeBorutoApi : BorutoApi {

    private val heroes = listOf(
        Hero(
            id = 1,
            name = "Sasuke",
            image = "",
            about = "",
            rating = 4.5,
            power = 0,
            month = "Oct",
            day = "1st",
            family = listOf(),
            abilities = listOf(),
            natureTypes = listOf()
        ),
        Hero(
            id = 2,
            name = "Naruto",
            image = "",
            about = "",
            rating = 4.5,
            power = 0,
            month = "Oct",
            day = "1st",
            family = listOf(),
            abilities = listOf(),
            natureTypes = listOf()
        ),
        Hero(
            id = 3,
            name = "Sakura",
            image = "",
            about = "",
            rating = 4.5,
            power = 0,
            month = "Oct",
            day = "1st",
            family = listOf(),
            abilities = listOf(),
            natureTypes = listOf()
        )
    )

    override suspend fun getAllHeroes(page: Int): ApiResponse {
        return ApiResponse(
            success = false
        )
    }

    override suspend fun searchHeroes(name: String): ApiResponse {
        val searchedHeroes = findHeroes(name = name)
        return ApiResponse(
            success = true,
            message = "ok",
            heroes = searchedHeroes
        )
    }

    private fun findHeroes(name: String): List<Hero> {
        val found = mutableListOf<Hero>()
        return if (name.isNotEmpty()) {
            heroes.forEach { hero ->
                if (hero.name.lowercase().contains(name.lowercase())) {
                    found.add(hero)
                }
            }
            found
        } else {
            emptyList()
        }
    }
}