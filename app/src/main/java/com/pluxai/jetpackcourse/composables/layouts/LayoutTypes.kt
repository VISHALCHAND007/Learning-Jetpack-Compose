package com.pluxai.jetpackcourse.composables.layouts

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp

//Lazy column: Preferred for lists (vertically scrollable)
@Composable
fun LazyColumnSample() {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center
    ) {
        Text("Lazy Column (preferred for the lists)")
        LazyColumn(
            modifier = Modifier
                .fillMaxWidth()
                .height(200.dp)
                .background(Color.LightGray)
        ) {
            items(100) { index ->
                Text(
                    "Item $index", Modifier
                        .fillMaxWidth()
                        .padding(16.dp)
                        .background(Color.White)
                )
            }
        }
    }
}

//Lazy row: Preferred for the lists (horizontally scrollable)
@Composable
fun LazyRowSample() {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center
    ) {
        Text("Lazy Row (preferred for the horizontal scrolling)")
        LazyRow(
            modifier = Modifier.fillMaxWidth()
                .height(100.dp)
                .background(Color.LightGray)
        ) {
            items(100) { ind ->
                Text(
                    "item $ind",
                    Modifier
                        .width(100.dp)
                        .height(100.dp)
                        .padding(16.dp)
                        .background(Color.White),
                )
            }
        }
    }
}