public class PG_Student extends Student{
    private String Roll_No;
    private String Specialization;

    PG_Student(String Roll_No,String Specialization, String studentId,String major,int year,int semester,String College,int grade,
               int Adhar, String name, String address, int Phone, String Profession){

        super(studentId, major, year, semester, College, grade, Adhar,  name,  address,  Phone,  Profession);
        this.Roll_No=Roll_No;
        this.Specialization=Specialization;

    }
    public void Submit_Thesis(){
        System.out.println("Thesis is submitted by this student named ("+this.name+")  with rollNo : "+this.Roll_No+" with grade "+this.grade);
    }
}
