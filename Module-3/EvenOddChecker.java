import java.util.Scanner;

public class EvenOddChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int n = scanner.nextInt();
        if (n % 2 == 0) {
            System.out.println(n + " is Even.");
        }
        else {
            System.out.println(n + " is Odd.");
        }
        scanner.close();
    }
}
