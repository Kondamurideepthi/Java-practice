class Demo{
    
         Demo()
        {
            System.out.println("hiii");
        }
         Demo(int a, int b)
        {
            System.out.println(a+b);
        }
         Demo(int a,int b,float c)
        { 
            float f=(float)(a+b+c);
            System.out.println(f);
        }
        public static void main(String[] args)
    {
        Demo obj=new Demo();
        Demo obj1=new Demo(2,3);
        Demo obj2=new Demo(2,3,5.6f);

    }
}