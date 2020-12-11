import java.util.ArrayList;
/**
 * Manage the stock in a business.
 * The stock is described by zero or more Products.
 * 
 * Modified by: (Mohammed Ahmed) 
 * (30/10/2020)
 */
public class StockManager
{
    // A list of the products.
    private ArrayList<Product> stock;

    /**
     * Initialise the stock manager.
     */
    //Creating a new array list for stock manager
    public StockManager()
    {
        stock = new ArrayList<>();
    }
    /**
     * Add a product to the list.
     * @param item The item to be added.
     */
    //Created a code for adding products to the stock
    public void addProduct(Product item)
    {
        stock.add(item);
    }
    //Created a loop for getting thed id of the product and renaming it when tested
    public void renameProduct(int id,String newName)
    {
        for(Product p:stock) {
            if(p.getID()==id)
            {
                p.rename(newName);
                break;
            }
        }
    }
    //Loop for sellling a product
    public void sellProduct(int id)
    {
        for(Product p:stock) {
            if(p.getID()==id)
            {
                p.sellOne();
                break;
            }
        }
    }
    //Loop for removing a product
    public void removeProduct(int id)
    {
        for(Product p:stock) {
            if(p.getID()==id)
            {
                stock.remove(p);
                break;
            }
        }
    }
    //Loop for finding product and getting its name by its number
    public Product findProduct(String name)
    {
        for(Product p:stock) {
            if(p.getName().contains(name))
            {
                return p;
            }
        }
        return null;
    }
    //Loop for increasing the quantity of one product
    /**
     * Receive a delivery of a particular product.
     * Increase the quantity of the product by the given amount.
     * @param id The ID of the product.
     * @param amount The amount to increase the quantity by.
     */
    public void delivery(int id, int amount)
    {
        for(Product p:stock) {
            if(p.getID()==id)
            {
                p.increaseQuantity(amount);
                break;
            }
        }
    }
    //Loop for finding a product
    /**
     * Try to find a product in the stock with the given id.
     * @return The identified product, or null if there is none
     *         with a matching ID.
     */
    public Product findProduct(int id)
    {
        for(Product p:stock) {
            if(p.getID()==id)
            {
                return p;
            }
        }
        return null;
    }
    //Loop for getting the quantity of a product 
    /**
     * Locate a product with the given ID, and return how
     * many of this item are in stock. If the ID does not
     * match any product, return zero.
     * @param id The ID of the product.
     * @return The quantity of the given product in stock.
     */
    public int numberInStock(int id)
    {
        for(Product p:stock) {
            if(p.getID()==id)
            {
                return p.getQuantity();
            }
        }
        return 0;
    }
    //Loop for printing the details of all products depending on what you want to do (e.g. 
    //searching the product)
    /**
     * Print details of all the products.
     */
    public void printProductDetails()
    {
       for(Product p:stock) {
           System.out.println(p.toString() ); 
        } 
    }
    // I also edited my stock manager and i added public void methods for the low stock, re-stock and search choices.
    public void printLowStockdetails()
    {
       for(Product p:stock) {
           if(p.getQuantity()<5)
           System.out.println(p.toString() ); 
        } 
    }
    
    public void ReStock()
    {
       for(Product p:stock) {
           if(p.getQuantity()<5)
           p.increaseQuantity(10);
        } 
    }
    
    public void printMatchingProduct(String name)
    {
        for(Product p:stock) {
            if(p.getName().contains(name))
            {
                System.out.println(p);
            }
        }
        
    }
}