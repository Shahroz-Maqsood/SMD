import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean runner=true;
        Scanner sc=new Scanner(System.in);

        PG_Student s1=new PG_Student("L19-1228","Student","001","Computer Science",2019,9,"Fast Nuces Lahore",90,331,"Shahroz","Dry Port Road",111,"Student");
        Faculty f1=new Faculty("1234","Assosiate Professor","CS Dept",100000.00,5,222,"Mughees Mussadiq","Fast Nuces",030033033,"Teacher");
        Technician t1=new Technician("Machines & Parts","333","General Technician","Technical Depart",50000.00,3,335,"Zain","Shaukat Ali Road",03022,"Technician");

        int condition;
        while(runner){
            System.out.println("Press 1 if you want to access functions of Student");
            System.out.println("Press 2 if you want to access functions of faculty");
            System.out.println("Press 3 if you want to access functions of Technician");
            System.out.print("Input : ");
            condition=sc.nextInt();

            if(condition==1){
                s1.Submit_Thesis();
            }
            else if (condition==2){
                System.out.println(f1.Teach("SMD"));
                f1.Asses(s1);
            }
            else if(condition==3){
                System.out.println(t1.Mantain("Lab4"));
                System.out.println(t1.Installs("MAC"));
            }
            else {
                System.out.println("Wrong Input :( ");
            }

        }
    }
}
