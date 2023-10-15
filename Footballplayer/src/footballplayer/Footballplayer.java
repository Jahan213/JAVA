
package footballplayer;


public class Rafi {
   String name;
   int age;
   int t_match;
  
   
   public Rafi(String name,int age){
       this.name = name;
       this.age = age;  
   }

 

   

   public void cal_prize_money(int t_match){
       this.t_match = t_match;
       if(t_match==20){
       
      int total_pmoney  = 2000*t_match;
       System.out.println("Total Prize Money:  "+total_pmoney); 
       }
       else{
           System.out.println("Rafi did't Play 20 match");
       }
      
  
   }
   
    public void cal_bunas_money(int t_match){
       if(t_match>15){
         System.out.println("Congratulation Rafi You get 1500 dollar bonus");
       } 
       else{
        System.out.println("Match is not more then 15");   
       }
   }
    
    public void showRafiInfo(){
        System.out.println("Name:"+name);
        System.out.println("Age:" +age);
       
        
    }
}
