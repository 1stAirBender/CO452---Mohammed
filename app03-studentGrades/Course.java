
/**
 * Write a description of class Course here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Course
{
    // instance variables - replace the example below with your own
    private String name;
    private Module module1;
    private Module module2;
    private Module module3;
    private Module module4;

    /**
     * Constructor for objects of class Course
     */
    public Course(String courseName, Module m1, Module m2, Module m3, Module m4)
    {
        // initialise instance variables
        name = courseName;
        module1 = m1;
        module2 = m2;
        module3 = m3;
        module4 = m4;
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
        System.out.println("# course "+name);
        module1.print();
        module2.print();
        module3.print();
        module4.print();
        System.out.println("# grade"+grade());
        
    }
    public String grade()
    {
        int total = module1.getMarks() + module2.getMarks() + module3.getMarks() +module4.getMarks();
        total = total/4;
        String grade = "F";
        if(total>39)grade = "D";
        if(total>49)grade ="C";
        if(total>59)grade ="B";
        if(total>69)grade = "A";
        return grade;
    }
}
