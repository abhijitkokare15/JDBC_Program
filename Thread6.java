public class Thread6 {

    public static void main(String[] args) {

        Thread t = new Thread("Abhi") {

            public void run() {

                // Returns the currently executing thread
                System.out.println("Current Thread : "
                        + Thread.currentThread().getName());

                // Returns priority of current thread
                System.out.println("Current Priority : "
                        + Thread.currentThread().getPriority());

                try {

                    for (int i = 2; i <= 10; i += 2) {

                        System.out.println("Anonymous : " + i);

                        // Current thread sleeps for 1 second
                        Thread.sleep(1000);
                    }

                } catch (InterruptedException e) {

                    System.out.println(e);
                }
            }
        };

        Thread t2 = new Thread("Rahul") {

            public void run() {

                System.out.println("Current Thread : "
                        + Thread.currentThread().getName());

                System.out.println("Current Priority : "
                        + Thread.currentThread().getPriority());

                try {

                    for (int i = 1; i <= 10; i += 2) {

                        System.out.println("Lambda : " + i);

                        Thread.sleep(1000);
                    }

                } catch (InterruptedException e) {

                    System.out.println(e);
                }
            }
        };

        // -------------------------------
        // Main Thread Information
        // -------------------------------

        System.out.println("Main Thread : "
                + Thread.currentThread().getName());

        System.out.println("Main Priority : "
                + Thread.currentThread().getPriority());

        // -------------------------------
        // Thread Names
        // -------------------------------

        System.out.println("Thread1 Name : " + t.getName());
        System.out.println("Thread2 Name : " + t2.getName());

        // -------------------------------
        // Setting Priorities
        // -------------------------------

        t.setPriority(Thread.MAX_PRIORITY);      //10
        t2.setPriority(Thread.MIN_PRIORITY);     //1

        // Thread.NORM_PRIORITY = 5

        // -------------------------------
        // Current Priorities
        // -------------------------------

        System.out.println("Thread1 Priority : "
                + t.getPriority());

        System.out.println("Thread2 Priority : "
                + t2.getPriority());

        // -------------------------------
        // Start Threads
        // -------------------------------

        t.start();
        t2.start();

        // -------------------------------
        // Wait for completion
        // -------------------------------

        try {

            t.join();
            t2.join();

        } catch (InterruptedException e) {

            System.out.println(e);
        }

        System.out.println("Main Thread Ends");
    }
}