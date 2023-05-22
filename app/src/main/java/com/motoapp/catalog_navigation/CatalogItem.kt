package com.motoapp.catalog_navigation

sealed class CatalogItem(val route: String){
    object ScreenCatalogHome: CatalogItem("catalogHome")
    object ScreenByType: CatalogItem("catalogByType")
    object ScreenByBrand: CatalogItem("catalogByBrand")
}
