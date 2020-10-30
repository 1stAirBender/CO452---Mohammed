import java.util.ArrayList;

/**
 * Manage the stock in a business.
 * The stock is described by zero or more Products.
 * 
 * @author (Mohammed Ahmed) 
 * @version (30/10/2020)
 */
public class StockManager
{
    // A list of the products.
    private ArrayList<Product> stock;

    /**
     * Initialise the stock manager.
     */
    public StockManager()
    {
        stock = new ArrayList<>();
    }

    /**
     * Add a product to the list.
     * @param item The item to be added.
     */
    public void addProduct(Product item)
    {
        stock.add(item);
    }
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

    /**
     * Print details of all the products.
     */
    public void printProductDetails()
    {
       for(Product p:stock) {
           System.out.println(p.toString() ); 
        
        } 
    }
}
