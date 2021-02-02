import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

class SetExample {

    public static void main(String[] args) {

        Set<Integer> ss = new HashSet<Integer>();

        ss.add(5);
        ss.add(78);
        ss.add(234);
        ss.add(45);
        ss.add(2);
        ss.add(191);
        System.out.println("HashSet : ");
        System.out.println(ss);

        Iterator<Integer> i = ss.iterator();

        while (i.hasNext()) {
            System.out.println(i.next());
        }

        Set<Integer> ts = new TreeSet<Integer>();

        ts.add(5);
        ts.add(78);
        ts.add(234);
        ts.add(45);
        ts.add(2);
        ts.add(191);
        System.out.println("TreeSet : ");

        System.out.println(ts);

        Iterator<Integer> i1 = ts.iterator();

        while (i1.hasNext()) {
            System.out.println(i1.next());
        }

    }
}

// Topics : HashSet, LinkedHashSet(Maintains order of Insertion),
// TreeSet(Sort the data while inserting).
// EnumSet (Create a set from enumeration).
