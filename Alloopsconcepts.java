package week11;

public class Alloopsconcepts {
    public static void main(String[] args) {
        Shape s=new Shapeset();
        s.circle();
        s.rectangle();
        s.square();
    }

}
abstract class Shape{
    abstract void circle();
    abstract void square();
    abstract void rectangle();
}

class Shapeset extends Shape{
double raduis=9,cirarea;int length=2,breadth=5,side=8,sqarea,recarea;

    @Override
    void circle() {
        cirarea=Math.PI*raduis*raduis;
        System.out.println(cirarea);
    }

    @Override
    void square() {
sqarea = side*side;
        System.out.println(sqarea);
    }

    @Override
    void rectangle() {
      recarea= length*breadth;
        System.out.println(recarea);
    }
}