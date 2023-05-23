package com.motoapp.bottom_navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.motoapp.catalog_navigation.BikeDetailsScreen
import com.motoapp.catalog_navigation.ByBrandScreen
import com.motoapp.catalog_navigation.ByTypeScreen
import com.motoapp.catalog_navigation.CatalogHomeScreen
import com.motoapp.catalog_navigation.Ktm250SXF2024Screen
import com.motoapp.catalog_navigation.Ktm350SXF2024Screen
import com.motoapp.catalog_navigation.Ktm450SXFFactoryEdition2024Screen
import com.motoapp.catalog_navigation.KtmScreen
import com.motoapp.models.ItemBikeDescription

@Composable
fun NavGraph(
    navHostController: NavHostController
) {
    NavHost(navController = navHostController, startDestination = "screen_1"){
        composable("screen_1"){
            CatalogHomeScreen(navHostController)
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
        composable("ktmModels"){
            KtmScreen(navHostController)
        }
        composable("ktm450SXF2024"){
            BikeDetailsScreen(navHostController, ItemBikeDescription.Ktm450SXF2024)
        }
        composable("ktm350SXF2024"){
            Ktm350SXF2024Screen(navHostController)
        }
        composable("ktm250SXF2024"){
            Ktm250SXF2024Screen(navHostController)
        }
        composable("ktm450SXFFactoryEdition2024"){
            Ktm450SXFFactoryEdition2024Screen(navHostController)
        }
        composable("ktm125SX2024"){
            BikeDetailsScreen(navHostController, ItemBikeDescription.Ktm125SX2024)
        }
    }
}