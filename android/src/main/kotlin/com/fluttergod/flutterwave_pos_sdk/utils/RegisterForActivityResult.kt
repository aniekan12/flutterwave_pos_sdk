package com.fluttergod.flutterwave_pos_sdk.utils

import android.app.Activity
import androidx.activity.ComponentActivity
import androidx.activity.result.ActivityResultCallback
import androidx.activity.result.contract.ActivityResultContract

private fun <I, O> Activity.registerForActivityResult(
    contract: ActivityResultContract<I, O>,
    callback: ActivityResultCallback<O>
) = (this as ComponentActivity).registerForActivityResult(contract, callback)
