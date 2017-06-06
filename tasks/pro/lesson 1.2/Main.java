package tasks.pro.lesson_1_2

public class Main
{
    public static void main(String[] args) {
    
    try {
            final String value = "String value";
            TextContainer container = new TextContainer(value);

            SaveProcessor.save(container);
        }
        
        catch(Exception e) 
        
        {
        
        e.printStackTrace();
        
        }
    }
}
