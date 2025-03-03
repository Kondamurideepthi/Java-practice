class A {
    public void animal()
    {
        System.out.println("animal sound");
    }
}
class B extends A {
    public void animal()
    {
        System.out.println("cat sounds meow");
    }

}
class C extends A{
    
    public void animal()
    {
        System.out.println("dog barks");
    }
}

public class Dynamic {
    public static void main(String[] args)
    {
        A obj=new A();
        obj.animal();

        obj = new B();
        obj.animal();

        obj=new C();
        obj.animal();

    }

    
}
