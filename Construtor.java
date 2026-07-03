 public class Constructor {
    int i;
     Constructor(int i)

    { 
        this.i=i;
        System.out.println(this.i);
    }

    void main()
    {
        Constructor c = new Constructor(5);

    }
}

