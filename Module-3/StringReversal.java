import java.util.Scanner;

public class StringReversal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inp = sc.nextLine();

        StringBuilder rev = new StringBuilder(inp);
        rev.reverse();

        System.out.println("Reversed string: " + rev.toString());
        sc.close();
    }
}
