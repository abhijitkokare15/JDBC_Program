@FunctionalInterface
interface A {
    void show();
}

class Functional_interface_ implements A {


    public static void main(String[] args) {
        // Functional_interface_ fi = new Functional_interface_();
        // fi.show();

        A a = new Functional_interface_();
        a.show();
    }

    public void show() {
        System.out.println("Show");
    }
}