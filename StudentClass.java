public class StudentClass {
    String course;
    String name; // studentClass.name
    char grade;
    String address;
    int[] marks;
    String USN;
    long fees;

    public StudentClass() {
    }

    public StudentClass(String course, String name,String address, char grade, int[] marks, String USN, long fees)
    {
        this.course = course;
        this.name = name;
        this.address = address;
        this.grade = grade;
        this.marks = marks;
        this.USN = USN;
        this.fees = fees;
    }

    public String printStudentDetails()
    {
        return "Course " + course + "   name " + name + "   address " + address + " grade   " + grade 
        + "   " + marks[0] + "    " + marks[1] + "    " + marks[2] + "    " + USN + "   " + fees;
    }
}



// primitive data type ---- fees, grade
// non primitive ----- marks, course, address, usn
