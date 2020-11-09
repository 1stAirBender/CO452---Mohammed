import java.util.*;
/**
 * The Student class represents a student in a student administration system.
 * It holds the student details relevant in our context.
 * 
 * @author Michael Kölling and David Barnes
 * @version 2016.02.29
 * Modified by Mohammed Ahmed - 21915819
 * Date: 22/10/2020
 */
public class Student
{
    // the student's full name
    private String name;
    // the student ID
    private String id;
    // the amount of credits for study taken so far
    private int credits;
    //Added a course
    private Course course;
    
    /**
     * Create a new student with a given name and ID number.
     */
    //Created a string with the sudnts details.
    public Student(String fullName, String studentID)
   
    {
        name = fullName;
        id = studentID;
        credits = 0;
        course = null;
        
    }
    //Created a public statement for enrolling on to the course and i created
    //an if statement for the course number.
    public void enroll(int courseNumber,Course newCourse)
    {
        if(courseNumber == 1)course = newCourse;
        
    }
    //Created a string for getting the name of the student
    /**
     * Return the full name of this student.
     */
    public String getName()
    {
        return name;
    }
    //created a string for changing/replacing a students name
    /**
     * Set a new name for this student.
     */
    public void changeName(String replacementName)
    {
        name = replacementName;
    }
    //a string for getting a students ID
    /**
     * Return the student ID of this student.
     */
    public String getStudentID()
    {
        return id;
    }
    //This is a statement for adding credits for the student 
    /**
     * Add some credit points to the student's accumulated credits.
     */
    public void addCredits(int additionalPoints)
    {
        credits += additionalPoints;
    }
    //A statement for getting credits
    /**
     * Return the number of credit points this student has accumulated.
     */
    public int getCredits()
    {
        return credits;
    }
    //A string for getting the login name of the student.
    /**
     * Return the login name of this student. The login name is a combination
     * of the first four characters of the student's name and the first three
     * characters of the student's ID number.
     */
    public String getLoginName()
    {
        return name.substring(0,4) + id.substring(0,3);
    }
    public void printReults()
    {
        if(course!=null) course.print();
        
    }
    //A print system for print all of the students details
    /**
     * Print the student's name and ID number to the output terminal.
     */
    public void print()
    {
        System.out.println(name + ", student ID: " + id + ", credits: " + credits);
        
    }
}