package com.pluxai.jetpackcourse.composables.cards

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.CardElevation
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.LineHeightStyle
import androidx.compose.ui.unit.dp
import com.pluxai.jetpackcourse.R

@Composable
fun CardSample() {
    Box(
        modifier = Modifier.fillMaxSize()
            .background(Color.LightGray),
        contentAlignment = Alignment.Center
    ) {
        ElevatedCard(
            modifier = Modifier.size(
                height = 200.dp, width = 300.dp
            ),
            elevation = CardDefaults.cardElevation(
                10.dp
            )
        ) {
            CardContent()
        }
    }
}

//Dummy data for a single card
@Composable
fun CardContent() {
    Row(modifier = Modifier.padding(5.dp)) {
        Image(
            painter = painterResource(R.drawable.skeleton),
            contentDescription = stringResource(R.string.skeleton),
            modifier = Modifier.size(100.dp)
        )
        Column(modifier = Modifier.padding(10.dp)) {
            Text("Name: Vishal Chand")
            Text("Designation: Android developer")
        }
    }
}