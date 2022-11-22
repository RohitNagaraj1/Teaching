// primitive ---> int , long 
public class ClassRoom 
{
    // no primitive data type
    StudentClass[] students;
    String className;
    TeacherClass[] teachers;
    String infrastructure;
    String timetable;

    public void assignStudentsValue(int noOfStudents)
    {
        // (String course, String name,String address, char grade, int[] marks, String USN, long fees)
        for (int i = 0; i < noOfStudents; i++)
        {
            String course = "JAVA";
            String name = "ABC";
            String address = "HPE";
            char grade = 'A';
            int[] marks = {100, 80, 90};
            String USN = "1rv16ec131";
            long fees = 100000;

            StudentClass temp = new StudentClass(course, name, address, grade, marks, USN, fees);
            this.students[i] = temp;
        }
    }
    

    public static void main(String[] args) 
    {
        ClassRoom classRoom = new ClassRoom();
        System.out.println(classRoom.students);
        System.out.println(classRoom.className);
        System.out.println(classRoom.teachers);
        System.out.println(classRoom.infrastructure);
        System.out.println(classRoom.timetable);

        System.out.println();
        classRoom.students = new StudentClass[10];
        classRoom.className = "ABC";
        classRoom.teachers = new TeacherClass[10];
        classRoom.infrastructure = "yvcob";
        classRoom.timetable = "10 PM";

        System.out.println(classRoom.students[0]); // 460332449
        System.out.println(classRoom.className);
        System.out.println(classRoom.teachers[0]);
        System.out.println(classRoom.infrastructure);
        System.out.println(classRoom.timetable);

        classRoom.assignStudentsValue(10);
        System.out.println(classRoom.students[0].printStudentDetails()); // 460332449
        System.out.println(classRoom.className);
        System.out.println(classRoom.teachers[0]);
        System.out.println(classRoom.infrastructure);
        System.out.println(classRoom.timetable);
    }
}
    // int[] array = new int[10];
    // 0 1 2 3 4 5 6 
    // Syntax object creation
    // classname(user defined keyword) objectName(identifier) = new(keyword) classname();

    //Syntax class definition
    // accessmodifier class(keyword) classname(identifier) -- what is identifier?
