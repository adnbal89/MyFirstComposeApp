package com.aceofhigh.borutoapp.ui.theme

import androidx.compose.material.Colors
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

val Purple200 = Color(0xFFBB86FC)
val Purple500 = Color(0xFF6200EE)
val Purple700 = Color(0xFF3700B3)
val Teal200 = Color(0xFF03DAC5)

val ListGray = Color(0xFFD8D808)
val DarkGray = Color(0xFF2A2A2A)

val Colors.welcomeScreenBackgroundColor
    @Composable
    get() = if (isLight) Color.White else Color.Black

val Colors.titleColor
    @Composable
    get() = if (isLight) DarkGray else ListGray

val Colors.descriptionColor
    @Composable
    get() = if (isLight) DarkGray.copy(alpha = 0.5f)
    else ListGray.copy(0.5f)