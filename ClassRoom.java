
public class ClassRoom 
{
    StudentClass[] students;
    String className;
    TeacherClass[] teachers;
    String infrastructure;
    String timetable;
    // 0 1 2 3 4 5 6 

    public static void main(String[] args) 
    {
        ClassRoom classRoom = new ClassRoom();
        int[] arr = new int[5];
        //System.out.println(arr[6]);
        System.out.println(classRoom.students);
    }
}
    // Syntax object creation
    // classname(user defined keyword) objectName(identifier) = new(keyword) classname();

    //Syntax class definition
    // accessmodifier class(keyword) classname(identifier) -- what is identifier?
