/**
 * Enumeration class Coin - write a description of the enum class here
 *
 * @author (Mohammed Ahmed)
 * @version (9/10/2020)
 */
//I added a public staemnet which allowed me to add the tyes of coin that i
//can insert when buying a ticket. Firstly you can only instert 10 pence,
//20 pence, 1 pound and 2 pound for any of the 3 destinations.
public enum Coin
{
  P10 (10),
        P20 (20),
        P100 (100),
        P200 (200);

        private final int value;

        private Coin(int value)
        {
            this.value = value;
        }

        public int getValue()
        {
            return value;
        }  
}