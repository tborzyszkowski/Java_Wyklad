package lab2.utils;

public class UniqueIdProvider
{
    private int currentId;

    public UniqueIdProvider(Integer initialId)
    {
        this.currentId = initialId;
    }

    public UniqueIdProvider()
    {
        this.currentId = 0;
    }

    public int getNextId()
    {
        this.currentId++;
        return currentId;
    }
}
