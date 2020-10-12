
/**
 * Write a description of class Course here.
 *
 * @author Karolina Berdyszak
 * @version 2020.10.06
 */
public class Course
{
    // Attribute,field,variable
    private String title;
    
    private String CodeNo;
    
    

    /**
     * Constructor for objects of class Course
     */
    public Course(String title, String code)
    {
        this.title = title;
        this.CodeNo = code;
    }
    
    public void print()
    {
                System.out.println("Course;" +title + ", CodeNo " + CodeNo);
            }

}
