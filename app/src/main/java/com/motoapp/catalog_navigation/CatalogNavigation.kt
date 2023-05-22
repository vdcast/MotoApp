package com.motoapp.catalog_navigation

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import androidx.navigation.compose.currentBackStackEntryAsState

@Composable
fun CatalogNavigation(
    navController: NavController
) {
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