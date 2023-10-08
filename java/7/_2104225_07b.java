import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.TreeSet;
import java.io.File;

public class _2104225_07b {
    public static void main(String args[]) {

        try (Scanner s = new Scanner(System.in);) {
            System.out.println("\nEnter both the file names with extension ");
            String b1 = s.next();
            String b2 = s.next();
            long t1, t2;
            t1 = System.currentTimeMillis();
            arrlist(b1, b2);
            t2 = System.currentTimeMillis() - t1;
            System.out.println("Exec. Time with ArrayList : " + t2);
            t1 = System.currentTimeMillis();
            llist(b1, b2);
            t2 = System.currentTimeMillis() - t1;
            System.out.println("Exec. Time with LinkedList : " + t2);
            t1 = System.currentTimeMillis();
            hset(b1, b2);
            t2 = System.currentTimeMillis() - t1;
            System.out.println("Exec. Time with HashSet : " + t2);
            t1 = System.currentTimeMillis();
            tset(b1, b2);
            t2 = System.currentTimeMillis() - t1;
            System.out.println("Exec. Time with TreeSet : " + t2);
        }
    }

    static void arrlist(String b1, String b2) {
        String temp;
        ArrayList<String> words1 = new ArrayList<>();
        ArrayList<String> words2 = new ArrayList<>();

        try (Scanner sc = new Scanner(new File(b1));) {
            while (sc.hasNext()) {
                temp = sc.next().toLowerCase();
                if (!words1.contains(temp)) {
                    words1.add(temp);
                }
            }
        } catch (Exception e) {
        }

        try (Scanner sc = new Scanner(new File(b2));) {
            while (sc.hasNext()) {
                temp = sc.next().toLowerCase();
                if (!words2.contains(temp)) {
                    words2.add(temp);
                }
            }
        } catch (Exception e) {
        }

        int count = 0;
        for (int i = 0; i < words1.size(); i++) {
            temp = words1.get(i);
            if (words2.contains(temp)) {
                count++;
            }
        }
        System.out.println(words1.size() + " words in 1st file. " + words2.size() + " words in 2nd file. " + count
                + " words in common.");
    }

    static void llist(String b1, String b2) {
        String temp;
        LinkedList<String> words1 = new LinkedList<>();
        LinkedList<String> words2 = new LinkedList<>();

        try (Scanner sc = new Scanner(new File(b1));) {
            while (sc.hasNext()) {
                temp = sc.next().toLowerCase();
                if (!words1.contains(temp)) {
                    words1.add(temp);
                }
            }
        } catch (Exception e) {
        }

        try (Scanner sc = new Scanner(new File(b2));) {
            while (sc.hasNext()) {
                temp = sc.next().toLowerCase();
                if (!words2.contains(temp)) {
                    words2.add(temp);
                }
            }
        } catch (Exception e) {
        }

        int count = 0;
        for (int i = 0; i < words1.size(); i++) {
            temp = words1.get(i);
            if (words2.contains(temp)) {
                count++;
            }
        }
        System.out.println(words1.size() + " words in 1st file. " + words2.size() + " words in 2nd file. " + count
                + " words in common.");
    }

    static void hset(String b1, String b2) {
        HashSet<String> words1 = new HashSet<String>();
        HashSet<String> words2 = new HashSet<String>();

        try (Scanner sc = new Scanner(new File(b1));) {
            while (sc.hasNext()) {
                words1.add(sc.next().toLowerCase());
            }
        } catch (Exception e) {
        }

        try (Scanner sc = new Scanner(new File(b2));) {
            while (sc.hasNext()) {
                words2.add(sc.next().toLowerCase());
            }
        } catch (Exception e) {
        }

        int count = 0;
        Iterator<String> itr = words1.iterator();
        while (itr.hasNext()) {
            if (words2.contains(itr.next())) {
                count++;
            }
        }
        System.out.println(words1.size() + " words in 1st file. " + words2.size() + " words in 2nd file. " + count
                + " words in common.");
    }

    static void tset(String b1, String b2) {
        TreeSet<String> words1 = new TreeSet<String>();
        TreeSet<String> words2 = new TreeSet<String>();

        try (Scanner sc = new Scanner(new File(b1));) {
            while (sc.hasNext()) {
                words1.add(sc.next().toLowerCase());
            }
        } catch (Exception e) {
        }

        try (Scanner sc = new Scanner(new File(b2));) {
            while (sc.hasNext()) {
                words2.add(sc.next().toLowerCase());
            }
        } catch (Exception e) {
        }

        int count = 0;
        Iterator<String> itr = words1.iterator();
        while (itr.hasNext()) {
            if (words2.contains(itr.next())) {
                count++;
            }
        }
        System.out.println(words1.size() + " words in 1st file. " + words2.size() + " words in 2nd file. " + count
                + " words in common.");
    }

}
