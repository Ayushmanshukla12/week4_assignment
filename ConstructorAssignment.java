package week11;

class ReinitializeValue{
    String name;
    ReinitializeValue(){
    }
    public ReinitializeValue(String name) {
        this.name = name;
    }
    void display(){
        System.out.println(name);
    }
}
public class ConstructorAssignment {
    public static void main(String[] args) {
          ReinitializeValue reinitializeValue = new ReinitializeValue();
          reinitializeValue.display();
          ReinitializeValue reinitializeValue1 = new ReinitializeValue("ayushman");
          reinitializeValue1.display();
    }
}
