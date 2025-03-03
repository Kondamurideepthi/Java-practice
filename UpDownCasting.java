class A 
{
    public void add()
    {
        System.out.println("hii"+" "+"hello");
    }
}
class B extends A{
    public void hii()
    {
        System.out.println("hey, I'm in hii method");
    }
}

public class UpDownCasting {
    public static void main(String[] args) {
        A obj =new B();
        obj.add();

        B obj1=(B) obj;
        obj1.hii();

    }
    
}
