public class TeacherClass 
{
    String name; // teacherClass.name
    String subject;
    String empId;
    int salary;
    String address;
    float yearsOfExperience;

    public TeacherClass()
    {
        System.out.println("Teachers Class Default Constructor");
    }

    public TeacherClass(String name, String subject, String empId, int salary, String a, float yearsOfExperience)
    {
        this.name = name;
        this.subject = subject;
        this.empId = empId;
        this.salary = salary;
        address = a;
        this.yearsOfExperience = yearsOfExperience;
    }



    public static void main(String[] args) 
    {
        TeacherClass teacher1 = new TeacherClass();
        System.out.println("Main Method");

        System.out.println("Teacher 1");
        System.out.println("name " + teacher1.name);
        System.out.println("subject " + teacher1.subject);
        System.out.println("empId " + teacher1.empId);
        System.out.println("salary " + teacher1.salary);
        System.out.println("address " + teacher1.address);
        System.out.println("YearsOfExperience " + teacher1.yearsOfExperience);

        // System.out.println();
        // TeacherClass teacher2 = new TeacherClass("Abc", "JAVA", "101", 100, "Mahadevpura", 1.1f);
        // System.out.println("Teacher 2");
        // System.out.println("name " + teacher2.name);
        // System.out.println("subject " + teacher2.subject);
        // System.out.println("empId " + teacher2.empId);
        // System.out.println("salary " + teacher2.salary);
        // System.out.println("address " + teacher2.address);
        // System.out.println("YearsOfExperience " + teacher2.yearsOfExperience);


        teacher1.name = "XYZ";
        teacher1.subject = "C++";
        teacher1.empId = "102";
        teacher1.salary = 101;
        teacher1.address = "Marathalli";
        teacher1.yearsOfExperience = 2;

        System.out.println("Teacher 1");
        System.out.println("name " + teacher1.name);
        System.out.println("subject " + teacher1.subject);
        System.out.println("empId " + teacher1.empId);
        System.out.println("salary " + teacher1.salary);
        System.out.println("address " + teacher1.address);
        System.out.println("YearsOfExperience " + teacher1.yearsOfExperience);

    }

    // null, 0
}


// primitive data type ---- yearsOfExperience, salary
// non primitive type ----- name, subject, address, empId