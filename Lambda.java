@FunctionalInterface
interface A {
    void add(int a,int b);

}


public class Lambda {
    public static void main(String[] args) {
        A obj =(i,j) -> 
        {
            System.out.println("hello"+" "+(i+j));
        };
        obj.add(3,5);
    }
    
}
