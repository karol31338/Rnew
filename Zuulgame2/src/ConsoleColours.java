/**
 * Write a description of class ConsoleColours here.
 *
 * @ author Karolina
 * @ version y1
 */
public class ConsoleColours
{
    public static final String ANSI_RESET  = "[0m";

    public static final String ANSI_BLACK  = "[30m";
    public static final String ANSI_RED    = "[31m";
    public static final String ANSI_GREEN  = "[32m";
    public static final String ANSI_YELLOW = "[33m";
    public static final String ANSI_BLUE   = "[34m";
    public static final String ANSI_PURPLE = "[35m";
    public static final String ANSI_CYAN   = "[36m";
    public static final String ANSI_WHITE  = "[37m";

    public static final String ANSI_BRIGHT_BLACK  = "[90m";
    public static final String ANSI_BRIGHT_RED    = "[91m";
    public static final String ANSI_BRIGHT_GREEN  = "[92m";
    public static final String ANSI_BRIGHT_YELLOW = "[93m";
    public static final String ANSI_BRIGHT_BLUE   = "[94m";
    public static final String ANSI_BRIGHT_PURPLE = "[95m";
    public static final String ANSI_BRIGHT_CYAN   = "[96m";
    public static final String ANSI_BRIGHT_WHITE  = "[97m";

    public static final String ANSI_BG_BLACK  = "[40m";
    public static final String ANSI_BG_RED    = "[41m";
    public static final String ANSI_BG_GREEN  = "[42m";
    public static final String ANSI_BG_YELLOW = "[43m";
    public static final String ANSI_BG_BLUE   = "[44m";
    public static final String ANSI_BG_PURPLE = "[45m";
    public static final String ANSI_BG_CYAN   = "[46m";
    public static final String ANSI_BG_WHITE  = "[47m";

    public static final String ANSI_BRIGHT_BG_BLACK  = "[100m";
    public static final String ANSI_BRIGHT_BG_RED    = "[101m";
    public static final String ANSI_BRIGHT_BG_GREEN  = "[102m";
    public static final String ANSI_BRIGHT_BG_YELLOW = "[103m";
    public static final String ANSI_BRIGHT_BG_BLUE   = "[104m";
    public static final String ANSI_BRIGHT_BG_PURPLE = "[105m";
    public static final String ANSI_BRIGHT_BG_CYAN   = "[106m";
    public static final String ANSI_BRIGHT_BG_WHITE  = "[107m";

    /**
     * Constructor for objects of class ConsoleColours
     */
    public ConsoleColours()
    {
        System.out.println(ANSI_BG_YELLOW + "This is on Yellow");
    }
}