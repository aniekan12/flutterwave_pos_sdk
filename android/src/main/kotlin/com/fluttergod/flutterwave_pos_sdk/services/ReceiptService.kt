package com.fluttergod.flutterwave_pos_sdk.services


import android.util.Log

import java.util.Locale

object ReceiptService {

//    fun receipt(
//        collection: Collection?,
//        serviceDetails: ServiceDetails?,
//        userName: String,
//        businessName: String,
//        businessAddress: String,
//    ): Receipt {
//        when {
//            serviceDetails?.vendResponse?.receipt_data != null -> {
//                return generalPowerReceipt(serviceDetails)
//            }
//            serviceDetails?.providerName?.lowercase() == "kaedco" || serviceDetails?.providerName?.lowercase() == "kedco" -> {
//                return kadunaAndKanoReceipt(userName, businessName, collection, serviceDetails)
//            }
//            else -> {
//                return collectionReceipt(
//                    collection,
//                    userName,
//                    businessName,
//                    businessAddress,
//                    serviceDetails
//                )
//            }
//        }
//    }
//
//    fun withdrawal(
//        transactions: Transactions?,
//        transactionResponse: TransactionResponse?,
//        merchantID: String?,
//        merchantName: String?,
//        terminalID: String?,
//        merchantAddress: String?,
//        transactionDate: String,
//
//        ): Receipt {
//        if (transactionResponse != null) {
//            return withdrawalReceipt(
//                transactionResponse = transactionResponse,
//                merchantId = merchantID!!,
//                merchantName = merchantName!!,
//                terminalId = terminalID!!,
//                merchantAddress = merchantAddress!!,
//                transactionDate = transactionDate
//            )
//        } else {
//            return withdrawalReceiptPrintPage(
//                transaction = transactions!!,
//                terminalId = terminalID!!,
//                merchantName = merchantName!!,
//                merchantAddress = merchantAddress!!,
//                transactionDate = transactionDate
//            )
//        }
//    }


}