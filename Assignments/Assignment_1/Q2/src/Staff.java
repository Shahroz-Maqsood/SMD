public class Staff extends Person{
    protected String Emp_ID;
    protected String Emp_Role;
    protected String Emp_Dept;
    protected Double Emp_Salary;
    protected int Experience;


    Staff(String Emp_id, String Emp_role,String Emp_dept,Double Salary,int Experience,int Adhar,
          String name, String address, int Phone, String Profession){

        super(Adhar,name,address,Phone,Profession);

        this.Emp_ID=Emp_id;
        this.Emp_Role=Emp_role;
        this.Emp_Salary=Salary;
        this.Emp_Dept=Emp_dept;
        this.Experience=Experience;
    }
    public String Attend(String Duty ){
        this.Profession = Duty;
        return "This person performs this duty";
    }

    public String GetPromotion(){
        return "This staff with name ("+this.name+") got promoted";
    }
    public Double GetSalary(){
        return this.Emp_Salary;
    }
}
