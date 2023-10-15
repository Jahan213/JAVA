
package com.mycompany.abstractt;


public class Rocket extends OnlineBanking {
    @Override
    public float paymentCharge() {
        return 16.9f;
    }

    @Override
    public void paymentConfirmation() {
        System.out.println("Payment Confirmed by Rocket");
    }
}
