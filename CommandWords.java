
/**
 * Enumeration class CommandWords - write a description of the enum class here
 *
 * @author (your name here)
 * @version (version number or date here)
 */
public enum CommandWords
{
    Go(1), Drop(2), Give(3), Take(4), Quit(5);
    
    private final int id;
    
    private CommandWords(int id)
        {
            this.id = id;
        }
    
    public int getValue()
    {
        return id;
    }
}
