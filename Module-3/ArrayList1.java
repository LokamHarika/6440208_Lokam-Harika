import java.util.ArrayList;
import java.util.Scanner;

public class ArrayList1{
    public static void main(String[] args) {
        ArrayList<String> stuNames = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter student names (type 'exit' to stop):");
        while (true) {
            String name = sc.nextLine();
            if (name.equalsIgnoreCase("exit")) break;
            stuNames.add(name);
        }

        System.out.println("Student names entered:");
        for (String name : stuNames) {
            System.out.println(name);
        }
        sc.close();
    }
}
