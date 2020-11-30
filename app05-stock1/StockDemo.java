import java.util.Random;
/** 
 * Demonstrate the StockManager and Product classes.
 * The demonstration becomes properly functional as
 * the StockManager class is completed.
 * 
 * @author David J. Barnes and Michael Kölling.
 * @version 2016.02.29
 * @modyfied by Karolina
 * @version 1
 */
public class StockDemo
{
    public static final int FIRST_ID = 101;
    
    // The stock manager.
    private StockManager manager;

    private Random generator;
    
    private String name = "Samsung Galaxy";
    
    /**
     * Create a StockManager and populate it with a few
     * sample products.
     */
    public StockDemo(StockManager manager)
    {
        if(name.startsWith("Samsung"))
        {
            
        }
        
        generator = new Random();
        this.manager = manager;
        
        int id = FIRST_ID;
        
        manager.addProduct(new Product(id, "Samsung Galaxy S20"));
        id++;
        
        manager.addProduct(new Product(id, "Apple iPhone 12"));
        manager.addProduct(new Product(103, "Google Pixel 4A"));
        manager.addProduct(new Product(104, "Samsung Galaxy S20"));
        manager.addProduct(new Product(105, "Apple iPhone 12"));
        manager.addProduct(new Product(106, "Google Pixel 4A"));
        manager.addProduct(new Product(107, "Samsung Galaxy S20"));
        manager.addProduct(new Product(108, "Apple iPhone 12"));
        manager.addProduct(new Product(109, "Google Pixel 4A"));
        manager.addProduct(new Product(110, "Samsung Galaxy S20"));
        manager.addProduct(new Product(111, "Apple iPhone 12"));
        manager.addProduct(new Product(112, "Google Pixel 4A"));        
    }
    
    /**
     * Provide a very simple demonstration of how a StockManager
     * might be used. Details of one product are shown, the
     * product is restocked, and then the details are shown again.
     */
    public void runDemo()
    {
        // Show details of all of the products.
        manager.printAllProducts();
        
        demoDelivery();
        demoSell();
    }
    
    private void demoDelivery()
    {
        printHeading("Delivery");
        
        int amount = 0;
        
        for(int id = 101; id <= 112; id++)
        {
            amount = generator.nextInt(7) + 1;
            manager.deliverProduct(id,amount);
            amount++;
        }
    }
    
    private void demoSell()
    {
        printHeading("Sell");
        
        int amount = 0;
        
        for(int id = 101; id <= 112; id++)
        {
            amount = generator.nextInt(7) + 1;
            manager.sellProduct(id, amount);
        }
    }  
    
    public void printHeading(String verb)
    {
        System.out.println();
        System.out.println("Demonstrating Product " + verb);
        System.out.println();        
    }
 
}