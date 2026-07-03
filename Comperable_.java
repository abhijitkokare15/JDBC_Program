import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Comperable_ {
    public static void main(String[] args) {
         List<Students> ls = new ArrayList<>();
        Random rd = new Random();
        long start = System.currentTimeMillis();
        for (int i = 1; i <= 20; i++) { 
            ls.add(new Students(100 + i, rd.nextInt(10, 101)));
        }
System.out.println("Before sorting:");
        ls.forEach(x -> System.out.println(x));
System.out.println("After sorting:");
    Collections.sort(ls);
     ls.forEach(x -> System.out.println(x));

     long end = System.currentTimeMillis();
     System.out.println("Time between "+(end-start));
}
}

class Students implements Comparable<Students> {

    public int roll_no;
     public int marks;

    public Students(int roll_no, int marks) {
        this.roll_no = roll_no;
        this.marks = marks;
    }

    public String toString() {
        return "[Roll Number: " + roll_no + ", Marks: " + marks + "]";
    }

    public int compareTo(Students s)
    {
         return (this.marks > s.marks?-1:this.marks < s.marks?1:0);
    }

    

}

