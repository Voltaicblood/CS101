/*
  Course class to create Course objects.
  A Course consists of a name, number, building, and room.
  File: Course.java
  Designer: Dr. Vineyard
  Implementer: Jacob Austin
  Organization: CS101-03
*/

/**
* Data Table
*
* Variable Usage
* -------- -----
* courseName String data for course name
* courseNumber integer data for the course number
* MAX_STUDENTS constant integer, max number of students in course
* numberOfStudents number of students in course
* building String data for building name
* roomNumber integer data for room number
*/

public class Course
{
  private String courseName;
  private int courseNumber;
  public static final int MAX_STUDENTS = 40;
  private int numberOfStudents;
  private String building;
  private int roomNumber;

/*
  Course(courseName, number, building, room)
    this.courseName <-- courseName
    this.courseNumber <-- courseNumber
    numberOfStudents <-- 0
    this.building <-- building
    roomNumber <-- room
*/    
  public Course(String courseName, int number, String building, int room)
  {
    this.courseName = courseName;
    this.courseNumber = number;
    numberOfStudents = 0;
    this.building = building;
    roomNumber = room;
  }
/*
  addStudents(students)
    numberOfStudents <-- numberOfStudents + students
*/
  public void addStudents(int students)
  {
    numberOfStudents = numberOfStudents + students;
  }
/*
  dropStudents(students)
    numberOfStudents <-- numberOfStudents - students
*/
  public void dropStudents(int students)
  {
    numberOfStudents = numberOfStudents - students;
  }
/*
  getCourseNumber()
    return courseNumber
*/
  public int getCourseNumber()
  {
    return courseNumber;
  }
/*
  getNumberOfStudents()
    return numberOfStudents
*/
  public int getNumberOfStudents()
  {
    return numberOfStudents;
  }
/*
  getCourseName()
    return courseName
*/
  public String getCourseName()
  {
    return courseName;
  }
/*
  getBuilding()
    return building
*/
  public String getBuilding()
  {
    return building;
  }
/*
  getRoomNumber()
    return roomNumber
*/
  public int getRoomNumber()
  {
    return roomNumber;
  }
/*
  toString()
    return name + " Course Number " + number + " Number of Students " +
        numberOfStudents + " Building " + building + " Room Number " + roomNumber
*/
  public String toString()
  {
    return courseName + " Course Number " + courseNumber + " Number of Students " +
        numberOfStudents + " Building " + building + " Room Number " + roomNumber;
  }
} 