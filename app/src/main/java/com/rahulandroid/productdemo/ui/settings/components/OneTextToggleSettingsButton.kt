package com.rahulandroid.productdemo.ui.settings.components

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

/**
 * @param title The name of the Settings Action
 * @param state The state to toggle the [Switch]
 * @param hasDivider Whether to have
 * */
@Composable
fun OneTextToggleSettingsButton(
    title: String,
    state: MutableState<Boolean>,
    hasDivider: Boolean = true,
    onCheckedChange: () -> Unit
) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .background(MaterialTheme.colorScheme.surface)
            .clickable {
                state.value = !state.value
                onCheckedChange()
            },
    ) {
        Row(
            modifier = Modifier.padding(horizontal = 16.dp, vertical = 8.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                text = title,
                fontSize = 18.sp,
                overflow = TextOverflow.Ellipsis,
                color = MaterialTheme.colorScheme.onSurface,
                modifier = Modifier.weight(1f)
            )
            Switch(
                modifier = Modifier.padding(start = 8.dp),
                checked = state.value, onCheckedChange = {
                    state.value = !state.value
                    onCheckedChange()
                })
        }
        if (hasDivider) Divider(
            modifier = Modifier.padding(horizontal = 16.dp),
            color = MaterialTheme.colorScheme.onSurface.copy(alpha = 0.12f)
        )
    }
}