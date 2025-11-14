package com.pluxai.jetpackcourse.composables.searchBar

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.asPaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.systemBars
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.text.input.TextFieldState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.ListItem
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.SearchBar
import androidx.compose.material3.SearchBarDefaults.InputField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.semantics.isTraversalGroup
import androidx.compose.ui.semantics.semantics

@Composable
fun SearchBarExample() {
    val textFieldState = remember { TextFieldState() }
    var searchResults by remember { mutableStateOf(listOf<String>()) }

    val onSearch: (String) -> Unit = { query ->
        searchResults = listOf(
            "result  I for $query",
            "result  II for $query",
            "result III for $query",
        )
    }

    SearchBarCustom(
        textFieldState,
        onSearch,
        searchResults
    )
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SearchBarCustom(
    textFieldState: TextFieldState,
    search: (String) -> Unit,
    searchResults: List<String>
) {
    var expanded by rememberSaveable { mutableStateOf(false) }
    val paddingDef = WindowInsets.systemBars.asPaddingValues()

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(MaterialTheme.colorScheme.inverseOnSurface)
            .padding(
                top = paddingDef.calculateTopPadding(),
                bottom = paddingDef.calculateBottomPadding()
            )
            .semantics { isTraversalGroup = true }
    ) {
        SearchBar(
            modifier = Modifier
                .semantics { isTraversalGroup = true }
                .align(Alignment.TopCenter),
            expanded = expanded,
            onExpandedChange = { expanded = it },
            inputField = {
                InputField(
                    query = textFieldState.text.toString(),
                    onQueryChange = { newText ->
                        textFieldState.edit {
                            replace(0, length, newText)
                        }
                        search(newText)
                        expanded = true
                    },
                    expanded = expanded,
                    onExpandedChange = { expanded = it },
                    placeholder = { Text("Search") },
                    onSearch = {
                        search(textFieldState.text.toString())
                        expanded = false
                    }
                )
            }
        ) {
            Column(
                modifier = Modifier.verticalScroll(
                    rememberScrollState()
                )
            ) {
                searchResults.forEach { item ->
                    ListItem(
                        headlineContent = {
                            Text(text = item)
                        },
                        modifier = Modifier
                            .clickable {
                                textFieldState.edit {
                                    replace(0, length, item)
                                }
                                expanded = false
                            }
                            .fillMaxWidth()
                    )
                }
            }
        }
    }
}