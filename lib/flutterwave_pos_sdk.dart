import 'package:flutterwave_pos_sdk/models/flutterwave_key_exchange_response.dart';

import 'flutterwave_pos_sdk_platform_interface.dart';

class FlutterwavePosSdk {
  Future<FlutterwaveKeyExchangeResponse?> keyExchange(
      {required String companyName, required String logoLink}) {
    return FlutterwavePosSdkPlatform.instance.keyExchange(
      companyName: companyName,
      logoLink: logoLink,
    );
  }
}
