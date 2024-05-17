#include "include/flutterwave_pos_sdk/flutterwave_pos_sdk_plugin_c_api.h"

#include <flutter/plugin_registrar_windows.h>

#include "flutterwave_pos_sdk_plugin.h"

void FlutterwavePosSdkPluginCApiRegisterWithRegistrar(
    FlutterDesktopPluginRegistrarRef registrar) {
  flutterwave_pos_sdk::FlutterwavePosSdkPlugin::RegisterWithRegistrar(
      flutter::PluginRegistrarManager::GetInstance()
          ->GetRegistrar<flutter::PluginRegistrarWindows>(registrar));
}
