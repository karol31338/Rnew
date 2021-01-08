import java.util.ArrayList;

/**
 * @ modified by Karolina
 */
public class Player
{
    private final String name;
    private int score;
    private int energy;
    private int count;
    private ArrayList<String> items;

    /**
     * Added another comment
     * @param name
     */
    public Player(String name)
    {
        this.name = name;
        score = 0;
        energy = 150;
        items = new ArrayList<String>();
        items.add("ID");
    }

    /**
     *
     * @return
     */
    public String getName()
    {
        return name;
    }

    public int getScore()
    {
        return score;
    }

    public int getEnergy()
    {
        return energy;
    }

    public void inventory()
    {
        for(String item: items)
        {
            System.out.println(item);
        }
    }

    public void grabItem(String item)
    {
        if(items.contains(item)){
            System.out.println("You have already had this item in your inventory!");
            }
        else {
            items.add(item);
            System.out.println(item + " has been taken");
        }
    }

    public void lostItem(String item)
    {
        if(items.contains(item)){
            items.remove(item);
            System.out.println("You have lost " + item + " from your inventory!");
        }
    }

    public boolean dontHaveItem(String item)
    {
        if(!items.contains(item))
            return false;
        else
            return true;
    }

    public void resetScore()
    {
        score = 0;
    }

    public void increaseScore(int amount)
    {
        if(amount > 0)
            score += amount;
    }

    public void increaseEnergy(int amount)
    {
        energy += amount;
    }

    public void resetEnergy()
    {
        energy = 0;
    }

    public void decreaseEnergy(int amount)
    {
        if(amount > 0)
            energy -= amount;
    }
}
