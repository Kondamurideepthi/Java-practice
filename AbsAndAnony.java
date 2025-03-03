abstract class A 
{
    public abstract void main();
    public abstract void sum(int a,int b);
    
}



public class AbsAndAnony {
    
    public static void main(String[] args) {
        A obj =new A() 
            {
                public void main()
                {
                    System.out.println("main");
                }
                public void sum(int a,int b)
                {
                    System.out.println(a+b);
                }
            };
        obj.main();
        obj.sum(2,3);
    }
}
