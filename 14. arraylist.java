import java.util.ArrayList;

class Main {
    public static void main(String[] args) {
        
        ArrayList<String> food = new ArrayList<String>();
        food.add("pizza");
        food.add("burger");
        food.add("pasta");
        
        food.set(0, "sushi");
        food.remove(1);
        food.clear();
        
        for(int i=0; i<food.size(); i++) {
            System.out.println(food.get(i));
        }
    } 
}



// 2D arraylist
import java.util.ArrayList;

class Main {
    public static void main(String[] args) {
        
        ArrayList<ArrayList<Integer>> nums = new ArrayList();
        
        ArrayList<Integer> nums1 = new ArrayList();
        nums1.add(1);
        nums1.add(2);
        nums1.add(3);
        
        ArrayList<Integer> nums2 = new ArrayList();
        nums2.add(4);
        nums2.add(5);
        
        ArrayList<Integer> nums3 = new ArrayList();
        nums3.add(7);
        nums3.add(8);
        
        nums.add(nums1);
        nums.add(nums2);
        nums.add(nums3);
        
        System.out.println(nums); // [[1, 2, 3], [4, 5], [7, 8]]
        
        System.out.println(nums.get(0)); // [1, 2, 3]
        
        System.out.println(nums.get(0).get(1)); // 2
        
    } 
}
