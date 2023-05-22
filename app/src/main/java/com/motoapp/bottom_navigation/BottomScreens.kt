package com.motoapp.bottom_navigation

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.motoapp.ui.theme.Green04
import com.motoapp.ui.theme.Green10

// first screen, for now it will be screen of Moto Catalog
@Composable
fun BottomScreen1() {
    Box(
        modifier = Modifier
            .padding(bottom = 80.dp)
            .fillMaxSize()
            .background(Green04),
        contentAlignment = Alignment.Center
    ){
        Text(
            text = "Screen 1"
        )
    }


}

@Composable
fun BottomScreen2() {
    Text(
        text = "Screen 2",
        modifier = Modifier.fillMaxSize().wrapContentHeight(),
        textAlign = TextAlign.Center
    )
}

@Composable
fun BottomScreen3() {
    Text(
        text = "Screen 3",
        modifier = Modifier.fillMaxSize().wrapContentHeight(),
        textAlign = TextAlign.Center
    )
}

@Composable
fun BottomScreen4() {
    Text(
        text = "Screen 4",
        modifier = Modifier.fillMaxSize().wrapContentHeight(),
        textAlign = TextAlign.Center
    )
}

