package com.amahop.farefirst.ffprotect.sync.repositories.pojos

import android.os.Build

data class ModelInfo(
    val product: String? = Build.PRODUCT,
    val brand: String? = Build.BRAND,
    val model: String? = Build.MODEL,
    val manufacturer: String? = Build.MANUFACTURER
)