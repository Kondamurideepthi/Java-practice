



public class AutoUnboxing {
    public static void main(String[] args)
    {
        int num1=7;
        Integer num2=num1;   // autoboxing
        System.out.println(num2);

        int num3=num2;
        System.out.println(num3);   // auto-unboxing

        String str="12";
        int num4 = Integer.parseInt(str);
        System.out.println(num4*2);
    }
    
}
