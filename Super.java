class A {
    public A()
    {
        System.out.println("A Constructor");
    }
    public A(int n)
    {
        this();
        System.out.println("A parameterized Constructor");
    }
}
 class B extends A {
    public B()
    {
        super(10);
        System.out.println("I'm In B constructor");
    }
    public B(int n)
    {
        this();
        System.out.println("I'm in parameterized B constructor");
    }

}
public class Super
{
    public static void main(String[] args) {
        B obj =new B(20);
        
    }
}











