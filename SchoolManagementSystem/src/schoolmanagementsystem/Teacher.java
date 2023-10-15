
package schoolmanagementsystem;

public class Teacher extends Person {               //Inheritance   
    private String designation;
    private int salary;
    
    
     public String getdesignation(){
        return designation;
    }

    public void setdesignation(String designation){
        this.designation =designation;
    }
     public int getsalary(){
        return salary;
    }

    public void setsalary(int salary){
        this.salary = salary;
    }
    @Override
    public void  displayinformation(){
        System.out.println("Name: "+name);
        System.out.println("Roll: "+roll);
        System.out.println("Gender : "+gender);
        System.out.println("Subject : "+subject);
        System.out.println("Phone : "+phone);
        System.out.println("Designation:"+designation);
        System.out.println("Salary: "+salary); 
    }
}