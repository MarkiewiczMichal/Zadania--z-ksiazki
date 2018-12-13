import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        System.out.println("Please give me three integers: ");
        System.out.print("first is: ");
        int a = scan.nextInt();
        System.out.print("second is: ");
        int b = scan.nextInt();
        System.out.print("third is: ");
        int c = scan.nextInt();
        System.out.println(Math.max(Math.max(a, b), c));
        System.out.println(a > b ? a > c ? a + "" : c + "" : b > c ? b + "" : c + "");

    }
}
