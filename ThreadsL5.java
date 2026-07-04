public class ThreadsL5 {

    public static void main(String[] args) throws Exception {

        Runnable a = new Runnable() {

            @Override
            public void run() {

                try {

                    for (int i = 2; i <= 10; i += 2) {

                        System.out.println("Anonymous : " + i);

                        // sleep() pauses ONLY the currently executing thread
                        // Here, Thread t1 sleeps for 1 second after every iteration.
                        Thread.sleep(1000);
                    }

                } catch (InterruptedException e) {

                    System.out.println(e);
                }
            }
        };

        Runnable b = () -> {

            try {

                for (int i = 1; i <= 10; i += 2) {

                    System.out.println("Lambda : " + i);

                    // Thread t2 sleeps for 1 second.
                    // It does NOT affect the main thread or t1.
                    Thread.sleep(1000);
                }

            } catch (InterruptedException e) {

                System.out.println(e);
            }
        };

        Thread t1 = new Thread(a);
        Thread t2 = new Thread(b);

        t1.setName("Even Thread");
        t2.setName("Odd Thread");

        // -----------------------------------------------------
        // isAlive() Method
        // -----------------------------------------------------
        // Syntax:
        // thread.isAlive();
        //
        // Return Type : boolean
        //
        // Purpose:
        // Checks whether the thread is currently alive.
        //
        // Returns:
        // true  -> Thread has started and has not yet finished.
        // false -> Thread has not started OR has already terminated.
        //
        // It is generally used to check the current status of a thread.
        // -----------------------------------------------------

        System.out.println("Before start()");
        System.out.println("t1 Alive : " + t1.isAlive());   // false
        System.out.println("t2 Alive : " + t2.isAlive());   // false

        // Start both threads
        t1.start();
        t2.start();

        System.out.println();

        System.out.println("After start()");
        System.out.println("t1 Alive : " + t1.isAlive());   // true
        System.out.println("t2 Alive : " + t2.isAlive());   // true

        // -----------------------------------------------------
        // join() Method
        // -----------------------------------------------------
        // Syntax:
        // thread.join();
        //
        // Purpose:
        // Makes the CURRENT THREAD wait until the specified
        // thread completes its execution.
        //
        // Important:
        // join() NEVER pauses the thread on which it is called.
        //
        // It pauses the thread that CALLS join().
        //
        // Here:
        // Main Thread calls t1.join()
        // Therefore Main Thread waits.
        //
        // Thread t1 continues executing normally.
        //
        // After t1 finishes,
        // Main Thread resumes execution.
        // -----------------------------------------------------

        t1.join();

        System.out.println();
        System.out.println("t1 Finished.");

        // Main thread again waits,
        // this time until t2 completes.

        t2.join();

        System.out.println();
        System.out.println("t2 Finished.");

        // After join(), both threads have terminated.

        System.out.println();

        System.out.println("After join()");
        System.out.println("t1 Alive : " + t1.isAlive());   // false
        System.out.println("t2 Alive : " + t2.isAlive());   // false

        System.out.println();

        System.out.println("Bye");
    }
}