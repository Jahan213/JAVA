
package com.mycompany.interfacee;

public class Daraz_payment {
     public static void main(String[] args) {
        OnlinePayment b = new Bkash();
        OnlinePayment n = new Nagad();
        OnlinePayment r = new Rocket();

        System.out.println("Bkash Payment Charge: "+b.paymentCharge());
        b.paymentConfirmation();
        System.out.println("Nagad Payment Charge: "+n.paymentCharge());
        n.paymentConfirmation();
        System.out.println("Rocket Payment Charge: "+r.paymentCharge());
        r.paymentConfirmation();
    }
}
