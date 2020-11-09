import java.util.*;
/**
 * The LabClass class represents an enrolment list for one lab class. It stores
 * the time, room and participants of the lab, as well as the instructor's name.
 * 
 * @author Michael Kölling and David Barnes
 * @version 2016.02.29
 * modified by Mohammed Ahmed
 * dated 6/Oct/2020
 */
//Created a new lab class with the detials of the room, teacher and time and day
public class LabClass
{
    private String instructor;
    private String room;
    private String timeAndDay;
    
    private ArrayList<Student> students;
    private int capacity;
    
    /**
     * Create a LabClass with a maximum number of enrolments. All other details
     * are set to default values.
     */
    //I also added the max number of students in the lab class(which is 3)
    public LabClass(int maxNumberOfStudents)
    {
        instructor = "unknown";
        room = "unknown";
        timeAndDay = "unknown";
        
        students = new ArrayList<Student>();
        capacity = maxNumberOfStudents;
    }
    //Added if and else statement if the class is full and to add another
    //student
    /**
     * Add a student to this LabClass.
     */
    public void enrollStudent(Student newStudent)
    {
        if(students.size() == capacity) 
        {
            System.out.println("The class is full, you cannot enrol.");
        }
        else 
        {
            students.add(newStudent);
        }
    }
    //This for the number of sudents and the returning number of stuents 
    /**
     * Return the number of students currently enrolled in this LabClass.
     */
    public int numberOfStudents()
    {
        return students.size();
    }
    //A string for the room number that the students will go to
    /**
     * Set the room number for this LabClass.
     */
    public void setRoom(String roomNumber)
    {
        room = roomNumber;
    }
    // A string for the time and day for the students to attend
    /**
     * Set the time for this LabClass. The parameter should define the day
     * and the time of day, such as "Friday, 10am".
     */
    public void setTime(String timeAndDayString)
    {
        timeAndDay = timeAndDayString;
    }
    //A string for the instuctors name
    /**
     * Set the name of the instructor for this LabClass.
     */
    public void setInstructor(String instructorName)
    {
        instructor = instructorName;
    }
    //Added a print system for printing out the dtails of the classroom, teacher
    //and time and day. I also added a for statement to print out the all the
    //details of the students from when they enroll.
    /**
     * Print out a class list with other LabClass details to the standard
     * terminal.
     */
    public void printList()
    {
        System.out.println("co452Lab " + timeAndDay);
        System.out.println("Nick Day: " + instructor + "   G100: " + room);
        System.out.println("Class list:");
        
        for(Student student : students) 
        {
            student.print();
        }
        
        System.out.println("Number of students: " + numberOfStudents());
    }
}