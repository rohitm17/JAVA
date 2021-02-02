import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SetMethods {

    public static void main(String[] args) {

        Integer a[] = { 1, 4, 6, 8, 9, 5 };
        Integer b[] = { 1, 14, 61, 8, 19, 5 };

        // Array to Set
        Set<Integer> s1 = new HashSet<Integer>();
        s1.addAll(Arrays.asList(a));
        Set<Integer> s2 = new HashSet<Integer>();
        s2.addAll(Arrays.asList(b));

        System.out.println("Set 1 : " + s1);
        System.out.println("Set 2 : " + s2);

        System.out.println("Set 1 UNION Set 2 (s1 U s2): s3: ");
        Set<Integer> s3 = new HashSet<Integer>();
        s3.addAll(s1);
        s3.addAll(s2);
        System.out.println(s3);

        System.out.println("Set 1 INTERSECTION Set 2 : s4 : ");
        Set<Integer> s4 = new HashSet<Integer>();
        s4.addAll(s1);
        s4.retainAll(s2);
        System.out.println(s4);

        System.out.println("Set 1 Difference Set 2 (s1 - s2): s5 : ");
        Set<Integer> s5 = new HashSet<Integer>();
        s5.addAll(s1);
        s5.removeAll(s2);
        System.out.println(s5);

        System.out.println("S3 contains 9? :" + s3.contains(9));
        System.out.println("Size of s4 : " + s4.size());
        System.out.println("S5 is Empty? : " + s5.isEmpty());

        // Set to Array
        System.out.println("Set to array of objects : ");
        Object new_array[] = s3.toArray();

        for (Object o : new_array) {
            System.out.print(o + " ");
        }

    }
}
