package Multiple;

import java.lang.reflect.Array;

public class Gugudan4 {
    public static void main(String[] args) {

        int[][] arr;
        arr = new int[9][9];

        int cnt = 1;
        for (int a = 0; a <= 8; a++) {
            for (int b = 0; b <= 8; b++) {
                arr[a][b] = (a + 1) * (b + 1);

            }
        }
        for (int a = 0; a <= 8; a++) {
            for (int b = 0; b <= 8; b++) {
                System.out.printf("%d*%d=%d\n", a + 1, b + 1, arr[a][b]);
            }
        }


    }
}
