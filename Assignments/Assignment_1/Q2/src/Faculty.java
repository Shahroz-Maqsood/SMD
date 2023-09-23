import java.util.Scanner;

public class Faculty extends Staff{
    private String facultySpecialization;
        private String section;
        private int noOfStudents;
        private String qualification;

        Scanner sc;

        Faculty(String Emp_id, String Emp_role, String Emp_dept, Double Salary, int Experience, int Adhar,
                String name, String address, int Phone, String Profession){


            super(Emp_id,Emp_role,Emp_dept,Salary,Experience,Adhar,name
            ,address,Phone,Profession);
          sc=new Scanner(System.in);
        }
    public void setFacultySpecialization(String facultySpecialization) {
        this.facultySpecialization = facultySpecialization;
    }

    // Getter for facultySpecialization
    public String getFacultySpecialization() {
        return facultySpecialization;
    }

    // Setter for section
    public void setSection(String section) {
        this.section = section;
    }

    // Getter for section
    public String getSection() {
        return section;
    }

    // Setter for noOfStudents
    public void setNoOfStudents(int noOfStudents) {
        this.noOfStudents = noOfStudents;
    }

    // Getter for noOfStudents
    public int getNoOfStudents() {
        return noOfStudents;
    }

    // Setter for qualification
    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    // Getter for qualification
    public String getQualification() {
        return qualification;
    }

    public String Teach(String Course){
        return this.name+" Teaches the Course "+Course;
    }

    public String Asses(Student grade){
        System.out.print("Please Enter the grade : ");
        int gradeAssign=sc.nextInt();
        grade.setGrade(gradeAssign);
        return "Grade Uploaded Successfuly";
    }
}
