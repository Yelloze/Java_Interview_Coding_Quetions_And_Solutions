import java.util.HashMap;

public class MostOccurringDigit {
    // Function to calculate the solution
    public static int solution(int[] readings) {
        // Map to store frequencies of single digits
        HashMap<Integer, Integer> frequencyMap = new HashMap<>();

        // Transform each reading into a single-digit number
        for (int reading : readings) {
            int singleDigit = convertToSingleDigit(reading);
            
            // Increment the frequency of the single digit
            frequencyMap.put(singleDigit, frequencyMap.getOrDefault(singleDigit, 0) + 1);
        }

        // Find the most occurring digit (with tie-breaking for the highest value)
        int mostOccurringDigit = -1;
        int highestFrequency = -1;

        for (int digit : frequencyMap.keySet()) {
            int frequency = frequencyMap.get(digit);
            if (frequency > highestFrequency || (frequency == highestFrequency && digit > mostOccurringDigit)) {
                mostOccurringDigit = digit;
                highestFrequency = frequency;
            }
        }

        return mostOccurringDigit;
    }

    // Helper function to convert a number to a single-digit
    private static int convertToSingleDigit(int num) {
        while (num >= 10) {
            num = sumOfDigits(num);
        }
        return num;
    }

    // Helper function to calculate the sum of digits
    private static int sumOfDigits(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        // Example test cases
        int[] testCase1 = {123, 456, 789, 101}; // Expected: 6
        int[] testCase2 = {3, 12, 23, 32, 0};  // Expected: 5
        int[] testCase3 = {6};                // Expected: 6

        System.out.println("Test case 1 - Expected: 6, Output: " + solution(testCase1));
        System.out.println("Test case 2 - Expected: 5, Output: " + solution(testCase2));
        System.out.println("Test case 3 - Expected: 6, Output: " + solution(testCase3));
    }
}