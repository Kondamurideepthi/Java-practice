//  public class ThreadExample
// {
//     public static void main(final String[] args) {
//         final A obj1=new A();
//         final B obj2 =new B();
//         obj1.start();
//     obj2.start();
// }
// }
//      class A extends Thread{
//         public void run()
//         {
//             for(int i=0;i<=100;i++)
//             {
//             System.out.println("hiii");
//             try{
//                 Thread.sleep(10);
//             }
//             catch(final Exception e)
//             {
//                 e.printStackTrace();
//             }
//             }
//         }
        
            
//         }
//     class B extends Thread {
//         public void run()
//         {
//                     for(int i=0;i<=100;i++)
//                     {
//                         try{
//                             Thread.sleep(10);
//                         }
//                         catch(Exception e)
//                         {
//                             e.printStackTrace();
//                         }
//                     }
//         }
    
//     }

public class ThreadExample {
    public static void main(final String[] args) {
        final A obj1 = new A();
        final B obj2 = new B();
        
        obj1.start();
        obj2.start();
    }
}

class A extends Thread {
    public void run() {
        for (int i = 0; i < 100; i++) { // Optimized loop condition
            System.out.println("hiii");
            try {
                Thread.sleep(10);
            } catch (final Exception e) {
                e.printStackTrace();
            }
        }
    }
}

class B extends Thread {
    public void run() {
        for (int i = 0; i < 100; i++) { // Optimized loop condition
            System.out.println("hello"); // Added missing print statement
            try {
                Thread.sleep(10);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}

