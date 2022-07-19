package Training;

import java.util.ArrayList;

public class ArrayListT {
    public static void main(String[] args) {
        ArrayList<String> arrayList1 = new ArrayList<>();

        arrayList1.add("Ivan");
        arrayList1.add("Daniil");
        arrayList1.add("Vadim");

        System.out.println(arrayList1);
        System.out.println(arrayList1.get(0));

        arrayList1.set(0, "Nikita");
        System.out.println(arrayList1);
    }
}
