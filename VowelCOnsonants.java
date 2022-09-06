package week11;
import java.util.*;
class Count{
    String string;
    int vowel=0;
    int consonant=0;
    void counting(){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the string");
        string=sc.nextLine();
        for(int index=0;index<string.length();index++){
            if(string.charAt(index)=='A' || string.charAt(index)=='E' || string.charAt(index)=='I' ||string.charAt(index)=='O' ||string.charAt(index)=='U' ||string.charAt(index)=='a' ||string.charAt(index)=='e' ||string.charAt(index)=='i' ||string.charAt(index)=='o' ||string.charAt(index)=='u' ){
                vowel++;
            }
            else if(string.charAt(index)!=' ')
                consonant++;
        }
        System.out.println("the number of vowels are "+ vowel + " and consonants are "+ consonant);
    }
}

public class VowelCOnsonants {
    public static void main(String[] args) {
        Count count=new Count();
        count.counting();

    }

}
