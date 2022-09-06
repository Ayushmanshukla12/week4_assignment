package week11;
import java.util.*;
import java.util.jar.JarInputStream;

class Replacement {
    int index,length;String string;
    void stringtochararray(){
        String stringnew = "India is my country. All Indians are my brothers and sisters";
        char ch[]= stringnew.toCharArray();
        System.out.println(Arrays.toString(ch));
    }
//    void reordering() {
//
//        String temp;
//        Scanner sc = new Scanner(System.in);
//        System.out.println("enter the length of array");
//        int length = sc.nextInt();
//       String string[] = new String[length];
//        System.out.println("enter the array elements");
//        for (index = 0; index < length; index++) {
//            string[index] = sc.next();
//        }
//        for (index = 0; index < length - 1; index++) {
//            for (int j = index + 1; j < length; j++) {
//                if (string[index].length() > string[j].length()) {
//                    temp = string[j];
//                    string[j] = string[index];
//                    string[index] = temp;
//                }
//            }
//        }
//        System.out.println(Arrays.toString(string));
//    }
//        void replacing() {
//            String string[] = {"ayushman","ashraf","praveer","aman","saiyami"};
//                for( String stringnew : string)
//                {
//                    char ch[] =new char[stringnew.length()];
//                    for(int index=0;index<stringnew.length();index++) {
//                        char ch1 = stringnew.charAt(index);
//                        if (ch1 == 'A' || ch1 == 'E' || ch1 == 'I' || ch1 == 'O' || ch1 == 'U' || ch1 == 'a' || ch1 == 'e' || ch1 == 'i' || ch1 == 'o' || ch1 == 'u') {
//                            ch1++;
//                        }
//                    ch[index]=ch1;
//                    }
//                    System.out.println(ch);
//                }
//        }
}
public class ReplaceStrings {
    public static void main(String[] args) {
Replacement replacement=new Replacement();
//replacement.reordering();
//replacement.replacing();
        replacement.stringtochararray();
    }
}
