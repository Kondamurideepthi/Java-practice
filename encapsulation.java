 class Demo 
{
    private long mobilenbr;
    private String name;

    public void set(long l)
    {
        mobilenbr=l;
    }
    public void set(String str)
    {
        name=str;
    }
    public long get()
    {
        return mobilenbr;
    }
    public String get1()
    {
        return name;
    }

    
}
class Hello{
    public static void main(String[] args)
    {
        Demo obj=new Demo();
        obj.set(123456789l);
        obj.set("Dev Dolphins");
        System.out.println(obj.get());
        System.out.println(obj.get1());

    }
}
