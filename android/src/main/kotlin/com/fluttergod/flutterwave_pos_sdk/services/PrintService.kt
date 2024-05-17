package com.fluttergod.flutterwave_pos_sdk.services


import android.content.Intent
import android.util.Log
import androidx.activity.result.ActivityResultLauncher


object PrintService {

//    fun startPrint(
//
//    ) {
//        val receipt = ReceiptService.receipt(
//            collection = collection,
//            serviceDetails = serviceDetails,
//            userName = merchantName,
//            businessName = businessName!!,
//            businessAddress = businessAddress!!,
//
//            )
//        Log.d("receipt", receipt.toString())
//        val jsonRequest = Gson().toJson(receipt)
//        val printIntent = Intent(PRINT_INTENT)
//            .putExtra("RECEIPT", jsonRequest)
//        print.launch(printIntent)
//    }
//
//    fun printWithdrawalReceipt(
//        print: ActivityResultLauncher<Intent>,
//        transactionResponse: TransactionResponse?,
//        transactions: Transactions?,
//        merchantId: String,
//        terminalId: String,
//        merchantName: String,
//        merchantAddress: String,
//        transactionDate: String,
//    ) {
//        val receipt = ReceiptService.withdrawal(
//            transactions = transactions,
//            transactionResponse = transactionResponse,
//            merchantID = merchantId,
//            merchantAddress = merchantAddress,
//            transactionDate = transactionDate,
//            merchantName = merchantName,
//            terminalID = terminalId,
//        )
//        Log.d("receipt", receipt.toString())
//        val jsonRequest = Gson().toJson(receipt)
//        val printIntent = Intent(PRINT_INTENT)
//            .putExtra("RECEIPT", jsonRequest)
//        print.launch(printIntent)
//    }

    private const val PRINT_INTENT = "com.flutterwave.pos.PRINT"
}