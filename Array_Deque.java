import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;

public class Array_Deque {
    public static void main(String[] args) {
        ArrayDeque<Integer> arrayDeque = new ArrayDeque<>();
        arrayDeque.add(3);
        arrayDeque.add(7);
        arrayDeque.add(10);
        arrayDeque.add(13);
        int[] arr = new int[]{34,98,76,54};
        ArrayList<Integer> c = new ArrayList(Arrays.asList(arr));
        arrayDeque.addAll(c);
        arrayDeque.addFirst(1); //Throws exception
        arrayDeque.offerFirst(0); //Doesn't throw exception
        arrayDeque.addLast(15);  
        System.out.println(arrayDeque);
        System.out.println("First Element : "+arrayDeque.getFirst());
        System.out.println("Last Element : "+arrayDeque.getLast());
        arrayDeque.pollFirst();
        arrayDeque.pollLast();
        arrayDeque.poll();
        System.out.println(arrayDeque);
    }
}
