import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("For addition(+), enter number 1");
            System.out.println("For subtraction(-), enter number 2");
            System.out.println("For multiplication(*), enter number 3");
            System.out.println("For division(/), enter number 4");
            int counter = sc.nextInt();
            int result = 0;
            if (counter >= 5) {
                System.out.println("You entered the wrong number!!!");
                break;
            } else if (counter == 1) {
                System.out.print("Addition" + "\nEnter number: ");
                int num1 = sc.nextInt();
                System.out.print("Enter number: ");
                int num2 = sc.nextInt();
                result = num1 + num2;
                System.out.println("Result: " + result + "\n");
            } else if (counter == 2) {
                System.out.print("Subtraction" + "\nEnter number: ");
                int num1 = sc.nextInt();
                System.out.print("Enter number: ");
                int num2 = sc.nextInt();
                result = num1 - num2;
                System.out.println("Result: " + result + "\n");
            } else if (counter == 3) {
                System.out.print("Multiplication" + "\nEnter number: ");
                int num1 = sc.nextInt();
                System.out.print("Enter number: ");
                int num2 = sc.nextInt();
                result = num1 * num2;
                System.out.println("Result: " + result + "\n");
            } else if (counter == 4) {
                System.out.print("Division" + "\nEnter number: ");
                int num1 = sc.nextInt();
                System.out.print("Enter number: ");
                int num2 = sc.nextInt();
                if (num1 == 0 || num2 == 0) {
                    System.out.println("На ноль делить нельзя!!");
                }
                result = num1 / num2;
                System.out.println("Result: " + result + "\n");
            }
        }
    }
}