package week11;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

    // Class 1
// Of Whose object is to be created
    class Test {
        private String s;
        // Constructors of this class
        public Test() { s = "GeeksforGeeks"; }
        //methods of the class
        public void method1()
        {
            System.out.println("The string is " + s);
        }
        public void method2(int n)
        {
            System.out.println("The number is " + n);
        }
        private void method3()
        {
            System.out.println("Private method invoked");
        }
    }
    class GFG {
        public static void main(String args[]) throws Exception
        {
            // Creating object whose property is to be checked
            Test obj = new Test();
            // Creating class object from the object using getClass() method
            Class cls = obj.getClass();

            // Printing the name of class using getName() method
            System.out.println("The name of class is "
                    + cls.getName());

            // Getting the constructor of the class through the object of the class
            Constructor constructor = cls.getConstructor();

            // Printing the name of constructor using getName() method
            System.out.println("The name of constructor is "
                    + constructor.getName());

            // Display message only
            System.out.println(
                    "The public methods of class are : ");

            // Getting methods of the class through the object of the class by using getMethods
            Method[] methods = cls.getMethods();

            // Printing method names
            for (Method method : methods)
                System.out.println(method.getName());
            Method methodcall1 = cls.getDeclaredMethod("method2", int.class);

            // Invoking the method at runtime
            methodcall1.invoke(obj, 19);
            Field field = cls.getDeclaredField("s");
            field.setAccessible(true);
            field.set(obj, "JAVA");
            Method methodcall2 = cls.getDeclaredMethod("method1");
            methodcall2.invoke(obj);
            Method methodcall3 = cls.getDeclaredMethod("method3");
            methodcall3.setAccessible(true);

            // Invoking the method at runtime
            methodcall3.invoke(obj);
        }
    }
public class Reflectionsdemo {
}
