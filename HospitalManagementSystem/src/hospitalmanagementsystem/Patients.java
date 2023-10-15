
package hospitalmanagementsystem;

public class Patients extends person{
    private String disease;
    private String Fproblem;
    private float totalFees;
    
    
    public void  setDisease(){
        this.disease = disease;
    }
    public String getDiease(){
        return disease;
    }
    public void setFproblem(){
        this.Fproblem = Fproblem;
    }
    public String getFproblem(){
        return Fproblem;
    }
    
    public void settotalFees(){
        this.totalFees = totalFees;
    }
    public float gettotalFees(){
        return totalFees;
    }
    public void PatientsInfo(){
        System.out.println("Disease : "+disease);
        System.out.println("Finaltial Problem : "+Fproblem);
        System.out.println("Total Fees : "+totalFees);
    }
}
