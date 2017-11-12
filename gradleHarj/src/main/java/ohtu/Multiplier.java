package ohtu;

public class Multiplier {
    private int value;

    public Multiplier(int value) {
        this.value = value;
    }

    public int multiply(int other) {
        return other * value;
    }
}