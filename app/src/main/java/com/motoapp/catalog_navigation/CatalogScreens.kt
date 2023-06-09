package com.motoapp.catalog_navigation

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.EnterTransition
import androidx.compose.animation.animateContentSize
import androidx.compose.animation.core.FiniteAnimationSpec
import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.core.tween
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.animation.slideInHorizontally
import androidx.compose.animation.slideInVertically
import androidx.compose.animation.slideOutVertically
import androidx.compose.foundation.background
import androidx.compose.foundation.gestures.Orientation
import androidx.compose.foundation.gestures.detectHorizontalDragGestures
import androidx.compose.foundation.gestures.rememberScrollableState
import androidx.compose.foundation.gestures.scrollable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import coil.compose.AsyncImage
import com.motoapp.models.ItemOfListOfModelsOfBrand
import com.motoapp.ui.theme.Green04
import com.motoapp.ui.theme.Green08
import com.motoapp.ui.theme.Green30
import com.motoapp.ui.theme.Green50
import androidx.compose.ui.unit.IntOffset

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
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = "CatalogHomeScreen",
                modifier = Modifier.padding(bottom = 16.dp)
            )
            val listOfCatalogHomeScreens = listOf(
                CatalogItem.ScreenByType,
                CatalogItem.ScreenByBrand
            )

            listOfCatalogHomeScreens.forEach { item ->
                OutlinedButton(
                    onClick = {
                        navController.navigate(item.route)
                    },
                    modifier = Modifier.fillMaxWidth(0.5f),
                    elevation = ButtonDefaults.buttonElevation(8.dp),
                    colors = ButtonDefaults.elevatedButtonColors(Green30)
                ) {
                    Text(text = item.route)
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
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            Text(
                text = "ByTypeScreen",
                modifier = Modifier.padding(bottom = 16.dp)
            )

            OutlinedButton(
                onClick = { navController.popBackStack() },
                modifier = Modifier.fillMaxWidth(0.5f),
                elevation = ButtonDefaults.buttonElevation(8.dp),
                colors = ButtonDefaults.elevatedButtonColors(Green30)
            ) {
                Text(text = "MX CROSS")
            }
            OutlinedButton(
                onClick = { navController.popBackStack() },
                modifier = Modifier.fillMaxWidth(0.5f),
                elevation = ButtonDefaults.buttonElevation(8.dp),
                colors = ButtonDefaults.elevatedButtonColors(Green30)
            ) {
                Text(text = "Enduro")
            }
            OutlinedButton(
                onClick = { navController.popBackStack() },
                modifier = Modifier.fillMaxWidth(0.5f),
                elevation = ButtonDefaults.buttonElevation(8.dp),
                colors = ButtonDefaults.elevatedButtonColors(Green30)
            ) {
                Text(text = "Supermoto")
            }
            OutlinedButton(
                onClick = { navController.popBackStack() },
                modifier = Modifier.fillMaxWidth(0.5f),
                elevation = ButtonDefaults.buttonElevation(8.dp),
                colors = ButtonDefaults.elevatedButtonColors(Green30)
            ) {
                Text(text = "ATV")
            }

            OutlinedButton(
                onClick = { navController.popBackStack() },
                modifier = Modifier
                    .fillMaxWidth(0.5f)
                    .padding(top = 8.dp),
                elevation = ButtonDefaults.buttonElevation(8.dp),
                colors = ButtonDefaults.elevatedButtonColors(Green50)
            ) {
                Text(text = "Back")
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
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            ) {
            Text(
                text = "ByBrandScreen",
                modifier = Modifier.padding(bottom = 16.dp)
            )

            OutlinedButton(
                onClick = { navController.navigate(CatalogItem.ScreenKtmModels.route) },
                modifier = Modifier.fillMaxWidth(0.5f),
                elevation = ButtonDefaults.buttonElevation(8.dp),
                colors = ButtonDefaults.elevatedButtonColors(Green30)
            ) {
                Text(text = "KTM")
            }

            OutlinedButton(
                onClick = { navController.popBackStack() },
                modifier = Modifier.fillMaxWidth(0.5f),
                elevation = ButtonDefaults.buttonElevation(8.dp),
                colors = ButtonDefaults.elevatedButtonColors(Green30)
            ) {
                Text(text = "HUSQVARNA")
            }

            OutlinedButton(
                onClick = { navController.popBackStack() },
                modifier = Modifier.fillMaxWidth(0.5f),
                elevation = ButtonDefaults.buttonElevation(8.dp),
                colors = ButtonDefaults.elevatedButtonColors(Green30)
            ) {
                Text(text = "GAS GAS")
            }

            OutlinedButton(
                onClick = { navController.popBackStack() },
                modifier = Modifier.fillMaxWidth(0.5f),
                elevation = ButtonDefaults.buttonElevation(8.dp),
                colors = ButtonDefaults.elevatedButtonColors(Green30)
            ) {
                Text(text = "HONDA")
            }




            OutlinedButton(
                onClick = { navController.popBackStack() },
                modifier = Modifier
                    .fillMaxWidth(0.5f)
                    .padding(top = 8.dp),
                elevation = ButtonDefaults.buttonElevation(8.dp),
                colors = ButtonDefaults.elevatedButtonColors(Green50)
            ) {
                Text(text = "Back")
            }
        }

    }
}

