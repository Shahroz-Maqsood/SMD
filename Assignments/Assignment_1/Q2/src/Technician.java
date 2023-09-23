public class Technician extends Staff{
     private String Tech_Type;
     Technician(String Tech, String Emp_id, String Emp_role,String Emp_dept,Double Salary,int Experience,int Adhar,
        String name, String address, int Phone, String Profession){

         super(Emp_id,Emp_role,Emp_dept,Salary,Experience,Adhar,name,address,Phone,Profession);
         this.Tech_Type = Tech;
     }
     public String Mantain(String Lab){
         return this.name+" Has access to Lab "+Lab;
     }
     public String Installs(String System){
         return this.name+" Installs this type of system: "+System;
     }
}
