import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
public class CollectionExample {
    public static void main(String[] args) {
        List<Integer> li=new ArrayList<>();
        li.add(2);
        li.add(3);
        li.add(4);
        System.out.println(li.indexOf(4));
        System.out.println(li.isEmpty());
        System.out.println(li.get(1));
        System.out.println(li.toArray());
        System.out.println(li.get(2));
        for(Object a:li)
        {
            System.out.println(a);
        }
    }
    
}
