package com.beranill;

import java.util.Arrays;
import java.util.LinkedList;

public class Sobes1 extends NegativeNumberValueException{
    public static void main(String[] args) {
        double a[] = {2, 1, 4, 2, 3};
        double b[] = {2, 3, -1, 5};

        try {
            System.out.println(Arrays.toString(task(a)));
            System.out.println(Arrays.toString(task(b)));
        }catch (NegativeNumberValueException e){
            e.printStackTrace();
            System.out.println("Negative value in array!");
        }
    }

    public static double[] task(double a[]) throws NegativeNumberValueException {
        var unique = new LinkedList<Double>();
        for (int i = a.length - 1; i >= 0; i--) {
            if (a[i] >= 0) {
                if (!unique.contains(a[i])) {
                    unique.addFirst(a[i]);
                }
            } else throw new NegativeNumberValueException("Some msg");
        }
        return unique.stream().mapToDouble(i -> i).toArray();
    }
}

class NegativeNumberValueException extends Exception {
    NegativeNumberValueException() {
    }

    NegativeNumberValueException(String msg) {
        super(msg);
    }
}

