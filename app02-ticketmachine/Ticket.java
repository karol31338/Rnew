import java.util.Date;

/**
 * Write a description of class Ticket here.
 *
 * modyfied by Karolina Berdyszak
 * @version 24/10/2020
 */
public class Ticket
{
   //Attributes
   
   //The Journey destination
   private String destination;
   
   // The ticket price in british currency
   private int price;
   
   // Date and time of the issued ticket
   private Date issuedateTime;
   
   
   
    /**
     * Constructor for objects of class Ticket setting the destination and
     * price. The date will contain the current system date and time
     */
    public Ticket(String destination, int price)
    {
        this.destination = destination;
        this.price = price;
        
        
        issuedateTime = new Date();
    }  
    
    public int getPrice()
    { return price;
        
    }   
    
    
    public String getDestination()
    { 
        return destination;
    }
    
    /** The print of ticket which contains information of ticket price, destination, date and time
     * 
     */
    public void print ()
    {
        System.out.println("Ticket" + destination + 
        "Price:" + price +
        "Issued" + issuedateTime);
    }
    
    
    
    
 }