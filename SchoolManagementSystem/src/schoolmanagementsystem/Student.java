
package schoolmanagementsystem;
public class Student extends Person {          //Inheritance
    private String department;
    private double result;               //Encaptulation  because variables are protected by declaring them as private
                                         /// And  hare used satter and gatter method for get the variables value and get access from another class
    private int Tutionfee;  
    
    
     public String getDepartment(){
        return department;
    }

    public void setDepartment(String department){
        this.department =department;
    }
    
     public double getResult(){
        return result;
    }

    public void setResult(double result){
        this.result =result;
    }
    
     public int getTutionfee(){
        return Tutionfee;
    }

    public void setTutionfee(int Tutionfee){
        this.Tutionfee =Tutionfee;
    }
    @Override
    public void  displayinformation(){
        System.out.println("Name: "+name);
        System.out.println("Roll: "+roll);
        System.out.println("Gender : "+gender);
        System.out.println("Subject : "+subject);
        System.out.println("Phone : "+phone);
        System.out.println("Department: "+department);
        System.out.println("RESULT: "+result);
        System.out.println("Tutuion_Fee: "+Tutionfee);
        
    }
}
