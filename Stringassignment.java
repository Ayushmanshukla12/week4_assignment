package week11;
import java.util.*;
class Stringssss {
    String string1[] = new String[5];
String temp;
    void assignment() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the elements string array");
        for (int index = 0; index < string1.length; index++) {
            string1[index] = sc.next();
        }
    }
    void reorder() {
        System.out.println("reordered array is");
        int index;
          for( index=0;index<string1.length-1;index++){
              for(int j=index+1;j<string1.length;j++){
              if(string1[index].length()>string1[j].length()) {
                  temp=string1[j];
                  string1[j]=string1[index];
                  string1[index]=temp;
              }
          }
    }
        System.out.println(Arrays.toString(string1));
    }
}
public class Stringassignment {
    public static void main(String[] args) {
        Stringssss stringssss=new Stringssss();
        stringssss.assignment();
        stringssss.reorder();
    }
}
