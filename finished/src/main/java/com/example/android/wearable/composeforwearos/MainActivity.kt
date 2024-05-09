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

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.wear.compose.foundation.lazy.ScalingLazyColumn
import androidx.wear.compose.material.Scaffold
import com.example.android.wearable.composeforwearos.theme.WearAppTheme
import com.google.android.horologist.annotations.ExperimentalHorologistApi
import com.google.android.horologist.compose.layout.AppScaffold
import com.google.android.horologist.compose.layout.ScalingLazyColumn
import com.google.android.horologist.compose.layout.ScalingLazyColumnDefaults
import com.google.android.horologist.compose.layout.ScalingLazyColumnDefaults.ItemType
import com.google.android.horologist.compose.layout.ScreenScaffold
import com.google.android.horologist.compose.layout.rememberResponsiveColumnState

/**
 * This code lab is meant to help existing Compose developers get up to speed quickly on
 * Compose for Wear OS.
 *
 * The code lab walks through a majority of the simple composables for Wear OS (both similar to
 * existing mobile composables and new composables).
 *
 * It also covers more advanced composables like [ScalingLazyColumn] (Wear OS's version of
 * [LazyColumn]) and the Wear OS version of [Scaffold].The codelab explains the advantage of using
 * Horologist [ScalingLazyColumn] and Horologist [AppScaffold] and [ScreenScaffold] to simplify
 * code development to align with Wear OS UX guidance.
 *
 * Check out [this link](https://android-developers.googleblog.com/2021/10/compose-for-wear-os-now-in-developer.html)
 * for more information on Compose for Wear OS.
 */
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            WearApp()
        }
    }
}

@OptIn(ExperimentalHorologistApi::class)
@Composable
fun WearApp() {
    WearAppTheme {
        /* *************************** Part 4: Wear OS Scaffold *************************** */
        // TODO (Start): Create a AppScaffold (Wear Version)
        /*
         * [Horologist] AppScaffold adds a TimeText by default that can be override by the
         * ScreenScaffold. It ensures that TimeText animates correctly when navigating between
         * screens.
         * */
        AppScaffold {
            // TODO: Swap to ScalingLazyColumnState
        /*
         * Specifying the types of items that appear at the start and end of the list ensures that the
         * appropriate padding is used.
         */
            val listState = rememberResponsiveColumnState(
                contentPadding = ScalingLazyColumnDefaults.padding(
                    first = ItemType.SingleButton,
                    last = ItemType.Chip,
                ),
            )
            // Modifiers used by our Wear composables.
            val contentModifier = Modifier.fillMaxWidth().padding(bottom = 8.dp)
            val iconModifier = Modifier.size(24.dp).wrapContentSize(align = Alignment.Center)

            /* *************************** Part 4: Wear OS Scaffold *************************** */
            // TODO (Start): Create a ScreenScaffold (Wear Version)
            /*
             * [Horologist] ScreenScaffold is used in conjunction with AppScaffold and adds a
             * position indicator to the list by default.
             * */
            ScreenScaffold(
                scrollState = listState,
            ) {
                /* *************************** Part 3: ScalingLazyColumn *************************** */
                // TODO: Swap a ScalingLazyColumn (Wear's version of LazyColumn)
                /*
                 * [Horologist] ScalingLazyColumn applies padding for elements in the list to
                 * make sure no elements are clipped on different screen sizes.
                 * */
                ScalingLazyColumn(
                    columnState = listState,
                ) {
                    /* ******************* Part 1: Simple composables ******************* */
                    item { ButtonExample(contentModifier, iconModifier) }
                    item { TextExample(contentModifier) }
                    item { CardExample(contentModifier, iconModifier) }

                    /* ********************* Part 2: Wear unique composables ********************* */
                    item { ChipExample(contentModifier, iconModifier) }
                    item { ToggleChipExample(contentModifier) }
                }

                // TODO (End): Create a ScreenScaffold (Wear Version)
            }
            // TODO (End): Create a AppScaffold (Wear Version)
        }
    }
}
