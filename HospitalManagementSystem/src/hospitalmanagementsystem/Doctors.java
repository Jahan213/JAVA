
package hospitalmanagementsystem;

public class Doctors extends person {
    private String level;
    private String expertIn;
    private float salary;
    
    
    public String getLevel(String level){
        return level;
    }
    public void setLevel(String level){
        this.level = level;
    
    }
    public void setExpertIn(String expertIn){
        this.expertIn = expertIn;
    }
    public String getExpertIn(String expertIn){
        return expertIn;
    }
    public void setSalary(float salary){
        this.salary = salary;
    }
    public float getSalary(float salary){
        return salary;
    }
    
    public void displayInfo(){
        System.out.println("Level : "+level);
        System.out.println("ExpertIn : "+expertIn);
        System.out.println("Salary : "+salary);
    }
}