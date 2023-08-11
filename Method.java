public class Method {
    static int Method(int x , int y){
        int z = x + y;
        return z;
    }

    int sum(int x,int y){
        int z = x + y;
        return z;
    }

    public static void main(String[] args) {
        // Direct call
        int a = 5;
        int b = 6;
        int c = Method(a,b);
        System.out.println("the addition of the a and b is " + c);
        
        // using the class object
        Method obj = new Method();
        int result = obj.sum(10,20);
        System.out.println("The value of the result is : " + result);
    }
}
