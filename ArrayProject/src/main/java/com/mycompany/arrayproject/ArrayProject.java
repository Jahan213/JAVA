

package com.mycompany.arrayproject;

import java.util.ArrayList;

public class ArrayProject {

    public static void main(String[] args) {

        ArrayList<Integer> number = new ArrayList<>();
        number.add(2);
        number.add(4);
        number.add(6);
        number.add(8);
        number.add(10);

        System.out.println(number);

        System.out.println("size = " + number.size());

        number.set(2, 13);

        System.out.println(number.get(2));

        System.out.println(number);
        System.out.println(number.size());
        number.clear();

        System.out.println(number);
    }
}
