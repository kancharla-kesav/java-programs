import java.util.Scanner;

public class AmstrongNumber {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();
        int originalNum = num;
        int sum = 0;
        while (num > 0) {
            int digit = num % 10; // get the last digit
            sum += Math.pow(digit, 3); // add the cube of the digit to the sum
            num /= 10; // remove the last digit
        }
        if (sum == originalNum) {
            System.out.println(originalNum + " is an Armstrong number.");
        } else {
            System.out.println(originalNum + " is not an Armstrong number.");
        }
    }
}