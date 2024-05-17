#ifndef FLUTTER_PLUGIN_FLUTTERWAVE_POS_SDK_PLUGIN_H_
#define FLUTTER_PLUGIN_FLUTTERWAVE_POS_SDK_PLUGIN_H_

#include <flutter/method_channel.h>
#include <flutter/plugin_registrar_windows.h>

#include <memory>

namespace flutterwave_pos_sdk {

class FlutterwavePosSdkPlugin : public flutter::Plugin {
 public:
  static void RegisterWithRegistrar(flutter::PluginRegistrarWindows *registrar);

  FlutterwavePosSdkPlugin();

  virtual ~FlutterwavePosSdkPlugin();

  // Disallow copy and assign.
  FlutterwavePosSdkPlugin(const FlutterwavePosSdkPlugin&) = delete;
  FlutterwavePosSdkPlugin& operator=(const FlutterwavePosSdkPlugin&) = delete;

  // Called when a method is called on this plugin's channel from Dart.
  void HandleMethodCall(
      const flutter::MethodCall<flutter::EncodableValue> &method_call,
      std::unique_ptr<flutter::MethodResult<flutter::EncodableValue>> result);
};

}  // namespace flutterwave_pos_sdk

#endif  // FLUTTER_PLUGIN_FLUTTERWAVE_POS_SDK_PLUGIN_H_
