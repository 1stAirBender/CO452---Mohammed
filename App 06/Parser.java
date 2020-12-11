import java.util.Scanner;
/**
 * Write a description of class Parser here.
 *
 * @author (Mohammed Ahmed)
 * @version (11/11/2020)
 */
public class Parser
{
    // instance variables - replace the example below with your own
    private Scanner reader;

    /**
     * Constructor for objects of class Parser
     */
    public Parser()
    {
        reader = new Scanner(System.in);
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public String[] getCommand()
    {
        // put your code here
        while(true){
            System.out.print("> ");         
            String inputLine = reader.nextLine();
            String[] command = inputLine.split(" ");
            for(CommandWords c:CommandWords.values())
            {
                if (command[0].equalsIgnoreCase(c.name())){
                    return command;
                }
            }

            System.out.println("I dont know how to"+command[0]);
        }
        
         
    }
}
