package Action;
public enum ActionEnum
{
    A_MOVE,
    A_REMOVE,
    A_ADD,
    A_INCREASE;

    public static int getAction(ActionEnum a)
    {
        switch (a)
        {
            case A_MOVE:
                return 0;
            case A_REMOVE:
                return 1;
            case A_ADD:
                return 2;
            case A_INCREASE:
                return 3;
            default:
                return 0;
        }
    }
}
