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
 * Modified by Karolina Berdyszak
 */
public class TicketMachine
{
    // The price of a ticket from this machine.
  
    // The amount of money entered by a customer so far.
    private int balance;
    // The total amount of money collected by this machine.
    private int total;
    
    private Ticket issuedticket; 
    
    private Ticket aylesburyTicket;
    
    private Ticket amershamTicket; 
    
    private Ticket highwycombeTicket;
   
    Coin coin;
    /**
     * Create a machine that issues tickets of the given price.
     */
    public TicketMachine()
    {
        
        balance = 0;
        total = 0;
        
        aylesburyTicket = new Ticket("Aylesbury",220);
        amershamTicket = new Ticket("Amersham", 300);
        highwycombeTicket = new Ticket("High Wycombe",330);
        issuedticket = null; 
    }
    
  
        
    

    /**
     * Return The amount of money already inserted for the
     * ticket.
     */
    public int getBalance()
    {
        return balance;
    }

    /**
     * Receive an amount of money
     * 
     */
    public void insertMoney(int amount)
    {
        if(amount > 0) 
        {
            balance = balance + amount;
        }
        else 
        {
            System.out.println("Use a positive amount rather than: " +
                               amount);
        }
    }

    public void selectAylesburyTicket()
    {
             issuedticket=aylesburyTicket;
            }
    
            public void selectAmershamTicket()
    {
             issuedticket=amershamTicket;
            }
    
              public void selectHighWycombeTicket()
    {
             issuedticket=highwycombeTicket;
            }
     
     
    /**
     * Print a ticket if enough money has been inserted, and
     * reduce the current balance by the ticket price. Print
     * an error message if more money is required.
     */
    public void printTicket()
    { int price = issuedticket.getPrice();
        if(balance >= price) 
        {
            // Simulate the printing of a ticket.
            System.out.println("##################");
            System.out.println("# MetroExpress");
            System.out.println("# Ticket" );
            issuedticket.print();
            System.out.println("# " + price + " pence.");
            System.out.println("##################");
            System.out.println();

            // Update the total collected with the price.
            total = total + price;
            // Reduce the balance by the price.
            balance = balance - price;
        }
        else 
        {
            System.out.println("You must insert no less than: " +
                               (price - balance) + " more cents.");
                    
        }
    }

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
    
   public void insert20p()
   {
   balance = balance +20;
    printBalance(20);
   }
   
   public void insert10p()
   {
   balance = balance +10;
    printBalance(10);
   }
   
   public void insert100p()
   {
   balance = balance +100;
    printBalance(100);
   }
   
 public void insert200p()
   {
   balance = balance +200;
   printBalance(200);
   }
 public void printBalance(int amount){
 System.out.println("You need inserted at least");
 System.out.println("Your balance = " + balance );
}
}