package week11;
import java.util.*;
class Removespaces{
    String string;int index;
    public Removespaces(String string) {
        this.string = string;
    }
    void spaces(){
        Scanner sc = new Scanner((System.in));
        System.out.println(string.length());
        System.out.println(string);
        System.out.println("*************************");
        String trimmedstring=string.trim();
        System.out.println(trimmedstring.length());
        System.out.println(trimmedstring);
//        System.out.println("enter the index for unicode");
//        index=sc.nextInt();
//        char ch=trimmedstring.charAt(index);
        String char1 = getUnicodeCharacterOfChar(trimmedstring.charAt(5));
        System.out.println("Unicode value of character at 5th index is : "+char1);
//        int unicode=trimmedstring.codePointAt(index);
//        System.out.println("the unicode of member at index " + index + " is " + unicode);
    }

     String getUnicodeCharacterOfChar(char ch) {

        return  String.format("\\u%04x", (int) ch);
    }
}
public class TrimmingSpaces {
    public static void main(String[] args) {
        Removespaces removespaces = new Removespaces("                Ayushman Shukla                     ");
        removespaces.spaces();
    }
}
