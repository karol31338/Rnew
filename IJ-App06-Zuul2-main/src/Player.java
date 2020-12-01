/**
 *
 */
public class Player
{
    private final String name;
    private int score;
    private int count;
    private int energy;

    /**
     * Added another comment
     * @param name
     */
    public Player(String name)
    {
        this.name = name;
        score = 0;
        energy = 100;
    }

    /**
     *
     */
    public void print()
    {
        System.out.println("Player : " + name);
        System.out.println();
    }
}
