
import tools.*;
public class Inherit {

    public static void main(String[] args)
    {
        Advcal obj =new Advcal();
        Packages pack=new Packages();
        pack.hello();
        int r1 =obj.add(3, 4);
        int r2=obj.sub(7,3);
        int r3=obj.mul(3,4);
        int r4 = (int)(obj.div(15,3));
        System.out.println(r1+" "+r2+" "+r3);
        System.err.println(r4);


    }
    
}
