import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        System.out.println(str);

        nonEmptyStringVer1(str);
        System.out.println("---------------------------------------");
        nonEmptyStringVer2(str);



    }

    public static void nonEmptyStringVer1(String str)
    {
        String[] nowyWyraz = str.split(" ");
        for (int i = 0; i <nowyWyraz.length ; i++)
        {
            System.out.println(nowyWyraz[i]);
        }
    }
    public static void nonEmptyStringVer2(String str)
    {
        int whereIsSpace = 0;
        for (int i = 0; i < str.length(); i++)
        {
            //Ascii code "32" mean space
            if ((int) str.charAt(i) == 32 && (int) str.charAt(i + 1) != 32)
            {
                System.out.println(str.substring(whereIsSpace, i));
                whereIsSpace = i + 1;
            } else if (i == str.length() - 1)
            {
                System.out.println(str.substring(whereIsSpace, i + 1));
            }
        }
    }
}
