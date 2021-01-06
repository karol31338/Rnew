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
        energy = 100;
        items = new ArrayList<String>();
        items.add("Item1");
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

    public void resetScore()
    {
        score = 0;
    }

    public void increaseScore(int amount)
    {
        if(amount > 0)
            score += amount;
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

    /**
     *
     * @param count
     */
    public void setCount(int count)
    {
        this.count = count;
    }

    /**
     *
     */
    public void print()
    {
        System.out.println("Player name : " + name);
        System.out.println("Player score : " + score);
        System.out.println("Player energy : " + energy);
        System.out.println();
    }
}
