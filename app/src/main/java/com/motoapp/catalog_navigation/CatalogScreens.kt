package com.motoapp.catalog_navigation

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.motoapp.ui.theme.Green04

//ScreenCatalogHome: CatalogItem("catalogHome")
//    object ScreenByType: CatalogItem("catalogByType")
//    object ScreenByBrand

@Composable
fun CatalogHomeScreen(navController: NavController) {
    Box(
        modifier = Modifier
            .padding(bottom = 80.dp)
            .fillMaxSize()
            .background(Green04),
        contentAlignment = Alignment.Center
    ){
        Column(
            modifier = Modifier.padding(vertical = 8.dp)
        ) {
            Text(
                text = "CatalogHomeScreen"
            )
            val listOfCatalogHomeScreens = listOf(
                CatalogItem.ScreenByType,
                CatalogItem.ScreenByBrand
            )

            Column() {
                listOfCatalogHomeScreens.forEach { item ->
                    OutlinedButton(onClick = {
                        navController.navigate(item.route)
                    }) {
                        Text(text = item.route)
                    }
                }
            }
        }

    }
}

@Composable
fun ByTypeScreen(navController: NavController) {
    Box(
        modifier = Modifier
            .padding(bottom = 80.dp)
            .fillMaxSize()
            .background(Green04),
        contentAlignment = Alignment.Center
    ){
        Column() {
            Text(
                text = "ByTypeScreen"
            )

            OutlinedButton(onClick = {
                navController.navigate(CatalogItem.ScreenCatalogHome.route)
            }) {
                Text(text = "MX CROSS")
            }
            OutlinedButton(onClick = {
                navController.navigate(CatalogItem.ScreenCatalogHome.route)
            }) {
                Text(text = "Enduro")
            }
            OutlinedButton(onClick = {
                navController.navigate(CatalogItem.ScreenCatalogHome.route)
            }) {
                Text(text = "Supermoto")
            }
            OutlinedButton(onClick = {
                navController.navigate(CatalogItem.ScreenCatalogHome.route)
            }) {
                Text(text = "ATV")
            }

            OutlinedButton(onClick = {
                navController.popBackStack()
            }) {
                Text(text = "Back to home")
            }
        }

    }
}

@Composable
fun ByBrandScreen(navController: NavController) {
    Box(
        modifier = Modifier
            .padding(bottom = 80.dp)
            .fillMaxSize()
            .background(Green04),
        contentAlignment = Alignment.Center
    ){
        Column() {
            Text(
                text = "ByBrandScreen"
            )
        }

    }
}