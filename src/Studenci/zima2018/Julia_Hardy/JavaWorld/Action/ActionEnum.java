package Action;

public enum ActionEnum {
    A_MOVE,
    A_REMOVE,
    A_ADD,
    A_INCREASE;

    public static int getAction(ActionEnum a){
        switch (a){
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

//    A_MOVE(0),
//    A_REMOVE(1),
//    A_ADD(2),
//    A_INCREASEPOWER(3);
//
//    private final int id;
//    ActionEnum(int id){ this.id = id; }
//    public int getValue() { return  id;}
}
