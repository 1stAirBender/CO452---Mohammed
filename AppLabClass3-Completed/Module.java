import java.util.*;
/**
 * Write a description of class Module here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Module
{
    // instance variables - replace the example below with your own
    private String title;
    private String code;
    private int marks;

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
    public void setMarks(int m)
    {
        marks = m;
    }
    public int getMarks()
    {
        return marks;
    }

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
