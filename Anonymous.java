 class A{

    public A()
    {
        System.out.println("hii");
    }
    public void show()
    {
        System.out.println("I'm in show method");
    }
    
}
public class Anonymous {
    public static void main(String[]args)
    {
        new A().show();
        new A().show();
    }
}
