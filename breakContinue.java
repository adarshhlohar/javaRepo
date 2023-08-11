public class breakContinue {
    public static void main(String[] args) {
        // in for loop

        // for (int i = 0; i < 10; i++) {
        //     if(i == 2){
        //         break;
        //     }
        //     System.out.println(i);
        // }

        // for (int i = 0; i < 10; i++) {
        //     if(i == 2){
        //         continue;
        //     }
        //     System.out.println(i);
        // }

        // in while loop
        // int i = 0;
        // while(i< 10){
        //     System.out.println(i);
        //     i++;
        //     if (i==3) {
        //         break;
        //     }
        // } 

        int i = 0;
        while(i< 10){
            i++;
            if (i==3) {
                continue;
            }
            System.out.println(i);
        }
    }
}
