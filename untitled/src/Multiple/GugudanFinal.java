package Multiple;

import java.util.Scanner;

public class GugudanFinal {
//    public static void main(String[] args){
//        System.out.println("숫자를 입력해주세요");
//        Scanner scanner = new Scanner(System.in);
//        int num = scanner.nextInt();
//
//        int[] arr = new int[num];
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = num * (i+1);
//        }
//        for (int j = 1; j < arr.length; j++) {
//            System.out.printf("%d*%d=%d\n",num,j+1,arr[j]);
//        }
//    }

    public static void main(String[] args) {
        System.out.println("숫자2개를 쉼표로 분리해서 입력해주세요");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        String[] sv = input.split(",");

        int a = Integer.parseInt(sv[0]);
        int b = Integer.parseInt(sv[1]);

        for ( int i = 2; i <= a; i++) {
//            System.out.printf("%d단 실행",i);
            for (int j = 1; j <=b; j++) {
                System.out.printf("%d*%d=%d\n",i,j,i*j);
            }
        }

    }
}
