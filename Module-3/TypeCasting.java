public class TypeCasting {
    public static void main(String[] args) {
        double d = 9.78;
        int i = (int) d;  // Explicit casting: double to int

        int a = 10;
        double b = a;  // Implicit casting: int to double

        System.out.println("Original double value: " + d);
        System.out.println("After casting to int: " + i);
        System.out.println("Original int value: " + a);
        System.out.println("After casting to double: " + b);
    }
}
