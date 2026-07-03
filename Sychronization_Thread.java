// Synchronization Example
// Synchronization allows only one thread at a time
// to access the synchronized method.
//
// It prevents:
// 1. Race Condition
// 2. Data Inconsistency
// 3. Thread Interference

public class Sychronization_Thread {

    int count = 0;

    // Only one thread can execute this method at a time.
    public synchronized void increment() {
        count++;
    }

    public static void main(String[] args) throws Exception {

        Sychronization_Thread st = new Sychronization_Thread();

        Thread t1 = new Thread(new Runnable() {

          
            public void run() {

                for (int i = 1; i <= 200; i++) {
                    st.increment();
                }

            }

        });

        Thread t2 = new Thread(new Runnable() {

           
            public void run() {

                for (int i = 1; i <= 200; i++) {
                    st.increment();
                }

            }

        });

        t1.start();
        t2.start();

        // Main thread waits until both threads finish
        t1.join();
        t2.join();

        System.out.println("Final Count = " + st.count);
    }
}