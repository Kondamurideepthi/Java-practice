
import java.util.*;
public class ComparatorExample {
    public static void main(String[] args) {
        Comparator<Integer> com=new Comparator<Integer>()
        {
            public int compare(Integer i,Integer j)
            {
                if(i%10 > j%10)
                return 1;
                else
                return -1;
            }
        };
        List<Integer> list =new ArrayList<>();
        list.add(24);
        list.add(30);
        list.add(12);
        list.add(81);

        Collections.sort(list,com);
        System.out.println(list);
        

    }
    
}
