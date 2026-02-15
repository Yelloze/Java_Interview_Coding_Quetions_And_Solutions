import java.util.HashSet;
import java.util.HashSet;
public class FindFirstDuplicate {
    public static Integer findFirstDuplicate(int[] array) {
        HashSet<Integer> seen = new HashSet<>();
        for (int num : array) {
            if (seen.contains(num)) {
                return num;
            }
            seen.add(num);
        }
        return null; // Return null if no duplicate is found
    }

    public static void main(String[] args) {
        int[] array = {2, 1, 3, 5, 3, 2};
        Integer firstDuplicate = findFirstDuplicate(array);
        if (firstDuplicate != null) {
            System.out.println("First duplicate: " + firstDuplicate);
        } else {
            System.out.println("No duplicates found.");
        }
    }

    
}