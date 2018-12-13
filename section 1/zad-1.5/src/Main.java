public class Main
{

    public static void main(String[] args)
    {
        double w = Double.MAX_VALUE;
        double x = Double.MIN_VALUE;
        double y = 3000000000D;
        double z = -3000000000D;

        int i = (int) w;
        System.out.println(i);
        i = (int) x;
        System.out.println(i);
        i = (int) y;
        System.out.println(i);
        i = (int) z;
        System.out.println(i);
    }

}
