import java.util.Scanner;

class Calculator
{
    public int addition(int a , int b){
        return a + b;
    }
    public int subtraction(int a , int b){
        return a - b;
    }
    public int multiply(int a , int b){
        return a * b;
    }
    public int division(int a , int b){
        return a / b;
    }
    public int modulus(int a , int b){
        return a % b;
    }
    
}
public class Digital_calci {

    public static void main(String arg[]){

        Scanner scanner =new Scanner(System.in);

        System.out.print("Enter the number 1: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter the number 2: ");
        int num2 = scanner.nextInt();

        scanner.nextLine();

        Calculator calc =new Calculator();

        System.out.print("Enter the operator: ");
        String operator = scanner.nextLine();
        int result = 0;
        boolean validOperator = true;

        if (operator.equals("+")) {
            result = calc.addition(num1, num2);
        } else if (operator.equals("-")) {
            result = calc.subtraction(num1, num2);
        } else if (operator.equals("*")) {
            result = calc.multiply(num1, num2);
        } else if (operator.equals("/")) {
            result = calc.division(num1, num2);
        } else if (operator.equals("%")) {
            result = calc.modulus(num1, num2);
        } else {
            validOperator = false;
            System.out.println("Invalid operator.");
        }

        if (validOperator) {
            System.out.println("The result of " + operator + " is: " + result);
        }

        scanner.close();
    }
}