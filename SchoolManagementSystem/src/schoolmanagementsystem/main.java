
package schoolmanagementsystem;

public class main {
    public static void main(String[] args) {
        System.out.println("---------------------------------------------");
        System.out.print("Student Information\n");
        System.out.println("---------------------------------------------");
        Student s1 = new Student();
        s1.setinformation("Mithila", "102", "Female", "Physics", 2134214);   
        s1.setDepartment("Science");
        s1.setResult(3.70);
        s1.setTutionfee(20000);     
   
        s1.displayinformation();
        
        System.out.println("\t");
        
        
        Student s2 = new Student();
        s2.setinformation("Muna", "104", "Female", "Math", 1172333333);
        s2.setDepartment("Commers");
        s2.setResult(3.80);
        s2.setTutionfee(30000);
        
        s2.displayinformation();
        
        System.out.println("\t");
        System.out.println("---------------------------------------------");
        
        System.out.println("Teacher Information");
        System.out.println("---------------------------------------------");
     
        Teacher t1 = new Teacher();
        t1.setinformation("Mishpa", "12134354665", "male", "Physics", 1172333333);
        t1.setdesignation("Lecturer");
        t1.setsalary(700000);
        
        t1.displayinformation();
        
        System.out.println("\t");
         
         
        System.out.println("---------------------------------------------");
        Teacher t2 = new Teacher();
        t2.setinformation("MRIDULA", "5134354665", "Female", "Math", 172333333);
        t2.setdesignation("Lecturer");
        t2.setsalary(800000);
        
        t2.displayinformation();
             
        
    }
    
}
