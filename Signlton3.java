public class Signlton3 {
    public static void main(String[] args) {
       Thread t1 = new Thread(new Runnable()
       {
         public void run()
          {
                Demo d = Demo.getInstance();
          }
       }
       );

        Thread t2 = new Thread(new Runnable()
       {
          public void run()
          {
                Demo d = Demo.getInstance();
          }
       }
       );

       t1.start();
       t2.start();
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

         //synchronized 
         static Demo   getInstance()
        {
            // return s;
             // these create more instance 
            // s=new Demo();
            // return s;
          //  check oif insyance is not cretaed
            if(s==null)
             {
                synchronized(Demo.class)
                {
                    if(s==null)
                    {
                         s=new Demo();
                    }
                
                }

             //if created then retrun first created insatnce

            
        }
         return s;
    }
        void show()
        {
            System.out.println("Signlton");
        }
    }
    
    

