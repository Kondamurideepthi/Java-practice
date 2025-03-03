
// enum Status
// {
//     initial,starting,pending,succed;
// }


// public class Enums {
//     public static void main(String[] args) {
        
    
//     Status s=Status.initial;
//     System.out.println(s.ordinal());
//     Status[] ss=Status.values();

//     for(Status a:ss)
//     {
//         System.out.println(a+":"+a.ordinal());
//     }

//     }
// }


                // if-else of enums

//    enum Status{
//     pending,running,ending;
//    }
//    public class Enums{
//     public static void main(String[] args) {
//         Status s=Status.running;
//         if(s==Status.running)
//         System.out.println("All good");
//         else if(s==Status.pending) {
//             System.out.println("pending");
            
//         }
//         else
//         {
//             System.out.println("ending");
//         }
//     }
//    }

        //    SWITCH CASE OF ENUM

    // enum Status{
    //     pending,running,ending,failed;
    // }
    // public class Enums{
    //     public static void main(String[] args) {
    //         Status s=Status.failed;

    //         switch(s)
    //         {
    //             case pending:
    //             System.out.println("It is in pending State");
    //             break;
    //             case running:
    //             System.out.println("running state");
    //             break;
    //             case failed:
    //             System.out.println("failed State");
    //             break;
    //             default:
    //             System.out.println("not in any of the named constants");
    //         }
    //     }
    // }



    enum Laptop{
        Macbook(2000),Xps(100),surface,thinkpad(70000);
        private int price;
        
        
        private Laptop()
        {
            price=400;
        }
        private Laptop(int price) {
            this.price = price;
        }

        public int getPrice() {
            return price;
        }

        public void setPrice(int price) {
            this.price = price;
        }
        
    }

    public class Enums{
        public static void main(String[] args) {
            Laptop lap=Laptop.Macbook;
            System.out.println(lap);

            for(Laptop s:Laptop.values())
            {
                System.out.println(s+" "+s.getPrice());
            }
        }
    }