@Composable
fun KtmScreen(navController: NavController) {
    Box(
        modifier = Modifier
            .padding(bottom = 80.dp)
            .fillMaxSize()
            .background(Green04),
        contentAlignment = Alignment.Center
    ){
        LazyColumn(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier.fillMaxWidth()
        ) {
            item {
                Text(
                    text = "KTM",
                    modifier = Modifier.padding(top = 16.dp, bottom = 8.dp)
                )
            }
            item {
                Text(text = "4 STROKE", Modifier.padding(vertical = 8.dp))
            }
            itemsIndexed(
                listOf(
                    ItemOfListOfModelsOfBrand("450 SX-F 2024","ktm450SXF2024"),
                    ItemOfListOfModelsOfBrand("350 SX-F 2024","ktm350SXF2024"),
                    ItemOfListOfModelsOfBrand("250 SX-F 2024","ktm250SXF2024"),
                    ItemOfListOfModelsOfBrand("450 SX-F FACTORY EDITION 2023","ktm450SXFFactoryEdition2024"),
                )
            ) {index, item ->
                OutlinedButton(
                    onClick = {
                        navController.navigate(item.route)
                    },
                    modifier = Modifier
                        .fillMaxWidth(0.75f),
                    elevation = ButtonDefaults.buttonElevation(8.dp),
                    colors = ButtonDefaults.elevatedButtonColors(Green30)
                ) {
                    Text(text = item.title)
                }
            }
            item {
                Text(text = "2 STROKE", Modifier.padding(vertical = 8.dp))
            }
            itemsIndexed(
//                ktm125SXF2024
                listOf(
                    ItemOfListOfModelsOfBrand("300 SX 2024", "ktm300SX2024"),
                    ItemOfListOfModelsOfBrand("250 SX 2024", "ktm250SX2024"),
                    ItemOfListOfModelsOfBrand("125 SX 2024", "ktm125SX2024"),
                    ItemOfListOfModelsOfBrand("85 SX 19/16 2024", "ktm85SX19162024"),
                    ItemOfListOfModelsOfBrand("85 SX 17/14 2024", "ktm85SX17142024"),
                    ItemOfListOfModelsOfBrand("65 SX 2023", "ktm65SX2023"),
                    ItemOfListOfModelsOfBrand("50 SX FACTORY EDITION 2023", "ktm50SXFactoryEdition2023"),
                    ItemOfListOfModelsOfBrand("50 SX 2023", "ktm50SX2023"),
                    ItemOfListOfModelsOfBrand("50 SX MINI 2023", "ktm50SXMini2023"),
                )
            ) {index, item ->
                OutlinedButton(
                    onClick = {
                        if (item.title === "125 SX 2024"){
                            navController.navigate(item.route)
                        } else if (item.title === "300 SX 2024") {
                            navController.navigate(item.route)
                        } else if (item.title === "250 SX 2024") {
                            navController.navigate(item.route)
                        } else {
                            navController.popBackStack()
                        }
                    },
                    modifier = Modifier
                        .fillMaxWidth(0.75f),
                    elevation = ButtonDefaults.buttonElevation(8.dp),
                    colors = ButtonDefaults.elevatedButtonColors(Green30)
                ) {
                    Text(text = item.title)
                }
            }
            item {
                Text(text = "ELECTRIC", Modifier.padding(vertical = 8.dp))
            }
            itemsIndexed(
                listOf("SX-E 5 2024", "SX-E 3 2024")
            ) {index, item ->
                OutlinedButton(
                    onClick = { navController.popBackStack() },
                    modifier = Modifier
                        .fillMaxWidth(0.75f),
                    elevation = ButtonDefaults.buttonElevation(8.dp),
                    colors = ButtonDefaults.elevatedButtonColors(Green30)
                ) {
                    Text(text = item)
                }
            }
            item {
                OutlinedButton(
                    onClick = { navController.popBackStack() },
                    modifier = Modifier
                        .fillMaxWidth(0.5f)
                        .padding(top = 8.dp, bottom = 16.dp),
                    elevation = ButtonDefaults.buttonElevation(8.dp),
                    colors = ButtonDefaults.elevatedButtonColors(Green50)
                ) {
                    Text(text = "Back")
                }
            }

        }

    }
}


