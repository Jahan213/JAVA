
package com.mycompany.abstractt;


public class Bkash extends OnlineBanking {

    @Override
    public float paymentCharge() {
        return 14.90f;
    }

    @Override
    public void paymentConfirmation() {
        System.out.println("Payment Confirm by Bkash");
    }
}