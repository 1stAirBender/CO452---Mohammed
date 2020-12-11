

/**
 * Write a description of class Game here.
 *
 * @author (Mohammed Ahmed)
 * @version (11/11/2020)
 */
public class Game
{
    // instance variables - replace the example below with your own
    private Map map;
    private Parser parser;
    private Player player;
    private Room room;

    /**
     * Constructor for objects of class Game
     */
    public Game()
    {
        map = new Map();
        parser = new Parser();
        player = new Player("Robin Hood");
        room = map.startingRoom();
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void play()
    {
        boolean playing = true;
        while(playing){
            room.printRoom();
            System.out.println("You are now carrying:");
            player.printItems();
            String[] c = parser.getCommand();
            if (c[0].equalsIgnoreCase("quit")){
                playing = false;
            }
            else{
                this.update(c, player, room);
            }
        }
    }
    public void update(String[] c, Player p, Room r)
    {
        if (c[0].equalsIgnoreCase("go"))
        {
            if (c.length > 1){
                int id = r.getExit(c[1]);
                if (id == -1){
                   System.out.println("Exit has been blocked, you cannot go this way");
                }
                else{
                   System.out.println("Exit has been opened, you can progress further");
                   room = map.getRoom(id);
                }
            }
            else{
                System.out.println("You have not said where to go");
            }
            
        } else if (c[0].equalsIgnoreCase("take"))
        {
            if (c.length > 1){
                Item i = r.takeItem(c[1]);
                if (i == null){
                   System.out.println("No such item has been taken");
                }
                else{
                   System.out.println("The item has been taken");
                   player.addItem(i);
                }
            }
            else{
                System.out.println("You have not said what to take");
            }
            
        }
    }
}
