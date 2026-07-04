// it is a fi al class that extned Enum class
import java.io.*;
enum status implements Serializable
{
    START(200),UPDATE(100),RUNNING(200),RESTART(300),SHUTDOWN(455);
    public int Time;
    //  private status()
    //  {
    //     System.out.println(" THis is the constructor");
    //  }

     private status(int time)
     {
        // System.out.println("Welcome");
        this.Time=time;
     }

     void show()
     {
        System.out.println("Time: "+ Time);
     }
}



public class Enu_ {
//     enum status 
// {
//     START,UPDATE,RUNNING,RESTART,SHUTDOWN;
//      private status()
//      {
//         System.out.println(" THis is the constructor");
//      }
// }

    public static void main()
    {
           status s = status.UPDATE;
        //    s.Time=100;
        //    System.out.println(s);
        // //    System.out.println(s.Time);

        // s.show();

        status []  ss= status.values();
 
       for(status S : ss)
       {
        System.out.println(S.ordinal()+":"+S);
          S.show();

       }

        // if(s==status.UPDATE)
        //     System.out.println("Come on");
        // else
        //     System.out.println("Go back");
           // s.show();


          switch (s) {
    case START:
        System.out.println("Status: START");
        break;

    case UPDATE:
        System.out.println("Status: UPDATE");
        break;

    case RUNNING:
        System.out.println("Status: RUNNING");
        break;

    case RESTART:
        System.out.println("Status: RESTART");
        break;

    case SHUTDOWN:
        System.out.println("Status: SHUTDOWN");
        break;

    default:
        System.out.println("Unknown Status");
}
       
    }
}
