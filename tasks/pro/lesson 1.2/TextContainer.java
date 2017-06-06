package tasks.pro.lesson_1_2

import java.io.FileWriter;
import java.io.IOException;

@SaveTo(path = "d:\\file.txt")

public class TextContainer {
    
    private String value;

    public TextContainer(String value)
    
    {
        this.value = value;
    }

    @Saver
    public void save(String path) throws IOException
    
    {
        try (FileWriter filewriter = new FileWriter(path))
        {
        
            filewriter.write(value);
        
        }
    }
}
