class A{
    public int num=10;
    public void m1()
    {
        System.out.println("hello m1 method");
    }
    class B 
    {
        public void m2()
        {
            System.out.println("I'm in method 2");
        }
    }

}


public class Inner {
    public static void main(String[] args) {
        A obj =new A();
        System.out.println(obj.num=100);
        obj.m1();
        A.B obj1=obj.new B();
        obj1.m2();

        
    }
    
}
