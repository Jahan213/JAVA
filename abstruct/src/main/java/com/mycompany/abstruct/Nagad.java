
package com.mycompany.abstruct;
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
