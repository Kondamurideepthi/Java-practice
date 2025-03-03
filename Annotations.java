class A {
    public void IAmSimplyAClass()
    {
        System.out.print("hiii");
    }
}
class B extends A
{
    public void IAMSimplyClass()
    {
        System.out.println("helloo");
    }

    //  @Override
    public void IAmSimplyAClass() {
        // TODO Auto-generated method stub
        super.IAmSimplyAClass();
    }
}

public class Annotations {
    public static void main(String[] args) {
        B obj=new B();
        obj.IAmSimplyAClass();
        
    }
    
}
