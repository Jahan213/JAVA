/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inheritance;

/**
 *
 * @author DOLPHIN
 */
public class employee {
    private String name;
        private String id;
        private String department;
        private String exLvl;
        private float salary;
        private String gender;

    public String getName(){
        return name;
    }
    
    public void setName(String name){
        this.name =name;
    }
    
    public void setSalary(float salary){
    this.salary = salary;
}
    
      public float getSalary(){
    return salary;
}
    
    public void setDepartment(String department){
    this.department =  department;
}
      public String getDepartment(){
    return department;
}
    
    public void setExLv1(String exLvl){
    
    this.exLvl= exLvl;
}
    
      public String getExLvl(String exLvl){
           
    
    return exLvl;
}
      
    public void setGender(String gender){
       this.gender =  gender;
    }
    
    public String getGender(){
       return  gender;
    }
    public void setId(String id){
       this.id =  id;
    }
    
    public String getId(){
       return  id;
    }
    
}
