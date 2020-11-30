
/**
 * This app provides a user interface to the
 * stock manager so that users can add, edit,
 * print and remove stock products
 *
 * @author Karolina
 * @version 1
 */
public class StockApp
{
    //public static final char CLEAR_CODE = '\u000C';
    
    //public static final String QUIT = "quit";
    //public static final String ADD = "add";
    //public static final String PRINT_ALL = "printall";
    //public static final String DELIVER = "deliver";
    
    // Use to get user input
    private InputReader input = new InputReader();
    
    private StockManager manager = new StockManager();
    
    private StockDemo demo = new StockDemo(manager);
    
    /**
     * 
     */
    public void run()
    {
        boolean finished = false;
        
        while(!finished)
        {
            printHeading();
            printMenuChoices();
           
            String choice = input.getString().toLowerCase();
            
            if(choice.equals("quit"))
                finished = true;
            else
                executeMenuChoice(choice);
        }
    }
    
   
    
    private void executeMenuChoice(String choice)
    {
        if(choice.equals("add"))
        {
            addProduct();
        }
        else if(choice.equals("printall"))
        {
            manager.printAllProducts();
            String value = input.getString();
        }
        else if(choice.equals("remove"))
        {
            removeProduct();
        }
        else if(choice.equals("deliver"))
        {
            deliverProduct();
        }
        else if(choice.equals("sell"))
        {
            sellProduct();
        }
        else if(choice.equals("search"))
        {
            searchProducts();
        }
        else if(choice.equals("lowstock"))
        {
            manager.printLowStockLevels();
        }
        else if(choice.equals("restock"))
        {
            manager.restockLowProducts();
        }
        else
        {
            System.out.println("Wrong choice");
        }
    }
    
    private void addProduct()
    {
        System.out.println("Adding new product\n");
        
        System.out.println("Please enter the product ID");
        String value = input.getString();
        int id = Integer.parseInt(value);
        
        System.out.println("Please enter the name of the product");
        String name = input.getString();
        
        Product product = new Product(id, name);
        if(manager.isDuplicateID(id) == true)
            System.out.println("ID duplicated");
        else if(manager.isBlankName(product) == true)
            System.out.println("Blank name");
        else
            manager.addProduct(product);
        System.out.println("\n You have added " + product);
        System.out.println();
    }
    
    private void removeProduct()
    {
        System.out.println("Removing product\n");
        
        System.out.println("Please enter the product ID");
        String value = input.getString();
        int id = Integer.parseInt(value);
        
        System.out.println("Please enter the name of the product");
        String name = input.getString();
        
        Product product = new Product(id, name);
        manager.removeProduct(product);
        
        System.out.println("\n You have removed " + product);
        System.out.println();
    }
    
    private void deliverProduct()
    {
        System.out.println("Delivering product\n");
        
        System.out.println("Please enter the product ID");
        String value = input.getString();
        int id = Integer.parseInt(value);
        
        System.out.println("Please enter the amount of the product");
        String val = input.getString();
        int amount = Integer.parseInt(val);
        
        manager.deliverProduct(id, amount);
        
        System.out.println("\n You have delivered " + amount +
            " items of prooduct id: " + id);
        System.out.println();
    }
    
    private void sellProduct()
    {
        System.out.println("Selling product\n");
        
        System.out.println("Please enter the product ID");
        String value = input.getString();
        int id = Integer.parseInt(value);
        
        System.out.println("Please enter the amount of the product");
        String val = input.getString();
        int amount = Integer.parseInt(val);
        
        manager.sellProduct(id, amount);
        
        System.out.println("\n You have sold " + amount +
            " items of prooduct id: " + id);
        System.out.println();
    }
    
    private void searchProducts()
    {
        System.out.println("Searching products\n");
        
        System.out.println("Please enter the target phrase");
        String targetPhrase = input.getString();
        
        manager.searchProducts(targetPhrase);
        System.out.println();
    }
    
    /**
     * Print out a menu of operation choices
     */
    private void printMenuChoices()
    {
        System.out.println();
        System.out.println("    Add:        Add a new product");
        System.out.println("    Remove:     Remove an old product");
        System.out.println("    Sell:       Sell a product");
        System.out.println("    Restock:    Restock a product");
        System.out.println("    LowStock:   Low stock List");
        System.out.println("    Deliver:    Deliver a quantity of product");
        System.out.println("    Search:     Search a product");
        System.out.println("    PrintAll:   Print all products");
        System.out.println("    Quit:       Quit the program");
        System.out.println();        
    }
    
    /**
     * Print the title of the program and the authors name
     */
    private void printHeading()
    {
        //System.out.println(CLEAR_CODE);
        System.out.println("******************************");
        System.out.println(" Stock Management Application ");
        System.out.println("    App05: by Karolina");
        System.out.println("******************************");
    }
}