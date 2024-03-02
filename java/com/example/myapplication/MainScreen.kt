package com.example.myapplication

import android.annotation.SuppressLint
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.AlertDialogDefaults.shape
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.NavDestination
import androidx.navigation.NavDestination.Companion.hierarchy
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.NavHostController
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController

@OptIn(ExperimentalMaterial3Api::class)
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun MainScreen(){
    val navController= rememberNavController()
    Scaffold(
        bottomBar = { BottomBar(navController = navController)}
    ){
        BottomNavGraph(navController = navController)

    }
}



@Composable
fun BottomBar(navController: NavHostController){
    val screens = listOf(
        BottomBarScreen.docspage,
        BottomBarScreen.patienthistory,
        BottomBarScreen.docsprofile,

    )
    val navBackStackEntry by navController.currentBackStackEntryAsState()
    val currentDestination =navBackStackEntry?.destination

    NavigationBar(
        modifier = Modifier
            .clip(shape = RoundedCornerShape(topStart = 20.dp, topEnd = 20.dp)),
        colorResource(id = R.color.green)
    ) {
        screens.forEach{ screen ->
            AddItem(screen = screen, currentDestination = currentDestination, navController =navController )

        }
    }
}
@Composable
fun RowScope.AddItem(
    screen: BottomBarScreen,
    currentDestination: NavDestination?,
    navController: NavHostController
){

    NavigationBarItem(
        selected = currentDestination?.hierarchy?.any {
            it.route==screen.route
        }==true,
        

        onClick = {
                  navController.navigate(screen.route){
                      popUpTo(navController.graph.findStartDestination().id)
                      launchSingleTop=true
                  }
        },
        icon = {
            Icon(painterResource(id = screen.icon) , contentDescription ="Navigation Icon" )
        }
    )
}


