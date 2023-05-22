package com.motoapp.catalog_navigation

import android.graphics.fonts.FontStyle
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.gestures.Orientation
import androidx.compose.foundation.gestures.scrollable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import coil.compose.AsyncImage
import com.motoapp.models.ListOfModelsOfBrand
import com.motoapp.ui.theme.Green04
import com.motoapp.ui.theme.Green08
import com.motoapp.ui.theme.Green10
import com.motoapp.ui.theme.Green30
import com.motoapp.ui.theme.Green50
import com.motoapp.ui.theme.Green70
import java.time.format.TextStyle

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
                    ListOfModelsOfBrand("450 SX-F 2024","ktm450SXF2024"),
                    ListOfModelsOfBrand("350 SX-F 2024","ktm350SXF2024"),
                    ListOfModelsOfBrand("250 SX-F 2024","ktm250SXF2024"),
                    ListOfModelsOfBrand("450 SX-F FACTORY EDITION 2023","ktm450SXFFactoryEdition2024"),
                )
            ) {index, item ->
                OutlinedButton(
                    onClick = { navController.navigate(item.route) },
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
                listOf(
                    "300 SX 2024", "250 SX 2024", "125 SX 2024", "85 SX 19/16 2024",
                    "85 SX 17/14 2024", "65 SX 2023", "50 SX FACTORY EDITION 2023",
                    "50 SX 2023", "50 SX MINI 2023"
                )
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
fun Ktm450SXF2024Screen(navController: NavController) {

    val listOfImages = listOf(
        "https://azwecdnepstoragewebsiteuploads.azureedge.net/PHO_BIKE_90_RE_496212-MY24-KTM-450-SX-F-90-Right-Studio_%23SALL_%23AEPI_%23V1.png",
        "https://azwecdnepstoragewebsiteuploads.azureedge.net/PHO_BIKE_PERS_REHI_MY24-KTM-450-SX-F-rear-right-Studio_%23SALL_%23AEPI_%23V1.png",
        "https://azwecdnepstoragewebsiteuploads.azureedge.net/PHO_BIKE_PERS_LIHI_MY24-KTM-450-SX-F-rear-Left-Studio_%23SALL_%23AEPI_%23V1.png",
        "https://azwecdnepstoragewebsiteuploads.azureedge.net/PHO_BIKE_90_LI_MY24-KTM-450-SX-F-90-Left-Studio_%23SALL_%23AEPI_%23V1.png",
        "https://azwecdnepstoragewebsiteuploads.azureedge.net/PHO_BIKE_PERS_LIVO_MY24-KTM-450-SX-F-Front-Left-Studio_%23SALL_%23AEPI_%23V1.png",
        "https://azwecdnepstoragewebsiteuploads.azureedge.net/PHO_BIKE_PERS_REVO_MY24-KTM-450-SX-F-Front-right-Studio_%23SALL_%23AEPI_%23V1.png",
    )

    val numberOfImageToShow = remember { mutableStateOf(0) }

    Box(
        modifier = Modifier
            .padding(bottom = 80.dp)
            .fillMaxSize()
            .background(Green04),
        contentAlignment = Alignment.Center
    ){
        LazyColumn(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 8.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            item {
                Text(
                    text = "KTM 450 SX-F 2024",
                    modifier = Modifier
                        .padding(top = 16.dp, bottom = 8.dp)
                )
            }
            item {
                AsyncImage(
                    model = listOfImages[numberOfImageToShow.value],
                    contentDescription = null,
                    modifier = Modifier.clickable {
                        if (numberOfImageToShow.value >= listOfImages.size-1){
                            numberOfImageToShow.value = 0
                        } else {
                            numberOfImageToShow.value++
                        }
                    }
                )
            }

            item {
                Text(
                    text = "Model: 450 SX-F",
                    modifier = Modifier
                        .padding(top = 16.dp, bottom = 4.dp)
                )
            }
            item {
                Text(
                    text = "Year: 2024",
                    modifier = Modifier
                        .padding(bottom = 4.dp)
                )
            }
            item {
                Text(
                    text = "Category: MX",
                    modifier = Modifier
                        .padding(bottom = 4.dp)
                )
            }

            // ENGINE and TRANSMISSION
            item {
                Box(
                    modifier = Modifier
                        .fillMaxSize()
                        .background(Green08)
                        .padding(bottom = 4.dp, top = 8.dp),
                    contentAlignment = Alignment.Center
                ){
                    Text(
                        text = "ENGINE and TRANSMISSION",
                        fontSize = 20.sp
                    )
                }
            }
            item {
                Text(
                    text = "Engine capacity : 124.8 cm3 (7.62 cubic inches)",
                    modifier = Modifier
                        .padding(bottom = 4.dp)
                )
            }
            item {
                Text(
                    text = "Engine type : Single cylinder, 2-stroke",
                    modifier = Modifier
                        .padding(bottom = 4.dp)
                )
            }
            item {
                Text(
                    text = "Engine power : 15.0 HP (10.9 kW)",
                    modifier = Modifier
                        .padding(bottom = 4.dp)
                )
            }
            item {
                Text(
                    text = "Cylinder x Piston : 54.0 x 54.5 mm (2.1 x 2.1 inches)",
                    modifier = Modifier
                        .padding(bottom = 4.dp)
                )
            }
            item {
                Text(
                    text = "Fuel System : Injection",
                    modifier = Modifier
                        .padding(bottom = 4.dp)
                )
            }
            item {
                Text(
                    text = "Engine Ignition : Vitesco Technologies EMS",
                    modifier = Modifier
                        .padding(bottom = 4.dp)
                )
            }
            item {
                Text(
                    text = "Lubrication System : Wet sump",
                    modifier = Modifier
                        .padding(bottom = 4.dp)
                )
            }
            item {
                Text(
                    text = "Cooling System : Liquid",
                    modifier = Modifier
                        .padding(bottom = 4.dp)
                )
            }
            item {
                Text(
                    text = "Transmission : 6-Speed",
                    modifier = Modifier
                        .padding(bottom = 4.dp)
                )
            }
            item {
                Text(
                    text = "Engine drive : X-Ring 5/8 x 1/4 A chain",
                    modifier = Modifier
                        .padding(bottom = 4.dp)
                )
            }
            item {
                Text(
                    text = "Clutch : Wet multi-disc DS clutch, Brembo Hydraulics",
                    modifier = Modifier
                        .padding(bottom = 4.dp)
                )
            }
            // CHASSIS
            item {
                Box(
                    modifier = Modifier
                        .fillMaxSize()
                        .background(Green08)
                        .padding(bottom = 4.dp, top = 8.dp),
                    contentAlignment = Alignment.Center
                ){
                    Text(
                        text = "CHASSIS, SUSPENSION, BRAKES and WHEELS",
                        fontSize = 20.sp
                    )
                }
            }
            item {
                Text(
                    text = "Frame Type : Central double-cradle-type 25CrMo4 steel",
                    modifier = Modifier
                        .padding(bottom = 4.dp)
                )
            }
            item {
                Text(
                    text = "Front Corner (Fork Angle) : 26.1\u00B0",
                    modifier = Modifier
                        .padding(bottom = 4.dp)
                )
            }
            item {
                Text(
                    text = "Front Suspension : WP XACT-USD, A 48 mm",
                    modifier = Modifier
                        .padding(bottom = 4.dp)
                )
            }
            item {
                Text(
                    text = "Front Wheel Travel : 310 mm (12.2 inches)",
                    modifier = Modifier
                        .padding(bottom = 4.dp)
                )
            }
            item {
                Text(
                    text = "Rear Suspension : WP XACT Monoshock with linkage",
                    modifier = Modifier
                        .padding(bottom = 4.dp)
                )
            }
            item {
                Text(
                    text = "Rear Wheel Travel : 300 mm (11.8 inches)",
                    modifier = Modifier
                        .padding(bottom = 4.dp)
                )
            }
            item {
                Text(
                    text = "Front Brake : Single disc",
                    modifier = Modifier
                        .padding(bottom = 4.dp)
                )
            }
            item {
                Text(
                    text = "Rear brake : Single disc",
                    modifier = Modifier
                        .padding(bottom = 4.dp)
                )
            }
            // PHYSICAL STATS
            item {
                Box(
                    modifier = Modifier
                        .fillMaxSize()
                        .background(Green08)
                        .padding(bottom = 4.dp, top = 8.dp),
                    contentAlignment = Alignment.Center
                ){
                    Text(
                        text = "PHYSICAL CHARACTERISTICS and CAPACITY",
                        fontSize = 20.sp
                    )
                }
            }
            item {
                Text(
                    text = "Dry Weight : 92.4 kg (203.7 pounds)",
                    modifier = Modifier
                        .padding(bottom = 4.dp)
                )
            }
            item {
                Text(
                    text = "Power / Mass Ratio : 0.1623 HP / kg",
                    modifier = Modifier
                        .padding(bottom = 4.dp)
                )
            }
            item {
                Text(
                    text = "Seat Height: 958 mm (37.7 inches). If adjustable, lowest settings.",
                    modifier = Modifier
                        .padding(bottom = 4.dp)
                )
            }
            item {
                Text(
                    text = "Clearance : 359 mm (14.1 inches)",
                    modifier = Modifier
                        .padding(bottom = 4.dp)
                )
            }
            item {
                Text(
                    text = "Fuel Tank Capacity : 7.20 litres (1.90 US gallons",
                    modifier = Modifier
                        .padding(bottom = 4.dp)
                )
            }

            // OTHER SPECIFICATIONS
            item {
                Box(
                    modifier = Modifier
                        .fillMaxSize()
                        .background(Green08)
                        .padding(bottom = 4.dp, top = 8.dp),
                    contentAlignment = Alignment.Center
                ){
                    Text(
                        text = "OTHER SPECIFICATIONS",
                        fontSize = 20.sp
                    )
                }

            }
            item {
                Text(
                    text = "Dry Weight : 92.4 kg (203.7 pounds)",
                    modifier = Modifier
                        .padding(bottom = 4.dp)
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