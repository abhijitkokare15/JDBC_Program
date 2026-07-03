// <!-- Concepts : Clone, Shallow Cloning, Deep cloning, 
// Clone : clone() is a method in the Java used for object duplication.
// Shallow Cloning :  Copy all the fields of a new instance of the same class to the new instance
// Deep Cloning : The independent of original instance and making changes in clone should not affect original instance. -->
// // clone() belongs to object
class A implements Cloneable {
    int i;
    int j;

    public static void main(String[] args) throws CloneNotSupportedException {

        A a = new A();
        a.i = 445;
        a.j = 56;

        A b = (A) a.clone();
        b.i=10;
        b.j=45565;
        System.out.println(a.i + " " + a.j);
        System.out.println(b.i + " " + b.j);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}