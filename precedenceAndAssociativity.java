public class precedenceAndAssociativity {
    public static void main(String[] args) {
        int a = 6*5-34/2;
        /*
         * Highest  precendece goes to * and / . They are evaluated on the basis of left to right associativity
         * 30-34/2
         * 30-17
         * 13
         */
        System.out.println(a);   //13

        int b = 60/5- 34*2;
        /*
         * 12-34*2
         * 12-68
         * -56
         */
        System.out.println(b);   //-56

        int x = 6;
        int y = 1;
        int k = x*y/2;
        System.out.println(k);
    }
    
}
