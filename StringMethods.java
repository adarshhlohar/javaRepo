public class StringMethods {
    public static void main(String[] args) {
        String name = "Adarsh Lohar is Best Adarsh";
        String name2 = "Adarsh";
        int count = 0;
        // System.out.println(name);
        // int value = name.length();
        // System.out.println(value);

        // String lCase = name.toLowerCase();
        // System.out.println(lCase);

        // String uCase = name.toUpperCase();
        // System.out.println(uCase);

        // String nonTrimmedString = "    Addi    ";
        // System.out.println(nonTrimmedString);

        // String trimmedString = nonTrimmedString.trim();
        // System.out.println(trimmedString);

        // String name1 = name.trim();
        // System.out.println(name); 
        // System.out.println(name1); 

        // System.out.println(name.substring(2));
        // System.out.println(name.substring(2,5));

        // System.out.println(name.replace('a', 'p'));

        // System.out.println(name.replace("Ada", "pad"));
        // System.out.println(name);

        // System.out.println(name.startsWith("Ad"));
        // System.out.println(name.endsWith("rsh"));

        // System.out.println(name.charAt(4));


        // String modifiedName = "Adarshrshrsh";
        // System.out.println(modifiedName.indexOf("rsh"));
        // System.out.println(modifiedName.indexOf("rsh",5));

        // System.out.println(name.equals("Adarsh"));

        // System.out.println(name.equalsIgnoreCase("ADARSH"));

        // System.out.println("\'I am a escape sequence \tdouble quote\'");

        count = ( name.split(name2, -1).length ) - 1;

        // for (int i = 0; i < name.length(); i++) {
        // if (name.contains(name2)) {
        //     count++;
        // }
        System.out.println("the value of count is : " + count);
        // }
    }
}
