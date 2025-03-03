class A {
    public int add(int n1,int n2)
    {
        return n1+n2;
    }
    public int config(int n1,int n2)
    {
       return n1*n2;
    }

}
class B extends A
{
    public int add(int n1,int n2)
    {
        return n1-n2;
    }
    public int config(int n1,int n2)
    {
       return n1/n2;
    }

}

public class Override {
    public static void main(String[] args)
    {
        B obj =new B();
       int r1= obj.add(7,2);
       int r2= obj.config(15,3);
       System.out.println(r1+" "+r2);
    }
    
}
