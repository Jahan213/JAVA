
package schoolmanagementsystem;

public class Person {
   
    public String name;
    public String roll;  
    public String gender;
    public String subject;                     
    public int phone;
    
    public  void setinformation(String name,String roll,String gender,String subject,int phone){ //paremeterized method
        this.name = name;    
        this.roll = roll;
        this.gender = gender;
        this.subject = subject;
        this.phone = phone;
    }
    
  
     public void displayinformation(){
        System.out.println("Name: "+name);
        System.out.println("Roll: "+roll);
        System.out.println("Gender : "+gender);
        System.out.println("Subject : "+subject);
        System.out.println("Phone : "+phone);
        
    }
    
    
}
