package Multiple;

public class Calculator {
    public static int[] calculator(int num) {
        int[] arr = new int[9];
        for(int i = 0; i < arr.length; i++){
            arr[i] = num * (i+1);
        }
        return arr;
    }

    public static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

}
