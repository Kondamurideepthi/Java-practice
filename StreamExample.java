// import java.util.*;

// public class StreamExample {
//     public static void main(String[] args) {
//         List<Integer> nums =Arrays.asList(2,8,5,9,200,53);


//         int result= nums.stream()
//                     .filter(n -> n%2==0)
//                     .map(n -> n*2)
//                     .reduce(0,(c,e) ->  c+e);
//                     System.out.println(result);
//     }
    
// }


import java.util.*;
public class StreamExample {

    public static void main(String[] args) {
        int size=10_000;
        List<Integer> nums =new ArrayList<>();
        Random ran =new Random();
        for(int i=0;i<=size;i++)
        {
            nums.add(ran.nextInt());
        }

        long val1 =System.currentTimeMillis();
        int result=nums.stream()
                    .map(i -> i*2)
                    .reduce(0, (c,e) -> c+e);

         long val2 =System.currentTimeMillis();
         int result2=nums.stream()
                    .map(i 
                     try{
                        Thread.sleep(1)
                     }
                     catch(Exception e){

                     }
                     return-> i*2)
                    .mapToInt(i -> i)
                    .sum();

        long val3 =System.currentTimeMillis(); 
        int result3=nums.parallelStream()
                    .map(i -> i*2)
                    .mapToInt((i) ->i)
                    .sum();   
                    
        System.out.println(result+" "+result2+" "+result3);
        System.out.println(val1-val2);
        System.out.println(val3-val2);

 
    }
}