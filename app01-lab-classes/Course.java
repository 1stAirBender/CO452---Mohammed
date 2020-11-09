/**
 * Write a description of class Course here.
 *
 * @author (Mohammed Ahmed)
 * @version (6/10/2020)
 */
public class Course
{
    // instance variables - replace the example below with your own
    private String codeNumber;
    private String title;
    //Created a public string for the code number and the title
    /**
     * Constructor for objects of class Course
     */
    public Course(String codeNumber, String title)
    {
        this.codeNumber = codeNumber;
        this.title = title;
       
    }
    //Created a public void that will print out the code number and the course title
    public void print()
    {
        System.out.println("Code number is: " + codeNumber + 
        " Software Engineering: " + title);
        
    }
}
