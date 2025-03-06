import java.util.*;

public class ForEachExample {
    public static void main(String[] args) {
        List<Integer> nums=Arrays.asList(3,8,100,56,82,32);
            // for(int i=0;i<nums.size();i++)
            // {
            //     System.out.println(nums.get(i));
            // }

            // for(int n:nums)
            // System.out.println(n);

            nums.forEach(n -> System.out.println(n));



        int sum=0;
        for(int n:nums)
        {
            if(n%2==0)
            sum+=n;
            
        }
        System.err.println(sum);


    }
    
}
