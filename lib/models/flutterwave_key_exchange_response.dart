class FlutterwaveKeyExchangeResponse {
  String? statusCode, message;
  TerminalData? data;

  FlutterwaveKeyExchangeResponse({this.statusCode, this.message, this.data});

  @override
  String toString() {
    return 'FlutterwaveTransactionResponse{statusCode: $statusCode, message: $message, data: $data}';
  }

  factory FlutterwaveKeyExchangeResponse.fromJson(Map<String, dynamic> json) {
    return FlutterwaveKeyExchangeResponse(
        statusCode: json['statusCode'],
        message: json['message'],
        data: TerminalData.fromJson(json['terminalData']));
  }
}

class TerminalData {
  String? terminalID;
  String? merchantID;

  TerminalData({this.terminalID, this.merchantID});

  factory TerminalData.fromJson(Map<String, dynamic> json) {
    return TerminalData(
      terminalID: json['terminalId'],
      merchantID: json['merchantId'],
    );
  }
}
