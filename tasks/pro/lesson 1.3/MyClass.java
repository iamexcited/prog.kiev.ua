package tasks.pro.lesson_1_3

import java.io.Serializable;

public class MyClass
{

    @Save
    private String strValue;

    @Save
    private int index;

    private int counter;


    public void setStrValue(String strValue)
    {
        this.strValue = strValue;
    }

    public String getStrValue()
    {
        return strValue;
    }

    public void setIndex(int index)
    {
        this.index = index;
    }
    public int getIndex()
    {
        return index;
    }

    public void setCounter(int counter)
    {
        this.counter = counter;
    }
    public int getCounter()
    {
        return counter;
    }

    @Override
    public String toString()
    {
        return strValue + ", " + index + ", " + counter;
    }
}
