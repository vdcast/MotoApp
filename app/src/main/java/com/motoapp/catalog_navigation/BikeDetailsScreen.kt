package com.motoapp.catalog_navigation

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import coil.compose.AsyncImage
import com.motoapp.models.ItemBikeDescription
import com.motoapp.ui.theme.Green04
import com.motoapp.ui.theme.Green08
import com.motoapp.ui.theme.Green50

@Composable
fun BikeDetailsScreen(
    navController: NavController,
    itemBikeDescription: ItemBikeDescription
) {
    val numberOfImageToShow = remember { mutableStateOf(0) }

//    val listOfImages = listOf(
//        "https://azwecdnepstoragewebsiteuploads.azureedge.net/PHO_BIKE_90_RE_496212-MY24-KTM-450-SX-F-90-Right-Studio_%23SALL_%23AEPI_%23V1.png",
//        "https://azwecdnepstoragewebsiteuploads.azureedge.net/PHO_BIKE_PERS_REHI_MY24-KTM-450-SX-F-rear-right-Studio_%23SALL_%23AEPI_%23V1.png",
//        "https://azwecdnepstoragewebsiteuploads.azureedge.net/PHO_BIKE_PERS_LIHI_MY24-KTM-450-SX-F-rear-Left-Studio_%23SALL_%23AEPI_%23V1.png",
//        "https://azwecdnepstoragewebsiteuploads.azureedge.net/PHO_BIKE_90_LI_MY24-KTM-450-SX-F-90-Left-Studio_%23SALL_%23AEPI_%23V1.png",
//        "https://azwecdnepstoragewebsiteuploads.azureedge.net/PHO_BIKE_PERS_LIVO_MY24-KTM-450-SX-F-Front-Left-Studio_%23SALL_%23AEPI_%23V1.png",
//        "https://azwecdnepstoragewebsiteuploads.azureedge.net/PHO_BIKE_PERS_REVO_MY24-KTM-450-SX-F-Front-right-Studio_%23SALL_%23AEPI_%23V1.png",
//    )



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
                    text = itemBikeDescription.title,
                    modifier = Modifier
                        .padding(top = 16.dp, bottom = 8.dp)
                )
            }
            item {
                AsyncImage(
                    model = itemBikeDescription.listOfImages[numberOfImageToShow.value],
                    contentDescription = null,
                    modifier = Modifier.clickable {
                        if (numberOfImageToShow.value >= itemBikeDescription.listOfImages.size-1){
                            numberOfImageToShow.value = 0
                        } else {
                            numberOfImageToShow.value++
                        }
                    }
                )
            }

            item {
                Text(
                    text = itemBikeDescription.model,
                    modifier = Modifier
                        .padding(top = 16.dp, bottom = 4.dp)
                )
            }
            item {
                Text(
                    text = itemBikeDescription.year,
                    modifier = Modifier
                        .padding(bottom = 4.dp)
                )
            }
            item {
                Text(
                    text = itemBikeDescription.category,
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
                        text = itemBikeDescription.engineAndTransmission,
                        fontSize = 20.sp
                    )
                }
            }
            item {
                Text(
                    text = itemBikeDescription.engineCapacity,
                    modifier = Modifier
                        .padding(bottom = 4.dp)
                )
            }
            item {
                Text(
                    text = itemBikeDescription.engineType,
                    modifier = Modifier
                        .padding(bottom = 4.dp)
                )
            }
            item {
                Text(
                    text = itemBikeDescription.enginePower,
                    modifier = Modifier
                        .padding(bottom = 4.dp)
                )
            }
            item {
                Text(
                    text = itemBikeDescription.cylinderPiston,
                    modifier = Modifier
                        .padding(bottom = 4.dp)
                )
            }
            item {
                Text(
                    text = itemBikeDescription.fuelSystem,
                    modifier = Modifier
                        .padding(bottom = 4.dp)
                )
            }
            item {
                Text(
                    text = itemBikeDescription.engineIgnition,
                    modifier = Modifier
                        .padding(bottom = 4.dp)
                )
            }
            item {
                Text(
                    text = itemBikeDescription.lubricationSystem,
                    modifier = Modifier
                        .padding(bottom = 4.dp)
                )
            }
            item {
                Text(
                    text = itemBikeDescription.coolingSystem,
                    modifier = Modifier
                        .padding(bottom = 4.dp)
                )
            }
            item {
                Text(
                    text = itemBikeDescription.transmission,
                    modifier = Modifier
                        .padding(bottom = 4.dp)
                )
            }
            item {
                Text(
                    text = itemBikeDescription.engineDrive,
                    modifier = Modifier
                        .padding(bottom = 4.dp)
                )
            }
            item {
                Text(
                    text = itemBikeDescription.clutch,
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
                        text = itemBikeDescription.chassisSuspensionBrakesAndWheels,
                        fontSize = 20.sp
                    )
                }
            }
            item {
                Text(
                    text = itemBikeDescription.frameType,
                    modifier = Modifier
                        .padding(bottom = 4.dp)
                )
            }
            item {
                Text(
                    text = itemBikeDescription.frontCorner,
                    modifier = Modifier
                        .padding(bottom = 4.dp)
                )
            }
            item {
                Text(
                    text = itemBikeDescription.frontSuspension,
                    modifier = Modifier
                        .padding(bottom = 4.dp)
                )
            }
            item {
                Text(
                    text = itemBikeDescription.frontWheelTravel,
                    modifier = Modifier
                        .padding(bottom = 4.dp)
                )
            }
            item {
                Text(
                    text = itemBikeDescription.rearSuspension,
                    modifier = Modifier
                        .padding(bottom = 4.dp)
                )
            }
            item {
                Text(
                    text = itemBikeDescription.rearWheelTravel,
                    modifier = Modifier
                        .padding(bottom = 4.dp)
                )
            }
            item {
                Text(
                    text = itemBikeDescription.frontBrake,
                    modifier = Modifier
                        .padding(bottom = 4.dp)
                )
            }
            item {
                Text(
                    text = itemBikeDescription.rearBrake,
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
                        text = itemBikeDescription.physicalCharacteristicsAndCapacity,
                        fontSize = 20.sp
                    )
                }
            }
            item {
                Text(
                    text = itemBikeDescription.dryWeight,
                    modifier = Modifier
                        .padding(bottom = 4.dp)
                )
            }
            item {
                Text(
                    text = itemBikeDescription.powerMassRatio,
                    modifier = Modifier
                        .padding(bottom = 4.dp)
                )
            }
            item {
                Text(
                    text = itemBikeDescription.seatHeight,
                    modifier = Modifier
                        .padding(bottom = 4.dp)
                )
            }
            item {
                Text(
                    text = itemBikeDescription.clearance,
                    modifier = Modifier
                        .padding(bottom = 4.dp)
                )
            }
            item {
                Text(
                    text = itemBikeDescription.fuelTankCapacity,
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
                        text = itemBikeDescription.otherSpecifications,
                        fontSize = 20.sp
                    )
                }

            }
            item {
                Text(
                    text = itemBikeDescription.dryWieght,
                    modifier = Modifier
                        .padding(bottom = 4.dp)
                )
            }

            item {
                OutlinedButton(
                    onClick = { navController.popBackStack() },
                    modifier = Modifier
                        .fillMaxWidth(0.75f)
                        .padding(top = 8.dp),
                    elevation = ButtonDefaults.buttonElevation(8.dp),
                    colors = ButtonDefaults.elevatedButtonColors(Green50)
                ) {
                    Text(text = "Manual for ${itemBikeDescription.title}")
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