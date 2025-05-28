public class OperatorPrecedenceExamples {
    public static void main(String[] args) {
        int res1 = 10 + 5 * 2;
        int res2 = (10 + 5) * 2;
        int res3 = 20 / 5 + 3 * 2;

        System.out.println("Result of (10 + 5 * 2) is: " + res1);
        System.out.println("Result of ((10 + 5) * 2) is: " + res2);
        System.out.println("Result of (20 / 5 + 3 * 2) is: " + res3);
    }
}
