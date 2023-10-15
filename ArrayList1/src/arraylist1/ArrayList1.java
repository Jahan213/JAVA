package arraylist1;

import java.util.ArrayList;

public class ArrayList1 {

    public static void main(String[] args) {
        ArrayList<Integer> num = new ArrayList<>();
        System.out.println("Size : " + num.size());
        num.add(10);
        num.add(20);
        num.add(30);
        num.add(40);
      for(int M : num)
         System.out.println(M) ;
        System.out.println("Size : " +num.size());
        num.add(1, 50);
        System.out.println(num.get(1));
        System.out.println("Size : " + num.size());
        
        //removing element
        num.remove(2);
        System.out.println("After removing : "+num.remove(2));
        System.out.println(num);
        System.out.println("After removing Size : " + num.size());
        num.removeAll(num);
        System.out.println(num);
        System.out.println("After removing all Size : " + num.size());
          
        num.clear();
        System.out.println(num);

    }

}
