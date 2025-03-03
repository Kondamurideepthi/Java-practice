// public class RunTimeErrors {
    
//     public static void main(String[] args) {
//         int i=2;
//         int j=0;
//         int a=10;
//         int b=a/10;

//         int nums[]=new int[5];
//         String str =null;
//         try{
//              j=10/i;
//             System.out.println(nums[5]);
//             System.out.println(str.length());
//         }
        
//         catch(ArithmeticException e)
//         {
//             System.out.println("cannot divide the number with zero");
//         }
        
//         catch(ArrayIndexOutOfBoundsException e){
//             System.out.println("Size of thr array is exceeded");
//         }

//         catch(Exception e){
//             System.out.println("something went wrong...."+e);
//         }
        

//         System.out.println(j);
//         System.out.println("hellooo");
//     }
// }


public class RunTimeErrors
{
    public static void main(String[] args) {
        int i=18;
        int j=0;
        try{
            j=i/20;
            if(j==0)
            throw new ArithmeticException("i dont want to divide the nbr with zero");
        }
        catch(ArithmeticException e){
            j=18/1;
            System.out.println("this is the default output"+e);
        }
        catch(Exception e)
        {
            System.out.println("something went wrong.."+e);
        }
        System.out.println(j);
        System.out.println("byee");
    }
}