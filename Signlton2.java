public class Signlton2 {
    public static void main(String[] args) {
       Demo d =Demo.getInstance();
    //    d.show();

      Demo d2=Demo.getInstance();

    }
    }


    class Demo
    {
         // cretae static object
        static  Demo s;// = new Demo();

       // create private constructor
        private Demo()
        {
             IO.println("Insatnce created");
        }

        // create a static method that return this static instance

        static Demo getInstance()
        {
            // return s;
             // these create more instance 
            // s=new Demo();
            // return s;
            check oif insyance is not cretaed
            if(s==null)
             {
                s=new Demo();

             }

             //if created then retrun first created insatnce

             return s;
        }

        void show()
        {
            System.out.println("Signlton");
        }
    }
    
    

