package com.motoapp.catalog_navigation

sealed class CatalogItem(val route: String){
    object ScreenCatalogHome: CatalogItem("catalogHome")
    object ScreenByType: CatalogItem("catalogByType")
    object ScreenByBrand: CatalogItem("catalogByBrand")
    object ScreenKtmModels: CatalogItem("ktmModels")
    object ScreenKtm450SXF2024: CatalogItem("ktm450SXF2024")
}
