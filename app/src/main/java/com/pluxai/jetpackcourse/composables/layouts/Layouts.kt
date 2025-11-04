package com.pluxai.jetpackcourse.composables.layouts

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ConstraintLayout


// Used to arrange the children in vertical manner.
@Composable
fun ColumnSample() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(30.dp)
            .background(Color.Gray),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text("text 1")
        Text("text 2")
        Text("text 3")
        Text("text 4")
        Text("text 5")
    }
}

//Used to arrange its children in horizontal manner.
@Composable
fun RowSample() {
    Row(
        modifier = Modifier
            .fillMaxSize()
            .padding(40.dp)
            .background(Color.Cyan),
        horizontalArrangement = Arrangement.Center,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Text("text 1")
        Text("text 2")
        Text("text 3")
        Text("text 4")
        Text("text 5")
    }
}

//Used to arrange its children in stacked manner.
@Composable
fun BoxSample() {
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Box(
            modifier = Modifier
                .size(200.dp)
                .background(Color.Black),
            contentAlignment = Alignment.Center
        ) {
            Box(
                modifier = Modifier
                    .size(100.dp)
                    .graphicsLayer(rotationZ = 45f)
                    .background(Color.Red)
            ) {

            }
        }
    }
}

//Constraint layout: Used only when needed and UI is complex
@Composable
fun ConstraintLayoutSample() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .padding(10.dp),
        contentAlignment = Alignment.Center
    ) {
        ConstraintLayout(
            modifier = Modifier
                .fillMaxWidth()
                .height(200.dp)
                .background(Color.LightGray),
        ) {
            val (text1, text2, text3) = createRefs()

            Text(
                "Bottom Left",
                modifier = Modifier.constrainAs(text1) {
                    bottom.linkTo(parent.bottom, margin = 10.dp)
                    start.linkTo(parent.start, margin = 10.dp)
                })

            Text(
                "Centered Text",
                modifier = Modifier
                    .graphicsLayer(rotationZ = 45f)
                    .constrainAs(text2) {
                    start.linkTo(parent.start)
                    end.linkTo(parent.end)
                    top.linkTo(parent.top)
                    bottom.linkTo(parent.bottom)
                }
            )

            Text(
                "Top Right",
                modifier = Modifier.constrainAs(text3) {
                    end.linkTo(parent.end, margin = 10.dp)
                    top.linkTo(parent.top, margin = 10.dp)
                }
            )
        }
    }
}

//Best practice: Avoid over nesting of layouts (Max 5 per layout is enough)