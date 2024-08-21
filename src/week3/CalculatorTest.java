package week3;

public class CalculatorTest {
    public static void main(String[] args) {

        Calculator calculator = new Calculator();

        calculator.add(2, 5);
        System.out.println("2 + 5 = " + calculator.getResult());
        calculator.add(3.2, 8);
        System.out.println("3.2 + 8 = " + calculator.getResult());
        calculator.sub(7, 2.1);
        System.out.println("7 - 2.1 = " + calculator.getResult());
        calculator.sub(4.7, 1.3);
        System.out.println("4.7 - 1.3 = " + calculator.getResult());
        calculator.mul(3, 4);
        System.out.println("3 x 4 = " + calculator.getResult());
        calculator.mul(6, 2.7);
        System.out.println("6 x 2.7 = " + calculator.getResult());
        calculator.div(5, 2);
        System.out.println("5 / 2 = " + calculator.getResult());
        calculator.div(3.2, 0.8);
        System.out.println("3.2 / 0.8 = " + calculator.getResult());
    }
}
