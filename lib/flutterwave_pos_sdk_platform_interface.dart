import 'package:flutterwave_pos_sdk/models/flutterwave_key_exchange_response.dart';
import 'package:plugin_platform_interface/plugin_platform_interface.dart';

import 'flutterwave_pos_sdk_method_channel.dart';

abstract class FlutterwavePosSdkPlatform extends PlatformInterface {
  /// Constructs a FlutterwavePosSdkPlatform.
  FlutterwavePosSdkPlatform() : super(token: _token);

  static final Object _token = Object();

  static FlutterwavePosSdkPlatform _instance = MethodChannelFlutterwavePosSdk();

  /// The default instance of [FlutterwavePosSdkPlatform] to use.
  ///
  /// Defaults to [MethodChannelFlutterwavePosSdk].
  static FlutterwavePosSdkPlatform get instance => _instance;

  /// Platform-specific implementations should set this with their own
  /// platform-specific class that extends [FlutterwavePosSdkPlatform] when
  /// they register themselves.
  static set instance(FlutterwavePosSdkPlatform instance) {
    PlatformInterface.verifyToken(instance, _token);
    _instance = instance;
  }

  Future<FlutterwaveKeyExchangeResponse?> keyExchange(
      {required String logoLink, required String companyName}) {
    throw UnimplementedError('keyExchange() has not been implemented.');
  }
}
