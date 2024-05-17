package com.fluttergod.flutterwave_pos_sdk.models.terminal


import androidx.annotation.Keep

@Keep
data class TransactionResponse(
    val statusCode: String,
    val message: String,
    val data: TransactionData
)

@Keep
data class TransactionData(
    val source: String?,
    val customerName: String?,
    val customerPhone: String?,
    val rrn: String?,
    val terminalId: String?,
    val fee: String?,
    val posId: String?,
    val amount: String?,
    val currencyCode: String?,
    val cardHolder: String?,
    val expiry: String?,
    val authCode: String?,
    val cardType: String?,
    val refCode: String?,
    val type: String?,
    val pan: String?,
    val responseCode: String?,
    val aid: String?,
    val maskedPan: String?,
    val responseMessage: String?,
    val stan: String?,
    var merchantId: String?,
)
