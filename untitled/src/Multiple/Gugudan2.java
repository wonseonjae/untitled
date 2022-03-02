package Multiple;

import java.util.Scanner;

public class Gugudan2 {

    public static void main(String[] args) {


        System.out.println("곱셈하고싶은 숫자를 입력해주세요.");

        Scanner scanner = new Scanner(System.in);

            int userInputNumber = scanner.nextInt();
            int userInputNumber2 = scanner.nextInt();
                int b = userInputNumber;
                int c = userInputNumber2;
                int d = b * c;


        System.out.printf("답은 [%d]입니다.", d);



    }

}