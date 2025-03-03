import java.util.*;


public class SetExample {
    public static void main(String[] args) {

        Set<Integer> li=new HashSet<>();
        li.add(1);
        li.add(8);
        li.add(10);
        li.add(20);
        li.add(1);
        System.out.println(li);

        Set<Integer> la=new TreeSet<>();
        la.add(200);
        la.add(54);
        la.add(76);
        la.add(400);
        la.add(300);
        System.out.println(la);

        
    }
    
}
