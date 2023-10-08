import java.util.*;

public class _2104225_07a {
    public static void main(String[] args) {
        int N = 500000; // Size of the collection

        // Create ArrayList and LinkedList
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();

        // Measure time for insertion at front, middle, and end for ArrayList
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < N; i++) {
            arrayList.add(0, i);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("ArrayList - Insertion at front: " + (endTime - startTime) + " ms");

        startTime = System.currentTimeMillis();
        for (int i = 0; i < N; i++) {
            arrayList.add(N / 2, i);
        }
        endTime = System.currentTimeMillis();
        System.out.println("ArrayList - Insertion at middle: " + (endTime - startTime) + " ms");

        startTime = System.currentTimeMillis();
        for (int i = 0; i < N; i++) {
            arrayList.add(i);
        }
        endTime = System.currentTimeMillis();
        System.out.println("ArrayList - Insertion at end: " + (endTime - startTime) + " ms");

        // Measure time for deletion at front, middle, and end for ArrayList
        startTime = System.currentTimeMillis();
        for (int i = 0; i < N; i++) {
            arrayList.remove(0);
        }
        endTime = System.currentTimeMillis();
        System.out.println("ArrayList - Deletion at front: " + (endTime - startTime) + " ms");

        startTime = System.currentTimeMillis();
        for (int i = 0; i < N; i++) {
            arrayList.remove(N / 2);
        }
        endTime = System.currentTimeMillis();
        System.out.println("ArrayList - Deletion at middle: " + (endTime - startTime) + " ms");

        startTime = System.currentTimeMillis();
        for (int i = 0; i < N; i++) {
            arrayList.remove(arrayList.size() - 1);
        }
        endTime = System.currentTimeMillis();
        System.out.println("ArrayList - Deletion at end: " + (endTime - startTime) + " ms");

        // Repeat the same measurements for LinkedList
        startTime = System.currentTimeMillis();
        for (int i = 0; i < N; i++) {
            linkedList.add(0, i);
        }
        endTime = System.currentTimeMillis();
        System.out.println("LinkedList - Insertion at front: " + (endTime - startTime) + " ms");

        startTime = System.currentTimeMillis();
        for (int i = 0; i < N; i++) {
            linkedList.add(N / 2, i);
        }
        endTime = System.currentTimeMillis();
        System.out.println("LinkedList - Insertion at middle: " + (endTime - startTime) + " ms");

        startTime = System.currentTimeMillis();
        for (int i = 0; i < N; i++) {
            linkedList.add(i);
        }
        endTime = System.currentTimeMillis();
        System.out.println("LinkedList - Insertion at end: " + (endTime - startTime) + " ms");

        startTime = System.currentTimeMillis();
        for (int i = 0; i < N; i++) {
            linkedList.remove(0);
        }
        endTime = System.currentTimeMillis();
        System.out.println("LinkedList - Deletion at front: " + (endTime - startTime) + " ms");

        startTime = System.currentTimeMillis();
        for (int i = 0; i < N; i++) {
            linkedList.remove(N / 2);
        }
        endTime = System.currentTimeMillis();
        System.out.println("LinkedList - Deletion at middle: " + (endTime - startTime) + " ms");

        startTime = System.currentTimeMillis();
        for (int i = 0; i < N; i++) {
            linkedList.remove(linkedList.size() - 1);
        }
        endTime = System.currentTimeMillis();
        System.out.println("LinkedList - Deletion at end: " + (endTime - startTime) + " ms");
    }
}