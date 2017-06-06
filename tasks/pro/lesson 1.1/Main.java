package tasks.pro.lesson_1_1

public class Main
{
    public static void main(String[] args)
    
    {
        try
        
        {
            
            Tester.test(MyClass.class);
            
        }
        
        catch(Exception e)
        
        {
        
            e.printStackTrace();
            
        }
    }
}
