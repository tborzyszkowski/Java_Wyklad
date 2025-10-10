package Laboratorium.generic;

public class GenericObject<T> {
    private T[] t;

    public GenericObject(T[] t) {
        this.t = t;
    }

    public T[] getT() {
        return t;
    }

    public void setT(T[] t) {
        this.t = t;
    }
}
