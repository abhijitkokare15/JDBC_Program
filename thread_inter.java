class Message {

    synchronized void waiting() {

        System.out.println("Child Thread : Waiting...");

        try {
            wait();                // Child thread waits
        } catch (InterruptedException e) {
            System.out.println(e);
        }

        System.out.println("Child Thread : Resumed");
    }

    synchronized void wakeUp() {

        System.out.println("Main Thread : notify() called");

        notify();                  // Wake one waiting thread
    }
}

 class WaitNotifyDemo {

    public static void main(String[] args) throws Exception {

        Message obj = new Message();

        Thread t1 = new Thread(() -> {
            obj.waiting();
        });

        t1.start();

        Thread.sleep(3000);        // Wait for 3 seconds

        obj.wakeUp();

        t1.join();

        System.out.println("Program Finished");
    }
}