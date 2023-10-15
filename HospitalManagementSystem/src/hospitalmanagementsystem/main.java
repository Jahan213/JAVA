
package hospitalmanagementsystem;


public class main {
    public static void main(String[]args){
 
        System.out.println("-----HOSPITAL INFO----");
        Doctors d1 = new Doctors();
        d1.setinfo("Pakhi","Female",2356890);
        d1.setLevel("Senior");
        d1.setExpertIn("ENT");
        d1.setSalary(12340.4f);
        
        d1.Display();
        d1.displayInfo();
        
        
        Doctors d2 = new Doctors();
        d2.setinfo("Pakhi","Female",2356890);
        d2.setLevel("Senior");
        d2.setExpertIn("ENT");
        d2.setSalary(12340.4f);
        
        d2.Display();
        d2.displayInfo();
        
    }
    
}
