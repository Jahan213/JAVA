
package arrayinitilize;

public class ArrayInitilize {

    public static void main(String[] args) {
      
      int[] num;
      num = new int[10];
       
      num[0] = 10;
      num[1] = 20;
      num[2] = 30;
      num[3] = 40;
      num[4] = 50;
        for (int i = 0; i < 5; i++) {
            System.out.println(num[i]);
        }
        
        System.out.println(num[2]);
        
    }
    
}
