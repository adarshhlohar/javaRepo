public class practiceSet3{
    public static void main(String[] args) {
        // problem 1.
        String name = "Jack Parker";
        name = name.toLowerCase();
        System.out.println(name);

        // problem 2.
        String text = "To my    friend ";
        text = text.replace(" ", "_" ) ;
        System.out.println(text);

        // problem 3.
        String letter = "Dear <|name|> , Thanks a lot!";
        letter = letter.replace("<|name|>","Adarsh");
        System.out.println(letter);

        // problem 4.
        String myString = "This string contain  double and triple   spaces";
        System.out.println(myString.indexOf("  "));
        System.out.println(myString.indexOf("   "));

        // problem 5.
        String myLetter = "Deer Adarsh,\n\tThis is java course is nice.\n\t\t\t\tThanks!";
        System.out.println(myLetter);
    }
}