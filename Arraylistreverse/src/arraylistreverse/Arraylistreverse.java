package arraylistreverse;

import java.util.ArrayList;
import java.util.Collections;

public class Arraylistreverse {

    public static void main(String[] args) {
        ArrayList<String> name = new ArrayList<String>();

        name.add("Mithila");
        name.add("Runa");
        name.add("Nishpa");
        name.add("Tridula");
        System.out.println("Enter names : ");
        for (int i = 0; i < name.size(); i++) {
            System.out.println(name.get(i));

        }
        System.out.println("sorted list : ");
        Collections.sort(name);

        for (String x : name) {
            System.out.println(x);

        }

    }

}
