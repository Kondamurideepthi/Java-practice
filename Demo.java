// class Hello
// {
//     int num=10;
//     public int add(int a, int b)
//     {
//         System.out.print(num);
//         int r=a+b;
//         return r;

//     }
    
// }

// public class Demo
// {
//     public static void main(String[] args)
//     {
//         int n1=4,n2=5;
//         Hello obj=new Hello();
//         Hello obj2=new Hello();
//         int r=obj.add(4,5);
//         obj.num=8;
//         System.out.print(obj.num);
//         System.out.println((obj2.add(4,5)));
        
   

//     }
// }

// // Single Dimentional array

// import java.util.*;
// class Hello{
//     public static void main(String[] args)
//     {
//         Scanner sc=new Scanner(System.in);
//         int a[]=new int[6];
//         for(int i=0;i<6;i++)
//         {
//             a[i]=sc.nextInt();
//         }
//         for(int i=0;i<6;i++)
//         {
//             System.out.println(a[6-i-1]);
//         }
//     }
// }


// Multi Dimentional array

// import java.util.*;
// class Hello{
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int m=sc.nextInt();
//         int n=sc.nextInt();
//         int a[][]=new int[m][n];
//         for(int i=0;i<m;i++)
//         {
//             for(int j=0;j<n;j++)
//             {
//                 a[i][j]=(int) (Math.random()*100);
            
//             }
//         }
//         for(int x[]:a)
//         {
//             for(int b:x)
//             {
//                 System.out.print(b+" ");
//             }
//             System.out.println();
//         }
//     }
// }

// three dimentional array

// import java.util.*;
// class Hello{
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int m=sc.nextInt();
//         int n=sc.nextInt();
//         int o=sc.nextInt();
//         int a[][][]=new int[m][n][o];
//         for(int i=0;i<m;i++)
//         {
//             for(int j=0;j<n;j++)
//             {
//                 for(int k=0;k<o;k++)
//                 {
//                     a[i][j][k]=(int)(Math.random()*1000);
//                 }
//             }
//         }

//         for(int x[][]:a)
//         {
//             for(int y[]:x)
//             {
//                 for(int z:y)
//                 {
//                     System.out.print(z+" ");
//                 }
//                 // System.out.println();
//             }
//             System.out.println();
//         }
//     }
// }

// array of objects

// class Student
// {
//     int rollno;
//     String name;
//     int marks;
// }
//  public class Demo
//  {
//     public static void main(String[] args)
//     {
//         Student s1=new Student();
//         s1.rollno=2;
//         s1.name="hari";
//         s1.marks=90;

//         Student s2=new Student();
//         s2.rollno=3;
//         s2.name="raju";
//         s2.marks=90;

//         Student s3=new Student();
//         s3.rollno=4;
//         s3.name="kiran";
//         s3.marks=90;

//         Student students[]=new Student[3];
//         students[0]=s1;
//         students[1]=s2;
//         students[2]=s3;

//         for(Student stud:students)
//         {
//             System.out.println(stud.rollno+" : "+stud.name);
//         }
//     }
// }

// //         for(int i=0;i<students.length;i++)
// //         {
// //             System.out.println(s1.rollno+" : "+s1.name);
// //         }


// //     }
// //  }


// 
// class Hello{
//     static int a;
//     static String b;
//     int c;
//     public static void hi(Hello obj)
//     {
//         System.out.println(a+" "+b+" "+obj.c);
//     }
    // public void hello()
    // {
    //     System.out.println(a+" "+b+" "+c);
    // }


// }

// class Demo{
//     public static void main(String[] args)
//     {
//         Hello obj=new Hello();
//         obj.a=1;
//         obj.b="deepthi";
//         obj.c=4;

//         Hello obj2=new Hello();
//         obj.a=8;
//         obj.b="deepu";
//         obj.c=9;


//         // obj.hi();
//         obj2.hi(obj);
        
//     }
// }

class Hello{

    static{
        System.out.println("Hello, I'm a static block");
    }
    Hello()
    {
        System.out.println("hey, I'm a constructor");
    }

}

public class Demo{
    public static void main(String[] args)
    {
        Hello obj=new Hello();
    
        Hello obj2=new Hello();
    }

}