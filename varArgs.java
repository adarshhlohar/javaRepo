public class varArgs {
    static int add(int ...args){
        int sum = 0;
        for(int ele : args){
            sum += ele;
        }
        return sum;
    }
    public static void main(String[] args) {
        System.out.println(add());
        System.out.println(add(5));
        System.out.println(add(1,2));
        System.out.println(add(1,2,5,6));
    }
}
