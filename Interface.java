// interface A 
// {
//     int a=10;
//     String name="Ramesh";
//     void config();
//     void sum();
//     void m1();
    
// }
// class B implements A {
//     public void config()
//     {
//         System.out.println("hey");
//     }
//     public void sum()
//     {
//         System.out.println("hey I'm in sum");
//     }
//     public void m1()
//         {
//             System.out.println("helloooo");
//         }
//     }


// public class Interface {
//     public static void main(String[] args) {
//         A obj;
//         obj=new B();
//         obj.config();
//         obj.sum();
//         obj.m1();

        
//     }
// }

            //Need of an interface
interface Computer
{
    void code();
}
class Laptop implements Computer
{
    public void code(){
    System.out.println("code, compile and debug");
    }
}
class Desktop implements Computer{
    public void code()
    {
    System.out.println("I'm a desktop");

    }

}
class Developer 
{
    void devApp(Computer lap)
    {
        lap.code();
    }

}
public class Interface
{
    public static void main(String[] args) {
        Computer lap=new Laptop();
        Computer desk =new Desktop();
        Developer obj1=new Developer();
        obj1.devApp(lap);
    }
}