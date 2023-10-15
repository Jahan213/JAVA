
package com.mycompany.interfacee;


public class Rocket implements OnlinePayment{
    @Override
    public float paymentCharge() {
        return 16.9f;
    }

    @Override
    public void paymentConfirmation() {
        System.out.println("Payment Confirmed by Rocket");
    }
}