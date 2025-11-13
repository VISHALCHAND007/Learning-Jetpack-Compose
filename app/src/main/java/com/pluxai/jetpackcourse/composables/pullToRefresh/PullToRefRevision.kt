package com.pluxai.jetpackcourse.composables.pullToRefresh

import androidx.compose.animation.Crossfade
import androidx.compose.animation.core.tween
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.asPaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.systemBars
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.ListItem
import androidx.compose.material3.Text
import androidx.compose.material3.pulltorefresh.PullToRefreshBox
import androidx.compose.material3.pulltorefresh.PullToRefreshDefaults
import androidx.compose.material3.pulltorefresh.PullToRefreshState
import androidx.compose.material3.pulltorefresh.pullToRefreshIndicator
import androidx.compose.material3.pulltorefresh.rememberPullToRefreshState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

@Composable
fun PullToRefSample2() {
    val scope = rememberCoroutineScope()
    var items by remember { mutableStateOf(List(20) { "item $it" }) }
    var isRefreshing by remember { mutableStateOf(false) }

    fun refreshItems() {
        scope.launch {
            isRefreshing = true
            delay(2000)
            items = List(20) { "<--- #${(1..100).random()} --->" }

            isRefreshing = false
        }
    }

    PullToRefreshCustomIndicator2(
        isRefreshing,
        items,
        ::refreshItems
    )
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun PullToRefreshCustomIndicator2(isRefreshing: Boolean, items: List<String>, refresh: () -> Unit) {
    val state = rememberPullToRefreshState()
    val paddingDefaults = WindowInsets.systemBars.asPaddingValues()

    PullToRefreshBox(
        isRefreshing = isRefreshing,
        state = state,
        onRefresh = refresh,
        indicator = {
            CustomRefreshIndicator(
                isRefreshing,
                state
            )
        },
        modifier = Modifier.fillMaxSize()
            .background(Color.LightGray),
        contentAlignment = Alignment.TopCenter
    ) {
        LazyColumn(
            modifier = Modifier.fillMaxWidth()
                .padding(top = paddingDefaults.calculateTopPadding(), bottom = paddingDefaults.calculateBottomPadding())
        ) {
            items(items) {
                ListItem({
                    Card(
                        shape = RoundedCornerShape(10.dp)
                    ){
                        Text(
                            text = it,
                            modifier = Modifier.fillMaxWidth()
                                .padding(10.dp),
                            textAlign = TextAlign.Center
                        )
                    }
                })
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CustomRefreshIndicator(isRefreshing: Boolean, state: PullToRefreshState) {
    Box(
        modifier = Modifier.pullToRefreshIndicator(
            state = state,
            threshold = PullToRefreshDefaults.PositionalThreshold,
            containerColor = PullToRefreshDefaults.containerColor,
            isRefreshing = isRefreshing
        ),
        contentAlignment = Alignment.Center
    ) {
        Crossfade(
            targetState = isRefreshing,
            animationSpec = tween(1000)
        ) { isRefreshing ->
            if (isRefreshing) {
                CircularProgressIndicator()
            }
        }
    }
}