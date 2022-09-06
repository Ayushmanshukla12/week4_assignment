package week11;

class Removing {
    String string = "MISSISSIPPI";
    String newstring=" ";
    void remove(){
        for( int index=0;index<string.length();index++){
           char ch=string.charAt(index);
            if (newstring.indexOf(ch) < 0)
            {
                newstring += ch;
            }
        }
        System.out.println(newstring);
    }

}
public class Repititiondemo {
    public static void main(String[] args) {
            Removing removing =new Removing();
            removing.remove();
    }
}
