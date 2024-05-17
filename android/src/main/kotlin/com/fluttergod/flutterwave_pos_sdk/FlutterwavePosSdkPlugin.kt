package com.fluttergod.flutterwave_pos_sdk

import android.app.Activity
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.result.ActivityResultCallback
import androidx.activity.result.ActivityResultLauncher
import androidx.activity.result.contract.ActivityResultContract
import androidx.activity.result.contract.ActivityResultContracts
import com.fluttergod.flutterwave_pos_sdk.models.terminal.ParameterResponse
import com.fluttergod.flutterwave_pos_sdk.services.KeyExchangeService
import com.google.gson.Gson
import io.flutter.Log
import io.flutter.embedding.engine.plugins.FlutterPlugin
import io.flutter.plugin.common.MethodCall
import io.flutter.plugin.common.MethodChannel
import io.flutter.plugin.common.MethodChannel.MethodCallHandler
import io.flutter.plugin.common.MethodChannel.Result
import io.flutter.embedding.android.FlutterFragmentActivity


/** FlutterwavePosSdkPlugin */
class FlutterwavePosSdkPlugin : FlutterPlugin, MethodCallHandler, FlutterFragmentActivity() {
    /// The MethodChannel that will the communication between Flutter and native Android
    ///
    /// This local reference serves to register the plugin with the Flutter Engine and unregister it
    /// when the Flutter Engine is detached from the Activity
    private lateinit var channel: MethodChannel
    private val gson by lazy {
        Gson()
    }

    private fun <I, O> Activity.registerForActivityResult(
        contract: ActivityResultContract<I, O>,
        callback: ActivityResultCallback<O>
    ): ActivityResultLauncher<I> {
        return (this).registerForActivityResult(contract, callback)
    }


    private lateinit var result: Result

    private val keyExchangeIntent =
        registerForActivityResult(ActivityResultContracts.StartActivityForResult()) { keyExchangeResult ->
            val result = keyExchangeResult.data
            val parametersResult =
                result?.getStringExtra("PARAMETERS_EXTRA")
            val results = gson.fromJson(parametersResult, ParameterResponse::class.java)
            when (results?.statusCode) {
                "00" -> {
                    this.result.success(parametersResult)
                    Toast.makeText(
                        this,
                        "Key exchange successful",
                        Toast.LENGTH_LONG
                    ).show()
                    Log.d("parameters", parametersResult.toString())
                }

                "02" -> {
                    this.result.error("02", "An error occurred", null)
                }
            }
        }

//    private fun handleKeyExchange(call: MethodCall) {
//        val keyExchangeIntent = registerForActivityResult(ActivityResultContracts.StartActivityForResult()) { keyExchangeResult ->
//            val result = keyExchangeResult.data
//            val parametersResult = result?.getStringExtra("PARAMETERS_EXTRA")
//            val results = gson.fromJson(parametersResult, ParameterResponse::class.java)
//            when (results?.statusCode) {
//                "00" -> {
//                    this.result.success(parametersResult)
//                    Toast.makeText(this, "Key exchange successful", Toast.LENGTH_LONG).show()
//                    Log.d("parameters", parametersResult.toString())
//                }
//                "02" -> {
//                    this.result.error("02", "An error occurred", null)
//                }
//            }
//        }
//        KeyExchangeService.keyExchange(
//            this,
//            call.argument<String>("logoLink")!!,
//            call.argument<String>("companyName")!!,
//            keyExchangeIntent
//        )
//    }

    override fun onAttachedToEngine(flutterPluginBinding: FlutterPlugin.FlutterPluginBinding) {
        channel = MethodChannel(flutterPluginBinding.binaryMessenger, "flutterwave_pos_sdk")
        channel.setMethodCallHandler(this)
    }

    override fun onMethodCall(call: MethodCall, result: Result) {
        this.result = result
        when (call.method) {

            "keyExchange" -> {
                KeyExchangeService.keyExchange(
                    this,
                    call.argument<String>("logoLink")!!,
                    call.argument<String>("companyName")!!,
                    keyExchangeIntent

                )

            }

            else -> result.notImplemented()
        }
    }

    override fun onDetachedFromEngine(binding: FlutterPlugin.FlutterPluginBinding) {
        channel.setMethodCallHandler(null)
    }
}

