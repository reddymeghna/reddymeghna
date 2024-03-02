package com.example.myapplication

import android.graphics.drawable.AdaptiveIconDrawable
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Star
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource


sealed class BottomBarScreen(
    val route: String,

    val icon: Int

){
    object docspage : BottomBarScreen(
        route = "home",
        icon = R.drawable.home

    )
    object patienthistory : BottomBarScreen(
        route = "settings",

        icon = R.drawable.history
    )
    object docsprofile : BottomBarScreen(
        route = "profile",
//        title = "Profile",
        icon = R.drawable.person
    )

}
