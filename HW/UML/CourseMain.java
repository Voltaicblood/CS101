public class CourseMain
{

    public static void main(String[] args)
    {

	String name = "Programming Structures";
	int courseNumber = 305;
	String building = "Academic Concourse";
	int room = 315;

	Course course = new Course(name, courseNumber, building, room);
	System.out.println(course);
	course.addStudents(1000);
	course.dropStudents(50);
	System.out.println("course number (should be 305): " + course.getCourseNumber());
	System.out.println("number of students (should be 950): " + course.getNumberOfStudents());
	System.out.println("course name (should be Programming Structures): " + course.getCourseName());
	System.out.println("building (should be Academic Concourse): " + course.getBuilding());
	System.out.println("room (should be 315): " + course.getRoomNumber());
	System.out.println(course.toString());


    }//main

}//CourseMain
