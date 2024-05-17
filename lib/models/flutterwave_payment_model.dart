class FlutterwavePaymentModel {
  String? amount;
  bool? shouldPrint;
  List<String>? transactionType;
  FlutterwavePaymentModel({
    this.amount,
    this.shouldPrint = true,
    this.transactionType = const ['CARD'],
  });

  Map<String, dynamic> toMap() {
    return {
      'amount': amount,
      'shouldPrint': shouldPrint,
      'transactionType': transactionType,
    };
  }
}

enum TransactionType { CARD, TRANSFER, USSD, MOMO, QR }
