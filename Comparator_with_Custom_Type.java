import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Comparator_with_Custom_Type {

    public static void main(String[] args) {

        List<Students> ls = new ArrayList<>();
        Random rd = new Random();

        for (int i = 1; i <= 20; i++) { 
            ls.add(new Students(100 + i, rd.nextInt(10, 101)));
        }
System.out.println("Before sorting:");
        ls.forEach(x -> System.out.println(x));
System.out.println("After sorting:");
    Collections.sort(ls,(s1,s2)->{return (s1.marks > s2.marks?-1:s1.marks < s2.marks?1:0);});
      ls.forEach(x -> System.out.println(x));



    }
}

class Students {

    public int roll_no;
     public int marks;

    public Students(int roll_no, int marks) {
        this.roll_no = roll_no;
        this.marks = marks;
    }

    public String toString() {
        return "[Roll Number: " + roll_no + ", Marks: " + marks + "]";
    }
}