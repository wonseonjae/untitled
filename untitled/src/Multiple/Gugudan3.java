package Multiple;

public class Gugudan3 {
    public static void main(String[] args) {

        int a;
        int b;

        for(a=1; a<=9; a++) {
            System.out.printf("\n[%d]단\n",a);
            for(b=1; b<=9; b++) {
                if(b<=9) {


                    System.out.printf("%d*%d=%d ",a,b,a*b);


                }

            }
        }

    }
}
