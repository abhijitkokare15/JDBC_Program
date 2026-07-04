// a thread of execution is the smallest sequence of programmed instructions that can be managed independently by a scheduler, which is typically a part of the operating system.

// The implementation of threads and processes differs between operating systems, but in most cases, a thread is a component of a process.

// Multiple threads can exist within the same process and share resources such as memory, while different processes do not share these resources.
// Using two different task at the same time means multi-tasking. The thread is unit of a process.

// use of threads
//  ->using complete cpu power
//  -> Asynctask android
//  -> Web application (servelet)
//  ->gamming
 
 // every java code use one thread i.e main 
//JVM asks the Operating System to create a new thread.
// The OS creates another execution path.
// The scheduler decides when each thread gets CPU time.
// The JVM automatically calls:
  // run 
 class T  extends Thread
 {
    public  void run()
    {
        for(int i=2;i<=10;i=i+2)
            System.out.println(i);

    }

 }
public class Thrads  {

//    public  void run()
//     {
//         for(int i=2;i<=10;i=i+2)
//             System.out.println(i);

//     }
    void main()
    {
       T t = new T(); 
       t.start();

       for(int i=1;i<=10;i=i+2)
       {
         System.out.println(i);
       }
    }

    
}
