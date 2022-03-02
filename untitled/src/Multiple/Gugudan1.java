package Multiple;

import java.util.Scanner;

public class Gugudan1 {

    public static void main(String[] args) {


        System.out.println("화면에 숫자를 입력해주세요.");
        int a;
        Scanner scanner = new Scanner(System.in);

        int userInputNumber = scanner.nextInt();

        int b = userInputNumber;

        System.out.printf("[%d]단의 결과입니다\n", b);

        for (a=1; a<=9; a++) {
            if (a<=9) {
                System.out.println(b*a);
            }
        }

    }

}
