import java.math.BigInteger;

public class Main
{

    public static void main(String[] args)
    {
        int x =6;
        calcSilnia(x);
    }

    public static void calcSilnia(int x)
    {
        BigInteger silnia = BigInteger.ONE;

        for (BigInteger i = BigInteger.ONE ; i.compareTo(new BigInteger(x+""))<=0 ; i=i.add(BigInteger.ONE))
        {
            silnia=silnia.multiply(i);
        }
        System.out.println(silnia);
    }

}
