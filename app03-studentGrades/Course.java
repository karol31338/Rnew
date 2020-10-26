/**
 * This class stores information about a course
 * that enrolled students may want to complete
 *
 * @author Karolina Berdyszak
 * @version 26/10/2020
 */
public class Course
{
    // instance variables - replace the example below with your own
    private String codeNo;
    private String title;

    private Module module1;
    private Module module2;
    private Module module3;
    private Module module4;
    
    private int finalMark;
        
    private Grades finalGrade;
        
    /**
     * Constructor for objects of class Course
     */
    public Course(String codeNo, String title)
    {
        // initialise instance variables
        this.codeNo = codeNo;
        this.title = title;
        
        module1 =new Module("Programming Concepts", "CO452", 77);
        module2 =new Module("Mathematic", "CO453", 85);
        module3 =new Module("Web Development", "CO454", 44);
        module4 =new Module("Digital Technologies", "CO455", 56);
        //todo add the others
    }

    public void addMark(int mark, int moduleNo)
    {
        if(moduleNo == 1)
        {
            module1.awardMark(mark);
        }
        if(moduleNo == 2)
        {
            module2.awardMark(mark);
        }
        if(moduleNo == 3)
        {
            module3.awardMark(mark);
        }
        if(moduleNo == 4)
        {
            module4.awardMark(mark);
        }
   
    }
    /**
     * This will print out the course title and the course codenumber
     */
     public void print ()
 {
    System.out.println("Course:" + title + ", Code Number:" +codeNo);
    module1.print();
    module2.print();
    module3.print();
    module4.print();
 }
    
        /**
     * Add Module to Course
     */
    public void addModule (Module module)
    {
        this.module1 = module1;
        this.module2 = module2;
        this.module3 = module3;
        this.module4 = module4;
    }
    
   
    
    public Grades convertToGrade(int mark)
{  
    if((mark >=0) && (mark <40))
    
    {
        return Grades.F;    
    }
     
    return Grades.X;
}

    public Grades calculategrade()
 {
     int mark1 = module1.getmark();
     int mark2 = module2.getmark();
     int mark3 = module3.getmark();
     int mark4 = module4.getmark();
     
     float averagemarks = (mark1 + mark2 + mark3 + mark4) /4;
        if((averagemarks >= 0) && (averagemarks < 40))
        {
            return Grades.F;
        }
        else if((averagemarks >= 40) && (averagemarks < 50))
        {
            return Grades.D;
        }
        else if ((averagemarks >= 50) && (averagemarks < 60))
        {
            return Grades.C;
        }
        else if ((averagemarks >= 60) && (averagemarks < 70))
        {
            return Grades.B;
        }
        else if ((averagemarks >= 70) && (averagemarks <100))
        {
            return Grades.A;
        }
        
        return Grades.X;
    }
     public void courseSummary()
 { 
    System.out.println(" module1marks " + module1.getmark());
    System.out.println(" module2marks " + module2.getmark());
    System.out.println(" module3marks " + module3.getmark());
    System.out.println(" module4marks " + module4.getmark());
    System.out.println("coursegrades" + calculategrade());
 }
}