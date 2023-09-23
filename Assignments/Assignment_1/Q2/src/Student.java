public class Student extends Person{
    protected String studentId;
    protected String major;
    protected int year;
    protected int semester;
    protected String college;
    protected int grade;

    Student(String studentId,String major,int year,int semester,String College,int grade,
    int Adhar, String name, String address, int Phone, String Profession){
        super(Adhar,name,address,Phone,Profession);
      this.studentId=studentId;
      this.major=major;
      this.year=year;
      this.semester=semester;
      this.college=College;
      this.grade=grade;
    }
    public String getStudentId() {
        return studentId;
    }



    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    // Getter and Setter for Major
    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    // Getter and Setter for Year
    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    // Getter and Setter for Semester
    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    // Getter and Setter for College
    public String getCollege() {
        return college;
    }

    public void setCollege(String college) {
        this.college = college;
    }

    // Getter and Setter for Grade
    public int getGrade(){
        return grade;
    }
    public void setGrade(int grade){
        this.grade=grade;
    }

    public String Attend(String classy){
        return "Student ("+this.name+") attends class of "+classy;
    }

    public String Learn(){
        return "The Student with ("+this.name+") is learning ";
    }
}
