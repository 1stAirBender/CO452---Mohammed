import java.util.*;
/**
 * Write a description of class Module here.
 *
 * @author (Mohammed Ahmed)
 * @version (22/10/2020)
 */
public class Module
{
    // instance variables - replace the example below with your own
    private String title;
    private String code;
    private int marks;
    
    // A public statement for and string for the module title and code
    /**
     * Constructor for objects of class Module
     */
    public Module(String moduleTitle, String moduleCode)
    {
        // initialise instance variables
        title = moduleTitle;
        code = moduleCode;
        marks = 0;
    }
    // A public statement for the marks given to the student
    public void setMarks(int m)
    {
        marks = m;
    }
    //A public statement for getting the marks when finishing the module
    public int getMarks()
    {
        return marks;
    }
    // A public statement and print system for the course title, code and marks
    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void print()
    {
        // put your code here
        System.out.println("# title, "+title);
        System.out.println("# code, "+code);
        System.out.println("# marks,"+marks);
    }
}