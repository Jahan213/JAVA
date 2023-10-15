/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package inheritance;

/**
 *
 * @author DOLPHIN
 */
public class Inheritance {

     public static void main(String[] args){
         technology rahim = new technology();
        
        rahim.setName("Rahim");
        rahim.setDepartment("Technology");
        rahim.setSalary(4000.00f);
        rahim.setId("213-35-768");
        rahim.setSalary(4000.00f);
        rahim.setGender("Female");
        rahim.setExLvl("Student");
        
        System.out.println(rahim.getName());
        System.out.println(rahim.getDepartment());
        System.out.println(rahim.getSalary());
        System.out.println(rahim.getId());
        System.out.println(rahim.getExLvl());
        System.out.println(rahim.getGender());

    }
    
}
