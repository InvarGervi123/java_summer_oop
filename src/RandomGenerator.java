import java.util.Random;

public class RandomGenerator {
    public static int next;
    public static int previous = (int)Math.random()*101;
    public static int numR() {
        next = ((previous * 25173) + 13849) % 65536;
        return next;
    }
}
