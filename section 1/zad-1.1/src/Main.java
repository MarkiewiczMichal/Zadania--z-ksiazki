import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {

        Scanner scan = new Scanner(System.in);

        System.out.print("Please type positive number: ");
        int x = scan.nextInt();
        while (x < 0)
        {
            System.out.print("Your number is not positive. Type one more time: ");
            x = scan.nextInt();
        }
        System.out.println("Your decimal number: " + x + " in binary system is:");
        System.out.print("In binary system is: ");
        toBinary(x);
        System.out.print("In hexadecimal system is: ");
        toHex(x);
        System.out.print("In octal system is: ");
        toHOctal(x);
    }

    public static void toBinary(int x)
    {
        ArrayList<Integer> lista = new ArrayList<>();
        while (x != 0)
        {
            int temp = x / 2;
            lista.add(x % 2);
            x = temp;
        }
        Collections.reverse(lista);

        for (int i = 0; i < lista.size(); i++)
        {
            System.out.print(lista.get(i));
        }
        System.out.println();
    }

    public static void toHex(int x)
    {
        ArrayList<Object> lista = new ArrayList<>();
        while (x != 0)
        {
            int temp = x / 16;
            if (x % 16 < 10)
            {
                lista.add(x % 16);
            } else
            {
                lista.add((char) (x % 16 - 10 + 97));

            }

            x = temp;
        }
        Collections.reverse(lista);

        for (int i = 0; i < lista.size(); i++)
        {
            System.out.print(lista.get(i));
        }
        System.out.println();
    }

    public static void toHOctal(int x)
    {
        ArrayList<Object> lista = new ArrayList<>();
        while (x != 0)
        {
            int temp = x / 8;
            lista.add(x % 8);
            x = temp;
        }
        Collections.reverse(lista);

        for (int i = 0; i < lista.size(); i++)
        {
            System.out.print(lista.get(i));
        }
        System.out.println();
    }
}

