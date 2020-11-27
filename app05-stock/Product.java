/**
 * Model some details of a product sold by a company.
 * 
 * @author David J. Barnes and Michael Kölling.
 * @version 2016.02.29
 * Modified by Mohammed Ahmed
 * Date: 30/10/2020
 */
public class Product
{
    // An identifying number for this product.
    private int id;
    // The name of this product.
    private String name;
    // The quantity of this product in stock.
    private int quantity;
    
    //created a string for the id, name and quantity for the product

    /**
     * Constructor for objects of class Product.
     * The initial stock quantity is zero.
     * @param id The product's identifying number.
     * @param name The product's name.
     */
    public Product(int id, String name)
    {
        this.id = id;
        this.name = name;
        quantity = 0;
    }
    //String for finding the product and giving it a new name
    public void rename(String newName)
    {
        this.name=newName;
    }
    //An int for getting an the ID and returning the product
    /**
     * @return The product's id.
     */
    public int getID()
    {
        return id;
    }
    //A string for returning the product
    /**
     * @return The product's name.
     */
    public String getName()
    {
        return name;
    }
    //this for getting the quantity and then returning it
    /**
     * @return The quantity in stock.
     */
    public int getQuantity()
    {
        return quantity;
    }
    //String for printing the stock level with the details with all 10 products
    /**
     * @return The id, name and quantity in stock.
     */
    public String toString()
    {
        return id + ": " +  name + " stock level: " + quantity;
    }
    //An if statement for the amount and printing out the restock of the products
    /**
     * Restock with the given amount of this product.
     * The current quantity is incremented by the given amount.
     * @param amount The number of new items added to the stock.
     *               This must be greater than zero.
     */
    public void increaseQuantity(int amount)
    {
        if(amount > 0) 
        {
            quantity += amount;
        }
        else 
        {
            System.out.println("Attempt to restock " + name +
                               " with a non-positive amount: " + amount);
        }
    }
    //if statement for selling a product out of the stock item.
    /**
     * Sell one of these products.
     * An error is reported if there appears to be no stock.
     */
    public void sellOne()
    {
        if(quantity > 0) 
        {
            quantity--;
        }
        else 
        {
            System.out.println(
                "Attempt to sell an out of stock item: " + name);
        }
    }
}