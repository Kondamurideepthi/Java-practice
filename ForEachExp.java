import java.util.*;

public class ForEachExp {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(4,9,2,7);

        nums.forEach(n -> System.out.println(n));
    }
    
}
