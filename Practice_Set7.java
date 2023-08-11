public class Practice_Set7 {

    static void Multiplication(int x){
        for (int i = 1; i <= 10; i++) {
            System.out.format("%d X %d = %d\n",x,i,i*x);
        }
    }

    static void PrintStar(int row){
        for (int i = 0; i <= row; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void PrintStarReverse(int row){
        for (int i = 0; i < row; i++) {
            for (int j = i; j < row; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static int SumRec(int n){
        if (n == 1) {
            return 1;
        }
        else{
            return n + SumRec(n-1);
        }
    }

    static int fibonacciSeries(int num){
        if (num == 1 || num == 2) {
            return num - 1;
        }
        else{
            return fibonacciSeries(num-1) + fibonacciSeries(num-2);
        }
    }

    static void PatternUsingRecursion(int x){
        if (x > 0) {
            PatternUsingRecursion(x - 1);
            for (int i = 0; i < x; i++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        // Problem 1
        // Multiplication(7);

        // Problem 2
        // PrintStar(4);

        // problem 3
        // PrintStarReverse(4);

        // Problem 4
        // int c = SumRec(5);
        // System.out.println(c);

        // Problem 5 finding the value at that position
        // int value = fibonacciSeries(4);
        // System.out.println(value);

        // Problem 9
        PatternUsingRecursion(5);
    }
}
