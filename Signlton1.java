public class Signlton1 {
    public static void main(String[] args) {
       Demo d =Demo.getInstance();
       d.show();

    //   Demo d2=Demo.getInstance();// not create second object

    }
    }


    class Demo
    {
         // cretae static object
       static  Demo s = new Demo();

       // create private constructor
        private Demo()
        {

        }

        // create a static method that return this static instance

        static Demo getInstance()
        {
            return s;
        }

        void show()
        {
            System.out.println("Signlton");
        }
    }
    
    

