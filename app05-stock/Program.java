/**
 * Write a description of class Program here.
 *
 * @author (Mohammed Ahmed - 21915819)
 * @version (20/11/2020)
 */
// This is just a method to start the whole terminal itself.
public class Program
{
    private static StockApp app;
    /**
     * This class creates and runs an instance of
     * the StockApp class
     */
    public static void main()
    {
        app = new StockApp();
        app.run();
    }
}
