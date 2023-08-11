public class Operator {
    public static void main(String[] args) {
        // Arithmatic operator
        int a = 5;
        float d = 7.3f;
        float e = 2.2f;
        int b = 6;
        int c = a+b;
        c = a- b;
        c = a/b;
        float f = d%e;
        // System.out.println(c);
        // System.out.println(f);

        // 2. Asssignment Operator
        int x = 5;
         x *= 5;
        System.out.println(x);

        // comparison Operator
        System.out.println(64>6);
        System.out.println(65<7);

        // 4.Logical Operator
        System.out.println(65>7 && 87 < 5);

        System.out.println(64 > 5 || 65 > 5 );

        // 5. bitwise Operator
        System.out.println(2&3);  // output 2
        // 10
        // 11
        // ---
        // 10
    }
}
