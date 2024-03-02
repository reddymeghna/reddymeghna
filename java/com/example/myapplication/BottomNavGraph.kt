package com.example.myapplication

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable

@Composable
fun BottomNavGraph(navController: NavHostController){
    NavHost(navController = navController,
        startDestination = BottomBarScreen.docspage.route
    ){
        composable(route=BottomBarScreen.docspage.route){
            docspage()
        }
        composable(route=BottomBarScreen.patienthistory.route){
            patienthistory()
        }
        composable(route=BottomBarScreen.docsprofile.route){
            docsprofile()
        }

    }
}



