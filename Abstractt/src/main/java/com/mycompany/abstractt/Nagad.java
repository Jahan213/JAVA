
package com.mycompany.abstractt;


public class Nagad extends OnlineBanking {


    @Override
    public float paymentCharge() {
        return 9.99f;
    }

    @Override
    public void paymentConfirmation() {
        System.out.println("Payment Confirm by Nagad");
    }
}