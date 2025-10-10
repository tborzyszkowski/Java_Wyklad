package wyklad._03klasy.Constructors;

public class Constructor {
    private int x;

//    public Constructor(int x) {
//        this.x = x+1;
//    }

    public int getX() {
        return x;
    }
    public void setX(int x) { this.x = x; }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Constructor{");
        sb.append("x=").append(x);
        sb.append('}');
        return sb.toString();
    }
}
