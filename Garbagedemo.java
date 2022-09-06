package week11;
class Ayush{
    int a,b,result=0;
    void add(){
        result=a+b;
        System.out.println(result);
    }
    void subtract(){
        result =a-b;
        System.out.println(result);
    }
}

public class Garbagedemo {
    public static void main(String[] args) {
        Ayush a=new Ayush();
        Address address =new Address();
        a.a=10;
        a.b=8;
        a.add();
        a.subtract();
    }
}
