/**
 * Demonstrate the StockManager and Product classes.
 * The demonstration becomes properly functional as
 * the StockManager class is completed.
 *
 * @author David J. Barnes and Michael Kölling.
 * @version 2016.02.29
 * @modyfied by Karolina Berdyszak
 * @version 1/11/2020
 */
public class StockDemo
{
    // The stock manager.
    private StockManager manager;

    /**
     * Create a StockManager and populate it with a few
     * sample products.
     */
    public StockDemo(StockManager manager)
    {
        this.manager = manager;

        manager.addProduct(new Product(1234, "apple"));
        manager.addProduct(new Product(2345, "banana"));
        manager.addProduct(new Product(3456, "avocado"));
        manager.addProduct(new Product(4567, "tomato"));
        manager.addProduct(new Product(5678, "strawberry"));
        manager.addProduct(new Product(6789, "raspberry"));
        manager.addProduct(new Product(7890, "pumpkin"));
        manager.addProduct(new Product(8901, "cherry"));
        manager.addProduct(new Product(9012, "peach"));
        manager.addProduct(new Product(4321, "blackberry"));
    }
    public void runDemo()
    {
        manager.printAllProducts();
        demoDelivery();
    }

    /**
     * Provide a very simple demonstration of how a StockManager
     * might be used. Details of one product are shown, the
     * product is restocked, and then the details are shown again.
     */
    public void demoDelivery()
    {
        // Show details of all of the products.
        manager.printAllProducts();
        // Take delivery of 5 items of one of the products.
        manager.delivery(1234, 0);
        manager.delivery(2345, 20);
        manager.delivery(3456, 30);
        manager.delivery(4567, 40);
        manager.delivery(5678, 50);
        manager.delivery(6789, 60);
        manager.delivery(7890, 70);
        manager.delivery(8901, 80);
        manager.delivery(9012, 90);
        manager.delivery(0123, 100);

        manager.printAllProducts();
    }
    
    public void demoSell()
    {
        manager.printAllProducts();
        manager.sellProduct(1234);
        manager.sellProduct(2345);
        manager.sellProduct(3456);
        manager.sellProduct(4567);
        manager.sellProduct(5678);
        manager.sellProduct(6789);
        manager.sellProduct(7890);
        manager.sellProduct(8901);
        manager.sellProduct(9012);
        manager.sellProduct(0123);
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
}
