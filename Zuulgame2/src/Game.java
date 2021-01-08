import java.util.HashSet;

/**
 *  This class is the main class of the "World of Zuul" application.
 *  "World of Zuul" is a very simple, text based adventure game.  Users
 *  can walk around some scenery. That's all. It should really be extended
 *  to make it more interesting!
 *
 *  To play this game, create an instance of this class and call the "play"
 *  method.
 *
 *  This main class creates and initialises all the others: it creates all
 *  rooms, creates the parser and starts the game.  It also evaluates and
 *  executes the commands that the parser returns.
 *
 * @author  Michael Kölling and David J. Barnes
 * @version 2016.02.29
 * @ modified by Karolina
 *
 * Modified and extended by Karolina
 */

public class Game
{
    private final Map map;

    private final Parser parser;

    private Room currentRoom;

    private Player player;



    /**
     * Create the game and initialise its internal map.
     */
    public Game()
    {
        map = new Map();
        currentRoom = map.getHome();
        player = new Player("McCoy");
        parser = new Parser();
        play();
    }



    /**
     *  Main play routine.  Loops until end of play.
     */
    public void play()
    {
        printWelcome();

        // Enter the main command loop.  Here we repeatedly read commands and
        // execute them until the game is over.

        boolean finished = false;

        while (! finished)
        {
            Command command = parser.getCommand();
            finished = processCommand(command);
            if(player.getEnergy() <= 0)
                finished = true;
        }

        System.out.println("Thank you for playing.  Good bye.");
    }

    /**
     * Print out the opening message for the player.
     */
    private void printWelcome()
    {
        System.out.println();
        System.out.println("Welcome to the World of Zuul!");
        System.out.println("World of Zuul is a new, incredibly boring adventure game.");
        System.out.println("Type '" + CommandWord.HELP + "' if you need help.");
        System.out.println();
        System.out.println(currentRoom.getLongDescription());
    }

    /**
     * Given a command, process (that is: execute) the command.
     * @param command The command to be processed.
     * @return true If the command ends the game, false otherwise.
     */
    private boolean processCommand(Command command)
    {
        boolean wantToQuit = false;

        CommandWord commandWord = command.getCommandWord();

        switch (commandWord)
        {
            case HELP:
                printHelp();
                break;

            case GO:
                goRoom(command);
                break;

            case PLAYER:
                printPlayer();
                break;

            case ITEMS:
                printItems();
                break;

            case QUIT:
                wantToQuit = quit(command);
                break;

            default:

            case UNKNOWN:
                System.out.println("I don't know what you mean...");
                break;

        }
        return wantToQuit;
    }

    // implementations of user commands:

    /**
     * Print out some help information.
     * Here we print some stupid, cryptic message and a list of the
     * command words.
     */
    private void printHelp()
    {
        System.out.println("You are lost. You are alone. You wander");
        System.out.println("around at the university.");
        System.out.println();
        System.out.println("Your command words are:");
        parser.showCommands();
    }

    /**
     * Try to go in one direction. If there is an exit, enter the new
     * room, otherwise print an error message.
     */
    private void goRoom(Command command)
    {
        if(!command.hasSecondWord())
        {
            // if there is no second word, we don't know where to go...
            System.out.println("Go where?");
            return;
        }

        String direction = command.getSecondWord();

        // Try to leave current room.
        Room nextRoom = currentRoom.getExit(direction);

        if (nextRoom == null) {
            System.out.println("There is no door!");
        }
        /*else if(nextRoom == map.getUni() || nextRoom == map.getPub())
        {
            if(!player.dontHaveItem("ID"))
                System.out.println("You can't go to Uni and Pub without an ID");
        }
        else if(nextRoom == map.getCoffeeShop() || nextRoom == map.getPub())
        {
            if(!player.dontHaveItem("Money"))
                System.out.println("You can't go to coffee shop and Pub without Money");
        }
        else if(nextRoom == map.getLibrary() && !player.dontHaveItem("Redbull"))
            System.out.println("You can't go to Library without Redbull!");
        else if(nextRoom == map.getLibrary() && !player.dontHaveItem("ID"))
            System.out.println("You can't buy Redbull without an ID!");*/
        else {
            currentRoom = nextRoom;
            System.out.println(currentRoom.getLongDescription());
            if(currentRoom == map.getWork())
                player.grabItem("Money");
            if(currentRoom == map.getPub() && !player.dontHaveItem("ID"))
                player.grabItem("Redbull");
            if(currentRoom == map.getPark())
                player.lostItem("Money");
            if(currentRoom == map.getFriendsHouse())
                player.lostItem("ID");
            if(currentRoom == map.getLibrary() && player.dontHaveItem("Redbull")) {
                player.lostItem("Redbull");
                player.increaseEnergy(10);
            }
            player.increaseScore(5);
            player.decreaseEnergy(5);
        }
    }

    /**
     * "Quit" was entered. Check the rest of the command to see
     * whether we really quit the game.
     * @return true, if this command quits the game, false otherwise.
     */
    private void printPlayer()
    {
        System.out.println("Player name : " + player.getName());
        System.out.println("Player score : " + player.getScore());
        System.out.println("Player energy : " + player.getEnergy());
        System.out.println();
    }

    private void printItems()
    {
        System.out.println("Inventory:");
        player.inventory();
    }

    private boolean quit(Command command)
    {
        if(command.hasSecondWord()) {
            System.out.println("Quit what?");
            return false;
        }
        else {
            return true;  // signal that we want to quit
        }
    }
}