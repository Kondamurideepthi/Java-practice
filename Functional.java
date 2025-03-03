@FunctionalInterface
 interface  A  {
    void m1();
 
}
public class Functional {
    public static void main(String[] args) {
        A obj=new A() {
            public void m1()
            {
                System.out.println("hello");
            }
            
        };
        obj.m1();
        
    }
    
}
