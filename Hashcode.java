class A 
{
    int marks;
    String name;
    public void set()
    {
        System.out.println("hello");
    }
}

public class Hashcode {
    public static void main(String[] args) {
        A obj =new A();
        System.out.println(obj.marks=100);
        System.out.println(obj.name = "Deepthi");
        System.out.println(obj.toString());
    }
    
}
