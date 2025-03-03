class Demo {
    private String email="dev@gmail.com";
    private long mobile=12234556778l;
    public void setemail(String email)
    {
        System.err.println(this.email);
        this.email=email;
 
    }
    public String getemail()
    {
        return email;
    }
    public void setmobile(long mobile)
    {
        System.out.println(this.mobile);
        this.mobile=mobile;
    }
    public long getmobile()
    {
        return mobile;
    }
    
}
class Hello{
    public static void main(String[] args)
    {
        Demo obj=new Demo();
        obj.setemail("dolphins@gmail.com");
        System.out.println(obj.getemail());
        obj.setmobile(123456789l);
        System.out.println(obj.getmobile());

    }
}