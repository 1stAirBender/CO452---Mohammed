/**
 * Demonstrate the StockManager and Product classes.
 * The demonstration becomes properly functional as
 * the StockManager class is completed.
 * 
 * @author David J. Barnes and Michael Kölling.
 * @version 2016.02.29
 * Modified by Mohammed Ahmed
 * Date: 30/10/2020
 */
public class StockDemo
{
    // The stock manager.
    private StockManager manager;

    /**
     * Create a StockManager and populate it with a few
     * sample products.
     */
    public StockDemo()
    {
        manager = new StockManager();
        manager.addProduct(new Product(132, "Macbook Pro"));
        manager.addProduct(new Product(37,  "iPhone 12"));
        manager.addProduct(new Product(23,  "PS5"));
        manager.addProduct(new Product(1,   "Chrome Book"));
        manager.addProduct(new Product(64,  "Google Pixel 5"));
        manager.addProduct(new Product(21,  "Apple Watch"));
        manager.addProduct(new Product(6,   "iPad"));
        manager.addProduct(new Product(9,   "Samsung Galaxy"));
        manager.addProduct(new Product(99,  "iMac"));
        manager.addProduct(new Product(11,  "Headset"));
    }
    
    /**
     * Provide a very simple demonstration of how a StockManager
     * might be used. Details of one product are shown, the
     * product is restocked, and then the details are shown again.
     */
    public void demo()
    {
        // Show details of all of the products.
        System.out.println("Intial stock");
        manager.printProductDetails();
        // Take delivery of 5 items of one of the products.
        manager.delivery(132, 5);
        manager.delivery(1, 6);
        manager.delivery(11, 50);
        manager.delivery(6, 11);
        manager.delivery(23, 1400000);
        System.out.println("");
        System.out.println("After deliveries");
        manager.printProductDetails();
    }
    
    /**
     * Show details of the given product. If found,
     * its name and stock quantity will be shown.
     * @param id The ID of the product to look for.
     */
    public void showDetails(int id)
    {
        Product product = getProduct(id);
        
        if(product != null) 
        {
            System.out.println(product.toString());
        }
    }
    
    /**
     * Sell one of the given item.
     * Show the before and after status of the product.
     * @param id The ID of the product being sold.
     */
    public void sellProduct(int id)
    {
        Product product = getProduct(id);
        
        if(product != null) 
        {
            showDetails(id);
            product.sellOne();
            showDetails(id);
        }
    }
    
    /**
     * Get the product with the given id from the manager.
     * An error message is printed if there is no match.
     * @param id The ID of the product.
     * @return The Product, or null if no matching one is found.
     */
    public Product getProduct(int id)
    {
        Product product = manager.findProduct(id);
        
        if(product == null) 
        {
            System.out.println("Product with ID: " + id +
                               " is not recognised.");
        }
        return product;
    }

    /**
     * @return The stock manager.
     */
    public StockManager getManager()
    {
        return manager;
    }
    //This part of the code prints the product full details.
    public void printProduct(){
        manager.printProductDetails();
    }
    //Demo 2 initially prints the initial stock after selling a product
    public void demo2(){
        System.out.println("Intial stock");
        manager.printProductDetails();
        manager.sellProduct(23);
        System.out.println("");
        System.out.println("After selling PS5");
        manager.printProductDetails();
        
    }
    //Demo 3 prints initial stock after changing a products name.
    public void demo3(){
        System.out.println("Intial stock");
        manager.printProductDetails();
        manager.renameProduct(37, "iPhone 12 Pro");
        System.out.println("");
        System.out.println("After changing iPhone 12 name");
        manager.printProductDetails();
    }
    //Demo 4 prints the initial stock after removing a products name and details.
    public void demo4(){
        System.out.println("Intial stock");
        manager.printProductDetails();
        manager.removeProduct(37);
        System.out.println("");
        System.out.println("After removing iPhone 12");
        manager.printProductDetails();
    }
    //Demo 5 prints initial stock and helps find the product that has gone missing.
    public void demo5(){
        System.out.println("Intial stock");
        manager.printProductDetails();
        Product p = manager.findProduct("Apple");
        System.out.println("");
        System.out.println("Found");
        System.out.println(p.toString() ); 
    }
   
   
  
    
    
        
    
}
