public class Factorial { 
    // Approach 1: Iterative - O(n) time, O(1) space    
    public static int factorialIterative(int n) { 
        if (n < 0) throw new IllegalArgumentException("Negative numbers do not have factorials.");
        int result = 1;       
        for (int i = 2; i <= n; i++) {           
            result *= i;       
        }       
        return result;   
    } 

    // Approach 2: Recursive - O(n) time, O(n) space   
    public static int factorialRecursive(int n) {
        if (n < 0) throw new IllegalArgumentException("Negative numbers do not have factorials.");
        if (n == 0) return 1;       
        return n * factorialRecursive(n - 1);
    }

    // Approach 3: Memoization - O(n) time, O(n) space    
    public static int factorialMemo(int n, int[] memo) {        
        if (n < 0) throw new IllegalArgumentException("Negative numbers do not have factorials.");
        if (n == 0) return 1;        
        if (memo[n] != -1) return memo[n];        
        memo[n] = n * factorialMemo(n - 1, memo);        
        return memo[n];
    }

     public static long factorialStream(int n) {

        return java.util.stream.LongStream.rangeClosed(1, n).reduce(1, (a, b) -> a * b);   }  
        
        public static void main(String[] args) {      
            int n = 5;      
            System.out.println("in iteration : Factorial of " + n + " = " + factorialIterative(n)); // 120    }}

        
            System.out.println("in Recursive : Factorial of " + n + " = " + factorialRecursive(n)); // 120        
            int[] memo = new int[n + 1];        
            java.util.Arrays.fill(memo, -1);        
            System.out.println("in Memo : Factorial of" + n + " = " + factorialMemo(n, memo)); // 120        
            System.out.println("in Stream : Factorial of " + n + " = " + factorialStream(n)); // 120
}}
