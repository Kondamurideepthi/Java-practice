import java.util.Map;
import java.util.HashMap;

public class MapExample {
    
    public static void main(String[] args) {
        Map <String,Integer> students=new HashMap<>();
        students.put("deepthi",20);
        students.put("mrudula",30);
        students.put("deepthi",50);
        students.put("kiran",70);
        System.out.println(students);

        System.out.println(students.keySet());
        for(String key:students.keySet())
        {
            System.out.println(key+": "+students.get(key));
        }
    }
}
