package com.motoapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.motoapp.bottom_navigation.MainScreenBottomNavigation
import com.motoapp.ui.theme.MotoAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MotoAppTheme {


                MainScreenBottomNavigation()


            }
        }
    }
}
