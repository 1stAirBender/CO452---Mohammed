/**
 * TicketMachine models a ticket machine that issues
 * flat-fare tickets.
 * The price of a ticket is specified via the constructor.
 * Instances will check to ensure that a user only enters
 * sensible amounts of money, and will only print a ticket
 * if enough money has been input.
 * 
 * @author David J. Barnes and Michael Kölling
 * @version 2016.02.29
 * 
 * Modified by Mohammed Ahmed - 21915819
 */
import java.util.Date;
import java.text.SimpleDateFormat;
//Added a public class for the ticket machine with the balance and total of
//tickets when buying
public class TicketMachine extends Ticket
{
    
    // The amount of money entered by a customer so far.
    private int balance;
    // The total amount of money collected by this machine.
    private int total;
    
    

    /**
     * Create a machine that issues tickets of the given price.
     */
    //As you can see with the public statement of the balnce and total
    public TicketMachine()
    
    {
        
        balance = 0;
        total = 0;
    }
    //Created a public int for getting the price of each 3 destinations
    /**
     * @Return The price of a ticket.
     */
    public int getPrice(Destination dest)
    {
        int price = 0;
        if (dest == Destination.AYLESBURY)price = 220;
        if (dest == Destination.AMERSHAM)price = 300;
        if (dest == Destination.HIGHWYCOMBE)price = 330;
        return price;
    }
    //Added a public int for getting the balnace and return balance
    /**
     * Return The amount of money already inserted for the
     * next ticket.
     */
    public int getBalance()
    {
        return balance;
    }
    //Added a statement to insert a certain amount of money for your ticket
    //depending on the destination
    /**
     * Receive an amount of money from a customer.
     * Check that the amount is sensible.
     */
    public void insertCoin(Coin c)
    {
        
        
            balance = balance + c.getValue();
            System.out.println("# " + balance + " pence.");
        
         
       
        
    }
    /**
     * Print a ticket if enough money has been inserted, and
     * reduce the current balance by the ticket price. Print
     * an error message if more money is required.
     */
    //Added a int statement for getting the price and the new dtae of the
    //destination and a print stsemnet to print out the details of the ticket
    //and how much you paid etc.
    public void printTicket(Destination dest)
    {
        int price = getPrice(dest);
        Date today = new Date();
        if(balance >= price) 
        {
            // Simulate the printing of a ticket.
            System.out.println("##################");
            System.out.println("# The BlueJ Line");
            System.out.println("# Ticket to "+ dest);
            System.out.println("# " + price + " pence.");
            System.out.println("# on "+ today);
            System.out.println("##################");
            System.out.println();
            

            // Update the total collected with the price.
            total = total + price;
            // Reduce the balance by the price.
            balance = balance - price;
        }
        else 
        {
            System.out.println("You must insert at least: " +
                               (price - balance) + " more cents.");
                    
        }
    }
    //Finally i added a public int statement for refunding a ticket with all
    //its details of the ticket.
    /**
     * Return the money in the balance.
     * The balance is cleared.
     */
    public int refundBalance()
    {
        int amountToRefund;
        amountToRefund = balance;
        balance = 0;
        return amountToRefund;
    }
}