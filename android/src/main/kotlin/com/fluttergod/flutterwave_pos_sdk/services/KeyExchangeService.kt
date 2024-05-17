package com.fluttergod.flutterwave_pos_sdk.services

import android.content.Context
import android.content.Intent
import androidx.activity.result.ActivityResultLauncher

object KeyExchangeService {
    fun keyExchange(
        context: Context,
        logoLink: String,
        companyName: String,
        keyExchangeIntent: ActivityResultLauncher<Intent>

    ) {
        //TODO: Change the logo
        val intent = Intent(FLUTTER_WAVE_KEY_EXCHANGE_INTENT)
            .putExtra(
                "CUSTOM_LOGO",
                logoLink,
            )
            .putExtra("MERCHANT_NAME", companyName)
        keyExchangeIntent.launch(intent)
    }

    private const val FLUTTER_WAVE_KEY_EXCHANGE_INTENT = "com.flutterwave.pos.PARAMETERS"

}

//"https://flutterwave-pos.s3.us-east-2.amazonaws.com/assets/irecharge_icon.jpeg"