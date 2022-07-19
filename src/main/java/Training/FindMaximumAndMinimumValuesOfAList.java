package Training;

public class FindMaximumAndMinimumValuesOfAList {
    public static void main(String[] args) {
        int[] list = {4, 5, 7, 2, 4, 7, 8, 23, 67, 12 ,7 , -5};

        System.out.println(min(list));
        System.out.println(max(list));
    }

    public static int min(int[] list){
        int min = list[0];
        for (int i : list) {
            if (i < min)
                min = i;
        }
        return min;
    }

    public static int max(int[] list){
        int max = list[0];
        for (int i : list) {
            if (i > max)
                max = i;
        }
        return max;
    }
}
