import 'dart:convert';

import 'package:flutter/foundation.dart';
import 'package:flutter/services.dart';
import 'package:flutterwave_pos_sdk/models/flutterwave_key_exchange_response.dart';

import 'flutterwave_pos_sdk_platform_interface.dart';

/// An implementation of [FlutterwavePosSdkPlatform] that uses method channels.
class MethodChannelFlutterwavePosSdk extends FlutterwavePosSdkPlatform {
  /// The method channel used to interact with the native platform.
  @visibleForTesting
  final methodChannel = const MethodChannel('flutterwave_pos_sdk');

  @override
  Future<FlutterwaveKeyExchangeResponse?> keyExchange(
      {required String companyName, required String logoLink}) async {
    final response = (await methodChannel.invokeMethod('keyExchange', {
      "companyName": companyName,
      "logoLink": logoLink,
    }));
    return FlutterwaveKeyExchangeResponse.fromJson(jsonDecode(response));
  }
}
