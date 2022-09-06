package week11;
class Stringfunctionality{
    public void details(){
        String name="coditas";

        String name2 ="CODITAS";
        System.out.println(name.compareToIgnoreCase(name2));
        name2.concat(" is best");
        System.out.println(name+" "+name2);
        String name1=new String("want to go back");
        String name3=new String("want to go back");
        String name4="want to go back";
        System.out.println(name1.compareTo(name3));
        System.out.println(name1.compareTo(name4));
        System.out.println(name1==name3);
        System.out.println(name1==name4);
        System.out.println(name1.equals(name4));
        System.out.println(name1.equals(name3));
        String name5=name1.intern();
        System.out.println(name4==name5);

    }
}

public class Stringdemo {
    public static void main(String[] args) {
        Stringfunctionality stringfunctionality=new Stringfunctionality();
        stringfunctionality.details();
    }
}
