//program of member inner class
package week11;

//public class innerclassesdemo {
//    public static void main(String[] args) {
//       Outerclass outerclass=new Outerclass();
//       Outerclass.Innerclass innerclass=outerclass.new Innerclass();
//       innerclass.calc();
//       innerclass.display();
//    }
//}
class Outerclass{
    int num1,num2,sum=0;
    class Innerclass{
        void calc(){
            sum=num2+num1;
        }
        void display(){
            System.out.println(sum);
        }
    }
}
//example for anonymous inner class
class Outerclass1{
    void classes(){
        System.out.println("class is not dissmised");
    }
}
//

//example for local inner class
class Outerclass2{
    void classes(){
        System.out.println("demo of local inner class");
        class Localinner{
            void display(){
                System.out.println("***********************");
        System.out.println("class is not dissmed");
     }
    }
    Localinner localinner=new Localinner();
        localinner.display();
        System.out.println("***********************");
        System.out.println("class is dissmissed");
    }

//    public static void main(String[] args) {
//        Outerclass2 outerclass2=new Outerclass2();
//        outerclass2.classes();
//    }
}
//example for static nested class
class Outerclass3{
    static int num=100;
    static class Innerclass{
        static void display(){
            System.out.println(num);
        }
    }

    public static void main(String[] args) {
        Outerclass3.Innerclass.display();
    }
}
