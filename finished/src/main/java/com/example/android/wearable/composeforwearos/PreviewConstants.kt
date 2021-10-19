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

/**
 * Creates all the defaults needed for a proper Compose Preview of Wear specific sizes
 * (an individual element, a row in a Wearable, and a full Wear device).
 */
const val WEAR_PREVIEW_ELEMENT_WIDTH_DP = 100
const val WEAR_PREVIEW_ELEMENT_HEIGHT_DP = 100

const val WEAR_PREVIEW_ROW_WIDTH_DP = 300
const val WEAR_PREVIEW_ROW_HEIGHT_DP = 100

const val WEAR_PREVIEW_DEVICE_WIDTH_DP = 300
const val WEAR_PREVIEW_DEVICE_HEIGHT_DP = 300

const val WEAR_PREVIEW_API_LEVEL = 26

const val WEAR_PREVIEW_UI_MODE = Configuration.UI_MODE_TYPE_WATCH

const val WEAR_PREVIEW_BACKGROUND_COLOR_BLACK: Long = 0x000000
const val WEAR_PREVIEW_SHOW_BACKGROUND = true
