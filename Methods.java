class Computer {
    public static void main(String[] args) {
        System.out.println("Inside Computer main");

        Computer c = new Computer();
        c.playMusic();
    }

    public void playMusic() {
        System.out.println("Music playing..");
    }
}

public class Methods {
    public static void main(String[] args) {

        // calling main of another class
        Computer.main(args);

        System.out.println("Back to Methods main");
    }
}