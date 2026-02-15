public class Fibonacci {
   // Approach 1: Iterative - O(n) time, O(1) space     
   public static int fibIterative(int n) {  

         if (n <= 1) return n;      
         int a = 0, b = 1;       
         for (int i = 2; i <= n; i++) {            
              int temp = a + b;            
              a = b;           
              b = temp;       
         }       
         return b;   
    } 
     // Approach 2: Recursive - O(2^n) time    
      public static int fibRecursive(int n) {
            if (n <= 1) return n;       
            return fibRecursive(n - 1) + fibRecursive(n - 2);
    }
     // Approach 3: Memoization - O(n) time, O(n) space     
     public static int fibMemo(int n, int[] memo) {         
         if (n <= 1) return n;        
         if (memo[n] != -1) return memo[n];        
         memo[n] = fibMemo(n - 1, memo) + fibMemo(n - 2, memo);        
         return memo[n];
     }
public static void main(String[] args) {         
    int n = 10; // Example input         
    System.out.println("Fibonacci Iterative of " + n + ": " + fibIterative(n));        
    System.out.println("Fibonacci Recursive of " + n + ": " + fibRecursive(n));        
    int[] memo = new int[n + 1];        
    java.util.Arrays.fill(memo, -1);        
    System.out.println("Fibonacci Memoization of " + n + ": " + fibMemo(n, memo));    
 } 
}