@Composable
fun Ktm350SXF2024Screen(navController: NavController) {
    Box(
        modifier = Modifier
            .padding(bottom = 80.dp)
            .fillMaxSize()
            .background(Green04),
        contentAlignment = Alignment.Center
    ){
        LazyColumn(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier.fillMaxWidth()
        ) {
            item {
                Text(
                    text = "KTM 350 SX-F 2024",
                    modifier = Modifier.padding(top = 16.dp, bottom = 8.dp)
                )
            }
            item {
                AsyncImage(
                    model = "https://azwecdnepstoragewebsiteuploads.azureedge.net/PHO_BIKE_90_RE_496204-MY24-KTM-350-SX-F-90-Right-Studio_%23SALL_%23AEPI_%23V1.png",
                    contentDescription = null,
                )
            }

            item {
                OutlinedButton(
                    onClick = { navController.popBackStack() },
                    modifier = Modifier
                        .fillMaxWidth(0.5f)
                        .padding(top = 8.dp, bottom = 16.dp),
                    elevation = ButtonDefaults.buttonElevation(8.dp),
                    colors = ButtonDefaults.elevatedButtonColors(Green50)
                ) {
                    Text(text = "Back")
                }
            }

        }

    }
}

@Composable
fun Ktm250SXF2024Screen(navController: NavController) {
    Box(
        modifier = Modifier
            .padding(bottom = 80.dp)
            .fillMaxSize()
            .background(Green04),
        contentAlignment = Alignment.Center
    ){
        LazyColumn(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier.fillMaxWidth()
        ) {
            item {
                Text(
                    text = "KTM 250 SX-F 2024",
                    modifier = Modifier.padding(top = 16.dp, bottom = 8.dp)
                )
            }
            item {
                AsyncImage(
                    model = "https://azwecdnepstoragewebsiteuploads.azureedge.net/PHO_BIKE_90_RE_496197-MY24-KTM-250-SX-F-90-Right-Studio_%23SALL_%23AEPI_%23V1.png",
                    contentDescription = null,
                )
            }

            item {
                OutlinedButton(
                    onClick = { navController.popBackStack() },
                    modifier = Modifier
                        .fillMaxWidth(0.5f)
                        .padding(top = 8.dp, bottom = 16.dp),
                    elevation = ButtonDefaults.buttonElevation(8.dp),
                    colors = ButtonDefaults.elevatedButtonColors(Green50)
                ) {
                    Text(text = "Back")
                }
            }

        }

    }
}

@Composable
fun Ktm450SXFFactoryEdition2024Screen(navController: NavController) {
    Column() {
        AnimatedVisibility(
            visible = true,
            enter = fadeIn() + slideInVertically(initialOffsetY = { 24 }),
            exit = fadeOut() + slideOutVertically(targetOffsetY = { 12 }),
        ) {
            Box(
                modifier = Modifier
                    .padding(bottom = 80.dp)
                    .fillMaxSize()
                    .background(Green04),
                contentAlignment = Alignment.Center
            ){
                LazyColumn(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    modifier = Modifier.fillMaxWidth()
                ) {
                    item {
                        Text(
                            text = "KTM 450 SX-F FACTORY EDITION 2023",
                            modifier = Modifier.padding(top = 16.dp, bottom = 8.dp)
                        )
                    }
                    item {
                        AsyncImage(
                            model = "https://azwecdnepstoragewebsiteuploads.azureedge.net/PHO_BIKE_90_RE_M23-450-SX-F-FactoryEdition-90-Degree-Right_%23SALL_%23AEPI_%23V1.png",
                            contentDescription = null,
                        )
                    }

                    item {
                        OutlinedButton(
                            onClick = { navController.popBackStack() },
                            modifier = Modifier
                                .fillMaxWidth(0.5f)
                                .padding(top = 8.dp, bottom = 16.dp),
                            elevation = ButtonDefaults.buttonElevation(8.dp),
                            colors = ButtonDefaults.elevatedButtonColors(Green50)
                        ) {
                            Text(text = "Back")
                        }
                    }

                }

            }
        }

    }

}



