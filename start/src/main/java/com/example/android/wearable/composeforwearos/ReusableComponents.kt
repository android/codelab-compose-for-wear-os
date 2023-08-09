/*
 * Copyright 2021 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.android.wearable.composeforwearos

import android.content.res.Configuration
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Message
import androidx.compose.material.icons.rounded.Phone
import androidx.compose.material.icons.rounded.SelfImprovement
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.wear.compose.material.AppCard
import androidx.wear.compose.material.Button
import androidx.wear.compose.material.ButtonDefaults
import androidx.wear.compose.material.Chip
import androidx.wear.compose.material.Icon
import androidx.wear.compose.material.MaterialTheme
import androidx.wear.compose.material.Text
import androidx.wear.compose.material.ToggleChip
import androidx.wear.compose.material.ToggleChipDefaults
import com.example.android.wearable.composeforwearos.theme.WearAppTheme

/* Contains individual Wear OS demo composables for the code lab. */

// TODO: Create a Button Composable (with a Row to center)
@Composable
fun ButtonExample(
    modifier: Modifier = Modifier,
    iconModifier: Modifier = Modifier
) {

}

// TODO: Create a Text Composable
@Composable
fun TextExample(modifier: Modifier = Modifier) {

}

// TODO: Create a Card (specifically, an AppCard) Composable
@Composable
fun CardExample(
    modifier: Modifier = Modifier,
    iconModifier: Modifier = Modifier
) {

}

// TODO: Create a Chip Composable
@Composable
fun ChipExample(
    modifier: Modifier = Modifier,
    iconModifier: Modifier = Modifier
) {

}

// TODO: Create a ToggleChip Composable
@Composable
fun ToggleChipExample(modifier: Modifier = Modifier) {

}

// Function only used as a demo for when you start the code lab (removed as step 1).
@Composable
fun StartOnlyTextComposables() {
    Text(
        modifier = Modifier.fillMaxSize(),
        textAlign = TextAlign.Center,
        color = MaterialTheme.colors.primary,
        text = stringResource(R.string.hello_world_starter)
    )
}

/* Previews of Composables. */

// Hello, world starter text preview
@Preview(
    apiLevel = 26,
    uiMode = Configuration.UI_MODE_TYPE_WATCH,
    device = Devices.WEAR_OS_SMALL_ROUND
)
@Composable
fun StartOnlyTextComposablesPreview() {
    WearAppTheme {
        StartOnlyTextComposables()
    }
}

// Button Preview
@Preview(
    apiLevel = 26,
    uiMode = Configuration.UI_MODE_TYPE_WATCH,
    device = Devices.WEAR_OS_SMALL_ROUND
)
@Composable
fun ButtonExamplePreview() {
    WearAppTheme {
        ButtonExample(
            modifier = Modifier.fillMaxWidth().padding(bottom = 8.dp),
            iconModifier = Modifier.size(24.dp).wrapContentSize(align = Alignment.Center)
        )
    }
}

// Text Preview
@Preview(
    apiLevel = 26,
    uiMode = Configuration.UI_MODE_TYPE_WATCH,
    device = Devices.WEAR_OS_SMALL_ROUND
)
@Composable
fun TextExamplePreview() {
    WearAppTheme {
        TextExample(
            modifier = Modifier.fillMaxWidth().padding(bottom = 8.dp)
        )
    }
}

// Card Preview
@Preview(
    apiLevel = 26,
    uiMode = Configuration.UI_MODE_TYPE_WATCH,
    device = Devices.WEAR_OS_SMALL_ROUND
)
@Composable
fun CardExamplePreview() {
    WearAppTheme {
        CardExample(
            modifier = Modifier.fillMaxWidth().padding(bottom = 8.dp),
            iconModifier = Modifier.size(24.dp).wrapContentSize(align = Alignment.Center)
        )
    }
}


// Chip Preview
@Preview(
    apiLevel = 26,
    uiMode = Configuration.UI_MODE_TYPE_WATCH,
    device = Devices.WEAR_OS_SMALL_ROUND
)
@Composable
fun ChipExamplePreview() {
    WearAppTheme {
        ChipExample(
            modifier = Modifier.fillMaxWidth().padding(bottom = 8.dp),
            iconModifier = Modifier.size(24.dp).wrapContentSize(align = Alignment.Center)
        )
    }
}

// Toggle Chip Preview
@Preview(
    apiLevel = 26,
    uiMode = Configuration.UI_MODE_TYPE_WATCH,
    device = Devices.WEAR_OS_SMALL_ROUND
)
@Composable
fun ToggleChipExamplePreview() {
    WearAppTheme {
        ToggleChipExample(
            modifier = Modifier.fillMaxWidth().padding(bottom = 8.dp)
        )
    }
}
