package Multiple;
import Multiple.Calculator;


public class Gugudan5 {
    public static void main(String[] args) {
        for (int i =2; i <=9; i++) {
            int[] result = Calculator.calculator(i);
            Calculator.print(result);
        }
    }


}
