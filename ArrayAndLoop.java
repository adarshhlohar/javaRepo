public class ArrayAndLoop {
    public static void main(String[] args) {
        // int [] Array =new int[3];    it can give error dont know why
        // because of reinitialize the array
        int [] Array ={1,2,3};
        for(int i:Array){
            System.out.println(i);
        }
        System.out.println();

        float[] Marks = {4.5f,6.7f,7.4f,8.3f};
        for(float element:Marks){
            System.out.println(element);
        }
        System.out.println();

        String [] Name = {"Adarsh","Mahesh","Sameer"};
        for(String name : Name){
            System.out.println(name);
        }

        // Printing The marks in the reverse order
        for (int i = Marks.length-1; i >= 0; i--) {
            System.out.println("The value of the position "+i+" is "+ Marks[i]);
        }
    }
}
