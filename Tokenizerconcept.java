package week11;
import java.util.*;

class MakingTokens{

//    void tokens(){
//  StringTokenizer stringTokenizer= new StringTokenizer("Hi,all. How are you?" , ", . ?"  , true);
//  while(stringTokenizer.hasMoreTokens()){
//      System.out.println(stringTokenizer.nextToken());
//  }
//    }
    public void operandoperatortokens( String string){

        StringTokenizer stringTokenizer= new StringTokenizer(string ,"+| |*|%|(|)|/" ,true);
        ArrayList<String> al = new ArrayList<>();
        while(stringTokenizer.hasMoreTokens()){
            String s=stringTokenizer.nextToken();
            al.add(s);
            System.out.println(s);
        }
        System.out.println("operators are: ");
        for(String s : al){
            if(s.equals("+") || s.equals("%") || s.equals("/") || s.equals("*") || s.equals("(") || s.equals(")") || s.equals("-"))
                System.out.println(s);
        }
        System.out.println("operands are: ");
        for(String s :al){
            if(s.equals("+") || s.equals("-") || s.equals("/") || s.equals("*") || s.equals("(") || s.equals(")") || s.equals("%")){
            }
            else
                System.out.println(s);
        }
    }
}
public class Tokenizerconcept {
    public static void main(String[] args) {
     MakingTokens makingTokens =new MakingTokens();
//     makingTokens.tokens();
     makingTokens.operandoperatortokens( "3+(20%2)*(20/2)");

    }
}
