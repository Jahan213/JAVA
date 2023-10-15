package reverse.order.print;

import java.util.ArrayList;
import java.util.Collections;

public class ReverseOrderPrint {

    public static void main(String[] args) {

        ArrayList<String> cars = new ArrayList<String>();

        cars.add("VOLVO");
        cars.add("BMN");
        cars.add("Ford");
        Collections.sort(cars);
        System.out.println(cars);

        for (int i = cars.size() - 1; i >= 0; i--) {
            System.out.println(cars.get(i));
        }
    }

}