@Composable
fun Ktm300SX2024Screen(navController: NavController) {

    var showCard = remember { mutableStateOf<Boolean>(false)}




    Column() {
        AnimatedVisibility(
            visible = showCard.value,
            enter = fadeIn() + slideInVertically(initialOffsetY = { it })
        ) {
            Box(
                modifier = Modifier
                    .padding(bottom = 80.dp)
                    .fillMaxSize()
                    .background(Green04),
                contentAlignment = Alignment.Center
            ) {
                Card(
                    modifier = Modifier
                        .fillMaxWidth()
                        .wrapContentHeight()
                        .padding(16.dp),
                    elevation = CardDefaults.cardElevation(4.dp),
                    colors = CardDefaults.cardColors(Green08)
                ) {
                    LazyColumn(
                        horizontalAlignment = Alignment.CenterHorizontally,
                        modifier = Modifier.fillMaxWidth()
                    ) {
                        item {
                            Text(
                                text = "KTM 300 SX 2024",
                                modifier = Modifier.padding(top = 16.dp, bottom = 8.dp)
                            )
                        }
                        item {
                            AsyncImage(
                                model = "https://azwecdnepstoragewebsiteuploads.azureedge.net/PHO_BIKE_90_RE_MY24-KTM-300-SX-90-right-Studio_%23SALL_%23AEPI_%23V1.png",
                                contentDescription = null,
                            )
                        }
                        item {
                            Spacer(modifier = Modifier.height(16.dp))
                            OutlinedButton(
                                onClick = { navController.popBackStack() },
                                modifier = Modifier
                                    .fillMaxWidth(0.5f)
                                    .padding(top = 8.dp, bottom = 16.dp),
                                elevation = ButtonDefaults.buttonElevation(8.dp),
                                colors = ButtonDefaults.elevatedButtonColors(Green50)
                            ) {
                                Text(text = "Back")
                            }
                        }

                    }

                }
            }
        }

        showCard.value = true
    }

}

@Composable
fun Ktm250SX2024Screen(navController: NavController) {

    var showCard = remember { mutableStateOf<Boolean>(false) }




    Column() {
        AnimatedVisibility(
            visible = showCard.value,
            enter = fadeIn() + slideInHorizontally(initialOffsetX = { it })
        ) {
            Box(
                modifier = Modifier
                    .padding(bottom = 80.dp)
                    .fillMaxSize()
                    .background(Green04),
                contentAlignment = Alignment.Center
            ) {
                Card(
                    modifier = Modifier
                        .fillMaxWidth()
                        .wrapContentHeight()
                        .padding(16.dp),
                    elevation = CardDefaults.cardElevation(4.dp)
                ) {
                    LazyColumn(
                        horizontalAlignment = Alignment.CenterHorizontally,
                        modifier = Modifier.fillMaxWidth()
                    ) {
                        item {
                            Text(
                                text = "KTM 250 SX 2024",
                                modifier = Modifier.padding(top = 16.dp, bottom = 8.dp)
                            )
                        }
                        item {
                            AsyncImage(
                                model = "https://azwecdnepstoragewebsiteuploads.azureedge.net/PHO_BIKE_90_RE_MY24-KTM-250-SX-90-right-Studio_%23SALL_%23AEPI_%23V1.png",
                                contentDescription = null,
                            )
                        }
                        item {
                            Spacer(modifier = Modifier.height(16.dp))
                            OutlinedButton(
                                onClick = { navController.popBackStack() },
                                modifier = Modifier
                                    .fillMaxWidth(0.5f)
                                    .padding(top = 8.dp, bottom = 16.dp),
                                elevation = ButtonDefaults.buttonElevation(8.dp),
                                colors = ButtonDefaults.elevatedButtonColors(Green50)
                            ) {
                                Text(text = "Back")
                            }
                        }

                    }

                }
            }
        }

        showCard.value = true
    }

}