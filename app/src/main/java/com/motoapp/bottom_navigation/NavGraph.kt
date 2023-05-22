package com.motoapp.bottom_navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.motoapp.catalog_navigation.ByBrandScreen
import com.motoapp.catalog_navigation.ByTypeScreen
import com.motoapp.catalog_navigation.CatalogHomeScreen

@Composable
fun NavGraph(
    navHostController: NavHostController
) {
    NavHost(navController = navHostController, startDestination = "catalogHome"){
        composable("screen_1"){
            BottomScreen1()
        }
        composable("screen_2"){
            BottomScreen2()
        }
        composable("screen_3"){
            BottomScreen3()
        }
        composable("screen_4"){
            BottomScreen4()
        }
        composable("catalogHome"){
            CatalogHomeScreen(navHostController)
        }
        composable("catalogByType"){
            ByTypeScreen(navHostController)
        }
        composable("catalogByBrand"){
            ByBrandScreen(navHostController)
        }
    }
}