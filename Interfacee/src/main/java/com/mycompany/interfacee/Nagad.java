
package com.mycompany.interfacee;


public class Nagad implements OnlinePayment {

    @Override
    public float paymentCharge() {
        return 14.90f;
    }

    @Override
    public void paymentConfirmation() {
        System.out.println("Payment Confirm by Nagad");
    }
}