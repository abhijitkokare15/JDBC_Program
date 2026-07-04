public class ThreafdL4 {

    public static void main(String[] args) {

        Runnable a = new Runnable() {

            public void run() {
                try {
                    for (int i = 2; i <= 10; i += 2) {
                        System.out.println("Anonymous : " + i);
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
                    Thread.sleep(1000);
                }
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        };

        Thread t1 = new Thread(a);
        Thread t2 = new Thread(b);

        t1.start();
        t2.start();
    }
}