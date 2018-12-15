import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random rand = new Random();
        short first = (short)rand.nextInt((int)Math.pow(2,16)-1);
        short second = (short)rand.nextInt((int)Math.pow(2,16)-1);

        System.out.println(first);
        System.out.println(second);
        System.out.println(first+second);
        System.out.println(first-second);
        System.out.println(first/second);
        System.out.println(first%second);
    }
}
