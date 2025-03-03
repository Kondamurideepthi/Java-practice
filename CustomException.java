class DeepthiException extends RuntimeException
{
    public DeepthiException(String str)
    {
        System.out.println(str);
    }
}



public class CustomException {
    public static void main(String[] args) {
        int i=18;
        int j=0;
        try{
            j=i/20;
            if(j==0)
            throw new DeepthiException("I don't want to print zero");
        }
        catch(DeepthiException e)
        {
            j=i/1;
            System.out.println("this is the default Exception"+e);
        }
        catch(Exception e)
        {
            System.out.println("something went wrong"+e);
        }
        System.out.println(j);
        System.out.println("byee");
        
    }
    
}
