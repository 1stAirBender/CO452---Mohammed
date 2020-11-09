import java.util.*;
/**
 * The Student class represents a student in a student administration system.
 * It holds the student details relevant in our context.
 * 
 * @author Michael Kölling and David Barnes
 * @version 2016.02.29
 * modified by Mohammed Ahmed - 21915819
 */ 
public class Student
{
    // the student's full name
    private String name;
    // the student ID
    private String id;
    // the amount of credits for study taken so far
    private int credits;
    //adding a new course
    private Course course;
    
    //Created a new string for the studentd ID, name and number of credits
    /**
     * Create a new student with a given name and ID number.
     */
    public Student(String fullName, String studentID)
    {
        name = fullName;
        id = studentID;
        credits = 0;
    }
    //Created a string for returning a students name
    /**
     * Return the full name of this student.
     */
    public String getName()
    {
        return name;
    }
    //Added a public void to add a course when i create one
    /**
     * Assign parameter course to field course
     */
    public void addCourse(Course course)
    {
        this.course = course;
    }
    //Created a string to return a students ID
    /**
     * Return the student ID of this student.
     */
    public String getStudentID()
    {
        return id;
    }
    //This is where i add addition points/credits to the students
    /**
     * Add some credit points to the student's accumulated credits.
     */
    public void addCredits(int additionalPoints)
    {
        credits += 20;
    }
    //This shows the number of credits shown when inputing the amount and also
    //returning them.
    /**
     * Return the number of credit points this student has accumulated.
     */
    public int getCredits()
    {
        return credits; 
    }
    /**
     * Return the login name of this student. The login name is a combination
     * of the first four characters of the student's name and the first three
     * characters of the student's ID number.
     */
    // I added a (system out println) to print out all the students details.
    /**
     * Print the student's name and ID number to the output terminal.
     */
    public void print()
    {
        System.out.println(name + ", student ID: " + id + ", credits: " + credits);
        course.print();
    }
}