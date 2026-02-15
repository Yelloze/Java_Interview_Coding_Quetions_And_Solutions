public class FindAllDuplicates {

    public static java.util.List<Integer> findAllDuplicates(int[] array) {
        java.util.HashSet<Integer> seen = new java.util.HashSet<>();
        java.util.HashSet<Integer> duplicates = new java.util.HashSet<>();
        for (int num : array) {
            if (seen.contains(num)) {
                duplicates.add(num);
            } else {
                seen.add(num);
            }
        }
        return new java.util.ArrayList<>(duplicates);
    }

    public static void main(String[] args) {
        int[] array = {2, 1, 3, 5, 3, 2};
        java.util.List<Integer> allDuplicates = findAllDuplicates(array);
        if (!allDuplicates.isEmpty()) {
            System.out.println("All duplicates: " + allDuplicates);
        } else {
            System.out.println("No duplicates found.");
        }
    }
}
    
