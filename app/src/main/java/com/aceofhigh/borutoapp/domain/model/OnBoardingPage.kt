package com.aceofhigh.borutoapp.domain.model

import androidx.annotation.DrawableRes
import com.aceofhigh.borutoapp.R

sealed class OnBoardingPage(
    @DrawableRes
    val image: Int,
    val title: String,
    val description: String
) {
    object First : OnBoardingPage(
        image = R.drawable.greetings,
        title = "Greetings",
        description = "Are you a fan ? Then come on in!"
    )

    object Second : OnBoardingPage(
        image = R.drawable.explore,
        title = "Explore",
        description = "Choose your favorite hero and be a world champion!"
    )

    object Third : OnBoardingPage(
        image = R.drawable.power,
        title = "Power",
        description = "Carefully choose your super powers to eliminate your opponents."
    )
}
