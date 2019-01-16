public abstract class Organism {

    private String sign;
    protected int power;

    public abstract boolean shouldReproduce();

    public abstract void move(Map map1);

    public Organism(String sign, int power) {
        this.sign = sign;
        this.power = power;
    }

    public String getSign() {
        return sign;
    }
}
