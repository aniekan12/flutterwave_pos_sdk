package com.fluttergod.flutterwave_pos_sdk.models.terminal

import androidx.annotation.Keep


@Keep
data class FlutterwaveTransaction(
    val amount: String,
    val shouldPrint: Boolean? = true,
    val transactionType: List<String>? = listOf(TransactionType.CARD.name)
)

enum class TransactionType {
    CARD, TRANSFER, USSD, MOMO, QR
}