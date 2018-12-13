import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int x;
        do
        {
            System.out.println("Give me a value which will be converted to an angle");
            System.out.print("Value: ");
            x = scan.nextInt();
            System.out.println("Angle is: ");
            whatAngle(x);
            System.out.println(Math.floorMod(x, 360));

        } while (x != 0);


    }

    public static void whatAngle(int x)
    {
        if (x < 0)
        {
            System.out.println(360 + (x % 360));
        } else
        {
            System.out.println((x % 360));
        }
    }
}
