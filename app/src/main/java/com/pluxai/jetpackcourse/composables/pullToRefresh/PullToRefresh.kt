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
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.systemBars
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.ElevatedCard
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
fun PullToRefreshExample() {
    val scope = rememberCoroutineScope()
    var isRefreshing by remember {
        mutableStateOf(false)
    }
    var items by remember { mutableStateOf(List(20) { "<----- item \uD83E\uDEE1$it ----->"}) }

    fun refreshItems() {
        scope.launch {
            isRefreshing = true
            delay(1000) // 1 sec
            items = List(20) { "<----- item \uD83D\uDC7F${(0..100).random()} ----->" }
            isRefreshing = false
        }
    }

    PullToRefreshCustomIndicator(
        isRefreshing = isRefreshing,
        onRefresh = { refreshItems() },
        items = items
    )
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun PullToRefreshCustomIndicator(
    isRefreshing: Boolean,
    onRefresh: () -> Unit,
    items: List<String>,
    modifier: Modifier = Modifier
) {
    val state = rememberPullToRefreshState()
    val padding = WindowInsets.systemBars.asPaddingValues()

    PullToRefreshBox(
        isRefreshing = isRefreshing,
        indicator = {
            MyCustomIndicator(
                isRefreshing = isRefreshing,
                state = state
            )
        },
        onRefresh = onRefresh,
        state = state,
        contentAlignment = Alignment.Center,
        modifier = modifier
            .fillMaxSize()
    ) {
        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
                .background(Color.Gray)
                .padding(top = padding.calculateTopPadding(), bottom = padding.calculateBottomPadding())
        ) {
            items(items) {
                ListItem({
                    ElevatedCard(
                        modifier = Modifier.fillMaxWidth(),
                        shape = RoundedCornerShape(10.dp)
                    ) {
                        Text(
                            text = it, modifier = Modifier
                                .fillMaxWidth()
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
fun MyCustomIndicator(
    modifier: Modifier = Modifier,
    isRefreshing: Boolean,
    state: PullToRefreshState
) {
    Box(
        modifier = modifier.pullToRefreshIndicator(
            state = state,
            isRefreshing = isRefreshing,
            containerColor = PullToRefreshDefaults.containerColor,
            threshold = PullToRefreshDefaults.PositionalThreshold
        ),
        contentAlignment = Alignment.Center
    ) {
        Crossfade(
            targetState = isRefreshing,
            animationSpec = tween(1000),

            ) { isRefreshing ->
            if (isRefreshing) {
                CircularProgressIndicator(modifier = modifier.size(40.dp))
            }
        }
    }
}

//@Preview(showSystemUi = true)
//@Composable
//fun TextPreview() {
//    PullToRefreshExample()
//}