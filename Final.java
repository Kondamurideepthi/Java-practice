

class A 
{
    final int marks=100;
    public final void set()
    {
        System.out.println("hello");
    }

    public void marks()
    {
        System.out.println("I secured 100 marks");
    }
}
 class B extends A {

    public void marks()
    {
        System.out.println("I just reached to pass Percentage");
    }

 }


public class Final {
    public static void main(String[] args) {
        B obj =new B();
            obj.marks();
            obj.set();
        }
    }
    

