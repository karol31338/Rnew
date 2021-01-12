import java.util.HashSet;

/**
 *  This is a comment
 * @ modified by Karolina
 */
public class Map
{
    private Room home;
    private Room pub;
    private Room uni;
    private Room friendsHouse;
    private Room coffeeShop;
    private Room work;
    private Room library;
    private Room park;

    public Map()
    {
        createRooms();
    }

    /**
     * Create all the rooms and link their exits together.
     */
    private void createRooms()
    {
        home = new Room("you start the game- it is your home", "Home");
        pub = new Room("it is time to chill after hard-work", "Pub");
        uni = new Room("you will need study a little- Hello Uni", "Uni");
        friendsHouse = new Room("you visit your friend's house", "Friend's house");
        coffeeShop = new Room("it is Time for you to take a little break and a cup of coffee", "Coffee Shop");
        work = new Room("you will be working- as you need money", "Work");
        library = new Room("time to go to the library- deadlines are soon", "Library");
        park = new Room("you will visit park to rest after a long day", "Park");

        createHome();
        createPub();
        createUni();
        createFriendsHouse();
        createCoffeeShop();
        createWork();
        createLibrary();
        createPark();
    }

    public void createHome()
    {
        home.setExit("west", pub);
        home.setExit("north", coffeeShop);
        home.setExit("east", uni);
    }
    public void createPub()
    {
        pub.setExit("east", home);
        pub.setExit("south", friendsHouse);
        pub.setExit("north", coffeeShop);

    }
    public void createUni()
    {
        uni.setExit("west", home);
        uni.setExit("north", work);
        uni.setExit("south", library);
        uni.setExit("east", park);
    }
    public void createFriendsHouse()
    {
        friendsHouse.setExit("north", pub);
        friendsHouse.setExit("east", library);
    }
    public void createCoffeeShop()
    {
        coffeeShop.setExit("south", home);
        coffeeShop.setExit("east", work);
        coffeeShop.setExit("west", pub);
    }
    public void createWork()
    {
        work.setExit("west", coffeeShop);
        work.setExit("south", uni);
        work.setExit("east", park);
    }
    public void createLibrary()
    {
        library.setExit("west", friendsHouse);
        library.setExit("north", uni);
        library.setExit("east", park);
    }
    public void createPark()
    {
        park.setExit("north", work);
        park.setExit("west", uni);
        park.setExit("south", library);
    }



    public Room getHome()
    {
        return home;
    }

    public Room getWork()
    {
        return work;
    }

    public Room getPub()
    {
        return pub;
    }

    public Room getPark()
    {
        return park;
    }

    public Room getFriendsHouse()
    {
        return friendsHouse;
    }

    public Room getLibrary()
    {
        return library;
    }

    public Room getUni()
    {
        return uni;
    }

    public Room getCoffeeShop()
    {
        return coffeeShop;
    }
}

