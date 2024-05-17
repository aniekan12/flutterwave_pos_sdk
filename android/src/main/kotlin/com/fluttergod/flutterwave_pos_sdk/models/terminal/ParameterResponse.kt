package com.fluttergod.flutterwave_pos_sdk.models.terminal

import androidx.annotation.Keep

@Keep
data class ParameterResponse(
    val statusCode: String,
    val message: String,
    val terminalData: TerminalData
){

}