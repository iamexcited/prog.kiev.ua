package tasks.pro.lesson_1_3

import java.io.*;

public class Main {
    public static void main(String[] args)
    
    {
       try {
            
            final String path = "d:\\MyClass_1_3.dat";

            MyClass myClassI = new MyClass();
            myClassI.setStrValue("TestStringValue");
            myClassI.setIndex(5);
            myClassI.setCounter(14);

            System.out.println("Before serialization : " + myClassI.toString());

           
            Saver.write(myClassI, path);

            MyClass myClassII = (MyClass)Saver.read(path);

            System.out.println("After deserialization: " + myClassII.toString());

            if ((myClassI.getStrValue().equals(myClassII.getStrValue()) && (myClassI.getIndex() == myClassII.getIndex()) 
            && (myClassII.getCounter() == 0))) 
            {
                
                System.out.println("TEST PASSED");
                
            } else
            
            {
                System.err.println("TEST FAILED");
            }
        }
        
        catch(Exception e)
        
        {
        
            e.printStackTrace();
            
        }
    }
}
