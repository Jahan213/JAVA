
package com.mycompany.interfacee;


public class Bkash  implements OnlinePayment {

    @Override
    public float paymentCharge() {
        return 14.90f;
    }

    @Override
    public void paymentConfirmation() {
        System.out.println("Payment Confirm by Bkash");
    }
}