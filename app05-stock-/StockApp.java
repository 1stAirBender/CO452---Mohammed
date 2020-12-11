/**
 * This app provides a user interface to the
 * stock manager so that users can add, edit,
 * print and remove stock products
 *
 * Mohammed Ahmed - 21915819
 * 20/11/2020
 */
 // Adding a public class for the stock app, i inputed the instuctions for the products for add, quit, printall, remove, deliver, sell, search, re-stock and low stock. All in a public static method
 // and i also added private strings for the input reader, stock manager and stock demo.
public class StockApp
{
    public static final char CLEAR_CODE = '\u000c';
    public static final String OUIT = "quit";
    public static final String ADD = "add";
    public static final String PRINT_ALL = "printall";
    public static final String REMOVE = "remove";
    public static final String DELIVER = "deliver";
    public static final String SELL = "sell";
    public static final String SEARCH = "search";
    public static final String LOW_STOCK = "lowstock";
    public static final String RE_STOCK = "restock";
   
   
   
    // Use to get user input
    private InputReader input = new InputReader();
    
    private StockManager manager = new StockManager();
    
    private StockDemo demo = new StockDemo();
    
  

    /**
     * 
     */
    //A public void for the heading and menu choice
    public void run()
    {
        printHeading();
        getMenuChoice();
    }
    
    /**
     * 
     */
    // Adding a boolean method, a while and if-else statement for the the words to be in non capital when typing on the terminal on program. 
    public void getMenuChoice()
    {
        boolean finished = false;
        
        while(!finished)
        {
            printHeading();
            printMenuChoices();
           
            String choice = input.getString().toLowerCase();
            
            if (choice.equals("quit"))
                 finished = true;
            else     
                executeMenuChoice(choice);     
        }
    }
    // Added a public void the menu choices anf if-else statments for the choices of what i can do to the product when typing in the terminal.
    private void executeMenuChoice(String choice)
    {
        if(choice.equals(ADD))
        {
            addProduct();
        }
        else if(choice.equals(REMOVE))
        {
            removeProduct();
        }
        
        else if(choice.equals(PRINT_ALL))
        {
            manager.printProductDetails();
        }
        else if(choice.equals(DELIVER))
        {
            deliverProduct();
        }
        else if(choice.equals(SELL))
        {
            sellProduct();
        }
        else if(choice.equals(SEARCH))
        {
            printMatchingProduct();
        }
        else if(choice.equals(LOW_STOCK))
        {
            printLowStockdetails();
        }
        else if(choice.equals(RE_STOCK))
        {
            ReStock();
        }
        System.out.println("Input anything to continue");
        String value = input.getString();
    }
    // As you can see i have added private voids for all menu choices for the product.
    private void printMatchingProduct()
    {
        System.out.println("Search for products");
        
        System.out.println("Please enter String");
        String name = input.getString();
        
        manager.printMatchingProduct(name);
        
    }
    
    private void ReStock()
    {
        System.out.println("Re-stock for products");
        
        manager.ReStock();
        manager.printProductDetails();
        
        
    }
    
    private void sellProduct()
    {
        System.out.println("Selling for products");
        
        System.out.println("Please enter the product ID");
        String value = input.getString();
        int id = Integer.parseInt(value);
        manager.sellProduct(id);
        Product p = manager.findProduct(id);
        
        System.out.println("\n Selling the product  " + p);
        System.out.println();
    }
    
    private void printLowStockdetails()
    {
        System.out.println("Low stock for products");
        
        manager.printLowStockdetails();
       
    }
    
    private void addProduct()
    {
        System.out.println("Adding new product\n");
        
        System.out.println("Please enter the product ID");
        String value = input.getString();
        int id = Integer.parseInt(value);
        
        System.out.println("Please enter name of the product");
        String name = input.getString();
        Product product = new Product(id, name);
        manager.addProduct(product);
        
        System.out.println("\n You have addded " + product);
        System.out.println();
    }
    
    private void deliverProduct()
    {
        System.out.println("Deliver new product\n");
        
        System.out.println("Please enter the product ID");
        String value = input.getString();
        int id = Integer.parseInt(value);
        
        System.out.println("Please enter the amount");
        value = input.getString();
        int amount = Integer.parseInt(value);
        manager.delivery(id, amount);
        Product p = manager.findProduct(id);
        
        System.out.println("\n You have deliverd " + p);
        System.out.println();
    }
    
    private void removeProduct()
    {
        System.out.println("Remove product\n");
        
        System.out.println("Please enter the product ID");
        String value = input.getString();
        int id = Integer.parseInt(value);
        
        Product p = manager.findProduct(id);
        
        manager.removeProduct(id);
        
        System.out.println("\n You have removed " + p);
        System.out.println();
    }
    // Also a private vois for printing out the menu choices when presing enter to print all the choces when typed.
    /**
     * Print out a menu of operation choices
     */
    private void printMenuChoices()
    {
        System.out.println();
        System.out.println("    Add:        Add a new product");
        System.out.println("    Remove:     Remove an old product");
        System.out.println("    PrintAll:   Print all products");
        System.out.println("    Quit:       Quit the program");
        System.out.println("    Deliver     Delivers products");
        System.out.println("    Search      Searches products");
        System.out.println("    Low stock   Low stock in products");
        System.out.println("    Re-stock    Re-stock in products");
        System.out.println("    Sell        Sell products");
        System.out.println();        
    }
    
    /**
     * Print the title of the program and the authors name
     */
    private void printHeading()
    {
        System.out.println(CLEAR_CODE);
        System.out.println("******************************");
        System.out.println(" Stock Management Application ");
        System.out.println("    App05: by Mohammed Ahmed");
        System.out.println("******************************");
    }
}