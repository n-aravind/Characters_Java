public class Main {
    public static void main(String[] args) {

        char ch = 'a';
        char sp = ' ';
        char nu = '1';
        char up = 'A';
        char lo = 'b';

//        boolean isLetter(char ch)
        System.out.println(Character.isLetter(ch));
//        boolean isDigit(char ch)
        System.out.println(Character.isDigit(nu));
//        boolean isWhitespace(char ch)
        System.out.println(Character.isWhitespace(sp));
//        boolean isUpperCase(char ch)
        System.out.println(Character.isUpperCase(up));
//        boolean isLowerCase(char ch)
        System.out.println(Character.isLowerCase(lo));
//        char toUpperCase(char ch)
        char toUpper = Character.toUpperCase(lo);
//        char toLowerCase(char ch)
        char toLower = Character.toLowerCase(up);
//        toString(char ch)
        String letter = Character.toString(ch);


        //******Escape Sequences**********//

        System.out.println("Adding a tab \t here");
        System.out.println("Deleting the last character\b");
        System.out.println("Adding a new line\n here");
        System.out.println("Overwriting\rOverwritten");
        System.out.println("Adding a form feed \f here");
        System.out.println("Single quote \'");
        System.out.println("Double quote \"");
        System.out.println("Backslash \\");
    }
}
