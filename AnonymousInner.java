class A {
    public void show()
    {
        System.out.println("I'm in show ");
    }
}


public class AnonymousInner {
    public static void main(String[] args) {
        A obj =new A(){
            public void show()
            {
                System.out.println("I'm Anonymous Innerclass of show ");
            }

        };
        obj.show();
        
    }
    
}
