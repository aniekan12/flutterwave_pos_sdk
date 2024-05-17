import 'package:flutter_test/flutter_test.dart';
import 'package:flutterwave_pos_sdk/flutterwave_pos_sdk.dart';
import 'package:flutterwave_pos_sdk/flutterwave_pos_sdk_platform_interface.dart';
import 'package:flutterwave_pos_sdk/flutterwave_pos_sdk_method_channel.dart';
import 'package:plugin_platform_interface/plugin_platform_interface.dart';

class MockFlutterwavePosSdkPlatform
    with MockPlatformInterfaceMixin
    implements FlutterwavePosSdkPlatform {

  @override
  Future<String?> getPlatformVersion() => Future.value('42');
}

void main() {
  final FlutterwavePosSdkPlatform initialPlatform = FlutterwavePosSdkPlatform.instance;

  test('$MethodChannelFlutterwavePosSdk is the default instance', () {
    expect(initialPlatform, isInstanceOf<MethodChannelFlutterwavePosSdk>());
  });

  test('getPlatformVersion', () async {
    FlutterwavePosSdk flutterwavePosSdkPlugin = FlutterwavePosSdk();
    MockFlutterwavePosSdkPlatform fakePlatform = MockFlutterwavePosSdkPlatform();
    FlutterwavePosSdkPlatform.instance = fakePlatform;

    expect(await flutterwavePosSdkPlugin.getPlatformVersion(), '42');
  });
}
