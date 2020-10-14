import java.util.*;

/**
 * The Student class represents a student in a student administration system.
 * It holds the student details relevant in our context.
 * 
 * @author Michael Kölling and David Barnes
 * @version 2016.02.29
 */
public class Student
{
    // the student's full name
    private String name;
    // the student ID
    private String id;
    // the amount of credits for study taken so far
    private int credits;
    
    private Course course1;
    private Course course2;
    private Course course3;
    private Course course4;
    
    
   
    
    /**
     * Create a new student with a given name and ID number.
     */
    public Student(String fullName, String studentID)
   
    {
        name = fullName;
        id = studentID;
        credits = 0;
        course1 = null;
        course2 = null;
        course3 = null;
        course4 = null;
    }
    
    public void enroll(int courseNumber,Course newCourse)
    {
        if(courseNumber == 1)course1 = newCourse;
        if(courseNumber == 2)course2 = newCourse;
        if(courseNumber == 3)course3 = newCourse;
        if(courseNumber == 4)course4 = newCourse;
    }
        
    

    /**
     * Return the full name of this student.
     */
    public String getName()
    {
        return name;
    }

    /**
     * Set a new name for this student.
     */
    public void changeName(String replacementName)
    {
        name = replacementName;
    }

    /**
     * Return the student ID of this student.
     */
    public String getStudentID()
    {
        return id;
    }

    /**
     * Add some credit points to the student's accumulated credits.
     */
    public void addCredits(int additionalPoints)
    {
        credits += additionalPoints;
    }

    
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
    public String getLoginName()
    {
        return name.substring(0,4) + id.substring(0,3);
    }
    public void printReults()
    {
        if(course1!=null) course1.print();
        if(course2!=null) course2.print();
        if(course3!=null) course3.print();
        if(course4!=null) course4.print();
    }
        
        
            
            
    
    /**
     * Print the student's name and ID number to the output terminal.
     */
    public void print()
    {
        System.out.println(name + ", student ID: " + id + ", credits: " + credits);
        
    }
}
