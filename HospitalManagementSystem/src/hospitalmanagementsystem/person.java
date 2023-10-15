
package hospitalmanagementsystem;

public class person {
    public String name;
    public String gender;
    public int phn;
    
    public static void main(String[] args){
        System.out.println("---Hospital Info-----");
        
    } 
        public void setinfo(String name,String gender,int phn){
            this.name= name;
            this.gender = gender;
            this.phn = phn;
        }
        public void Display(){
            System.out.println("Name : "+name);
            System.out.println("Gender : "+gender);
            System.out.println("Phone : "+phn);
        }
    }
    

