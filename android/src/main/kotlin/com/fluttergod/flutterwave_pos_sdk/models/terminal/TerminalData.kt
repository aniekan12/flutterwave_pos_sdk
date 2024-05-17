package com.fluttergod.flutterwave_pos_sdk.models.terminal


import androidx.annotation.Keep

@Keep
data class TerminalData (
    val merchantId: String,
    val terminalId: String
)