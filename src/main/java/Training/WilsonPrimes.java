package Training;

import java.math.BigDecimal;
import java.math.BigInteger;

public class WilsonPrimes {
    public static void main(String[] args) {
        int[] mass = {1, 2, 3, 5, 11, 13, 563, 564};

        for (int i = 0; i < mass.length; i++){
            if (checkForWilson(mass[i]) == 0){
                System.out.println(mass[i] + " - true.");
            } else {
                System.out.println(mass[i] + " - false.");
            }
        }
    }
    public static double checkForWilson(double f) {
        int x = (int) f;
        BigInteger fact = BigInteger.valueOf(1);
        double whatToCheck = 0;
        for (int i = 1; i < f; i++) {
            fact = fact.multiply(BigInteger.valueOf(i));
        }

        //System.out.println("f = " + f);
        //System.out.println("fact = " + fact);
        whatToCheck = fact.add(BigInteger.valueOf(1)).mod(BigInteger.valueOf(x*x)).intValue();
        //System.out.println("whatToCheck = " + whatToCheck);
        return whatToCheck;
    }
}
