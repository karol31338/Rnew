
/**
 * Write a description of class Course here.
 *
 * @author Karolina Berdyszal
 * @version 12/10/20
 *
 */
public class Course
{
    // Attribute, field, variable 
    private String codeNo;
    
    private String title;
    

    /**
     * Constructor for objects of class Course
     */
    public Course(String codeNumber, String title)
    {
        this.codeNo = codeNumber;
        this.title = title;
    }
    
    public void print()
    {
        System.out.println("Code number is: " + codeNo + 
        " and course title: " + title);
    }
    
    /**
     * Method that returns module number
     *
     * @return    moduleNo
     */
    public String getCodeNumber()
    {
        return codeNo;
    }
    
    /**
     * Method that returns title
     *
     * @return    title
     */
    public String getTitle()
    {
        return title;
    }
    /*
     * Method that sets moduleNo to field variable moduleNo
     */
    public void setModuleNumber(String codeNumber)
    {
        this.codeNo = codeNumber;
    }
    /*
     * Method that sets title to field variable title
     */
    public void setTitle(String title)
    {
        this.title = title;
    }
    
    
}