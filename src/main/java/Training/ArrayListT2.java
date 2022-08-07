package Training;

import java.util.Arrays;
import java.util.List;

public class ArrayListT2 {
    public static void main(String[] args) {
        System.out.println("1 ");
        synchronized (args){
            System.out.println("2 ");
            try {
                args.wait();
            }catch (InterruptedException ex){
                ex.printStackTrace();
            }
        }
        System.out.println("3 ");
    }
}
