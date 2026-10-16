import java.util.*;

public class Basics {

    static class Node { int val; Node next; Node bottom; Node random; Node(int v) { val = v; } }
    static class DNode { int val; DNode next, prev; DNode(int v) { val = v; } }
    static class TreeNode { int val; TreeNode left, right; TreeNode(int v) { val = v; } }

    // easy
    // 1. Pattern 1 - Square of stars
    // Description: Print an n x n square of stars.
    // Example input : n=3
    // Example output: ***
    //                 ***
    //                 ***
    public static void pattern1(int n) {
        // code
    }

    // easy
    // 2. Pattern 2 - Right triangle of stars
    // Description: Print right-angled triangle of stars.
    // Example input : n=3
    // Example output: *
    //                 **
    //                 ***
    public static void pattern2(int n) {
        // code
    }

    // easy
    // 3. Pattern 3 - Right triangle of numbers
    // Description: Row i prints 1..i.
    // Example input : n=3
    // Example output: 1
    //                 12
    //                 123
    public static void pattern3(int n) {
        // code
    }

    // easy
    // 4. Pattern 4 - Row number triangle
    // Description: Row i prints number i, i times.
    // Example input : n=3
    // Example output: 1
    //                 22
    //                 333
    public static void pattern4(int n) {
        // code
    }

    // easy
    // 5. Pattern 5 - Inverted star triangle
    // Description: Row i prints n-i+1 stars.
    // Example input : n=3
    // Example output: ***
    //                 **
    //                 *
    public static void pattern5(int n) {
        // code
    }

    // easy
    // 6. Pattern 6 - Inverted number triangle
    // Description: Row i prints 1..n-i+1.
    // Example input : n=3
    // Example output: 123
    //                 12
    //                 1
    public static void pattern6(int n) {
        // code
    }

    // easy
    // 7. Pattern 7 - Star pyramid
    // Description: Centered pyramid of stars.
    // Example input : n=3
    // Example output:   *  
    //                  *** 
    //                 *****
    public static void pattern7(int n) {
        // code
    }

    // easy
    // 8. Pattern 8 - Inverted star pyramid
    // Description: Inverted centered pyramid.
    // Example input : n=3
    // Example output: *****
    //                  *** 
    //                   *  
    public static void pattern8(int n) {
        // code
    }

    // easy
    // 9. Pattern 9 - Diamond
    // Description: Pyramid followed by inverted pyramid.
    // Example input : n=3
    // Example output:   *  
    //                  *** 
    //                 *****
    //                 *****
    //                  *** 
    //                   *  
    public static void pattern9(int n) {
        // code
    }

    // easy
    // 10. Pattern 10 - Half diamond
    // Description: Triangle growing to n then shrinking.
    // Example input : n=3
    // Example output: *
    //                 **
    //                 ***
    //                 **
    //                 *
    public static void pattern10(int n) {
        // code
    }

    // easy
    // 11. Pattern 11 - Binary triangle
    // Description: Alternating 1/0 starting with 1 each row.
    // Example input : n=3
    // Example output: 1
    //                 01
    //                 101
    public static void pattern11(int n) {
        // code
    }

    // easy
    // 12. Pattern 12 - Number crown
    // Description: Numbers left, spaces in middle, numbers right.
    // Example input : n=3
    // Example output: 1    1
    //                 12  21
    //                 123321
    public static void pattern12(int n) {
        // code
    }

    // easy
    // 13. Pattern 13 - Increasing number triangle
    // Description: Continue counting across rows.
    // Example input : n=3
    // Example output: 1
    //                 2 3
    //                 4 5 6
    public static void pattern13(int n) {
        // code
    }

    // easy
    // 14. Pattern 14 - Alphabet triangle
    // Description: Row i prints A..i-th letter.
    // Example input : n=3
    // Example output: A
    //                 AB
    //                 ABC
    public static void pattern14(int n) {
        // code
    }

    // easy
    // 15. Pattern 15 - Inverted alphabet triangle
    // Description: Row i prints n-i+1 letters from A.
    // Example input : n=3
    // Example output: ABC
    //                 AB
    //                 A
    public static void pattern15(int n) {
        // code
    }

    // easy
    // 16. Pattern 16 - Letter per row
    // Description: Row i prints i-th letter i times.
    // Example input : n=3
    // Example output: A
    //                 BB
    //                 CCC
    public static void pattern16(int n) {
        // code
    }

    // easy
    // 17. Pattern 17 - Alphabet pyramid
    // Description: Pyramid with letters going up then down.
    // Example input : n=3
    // Example output:   A  
    //                  ABA 
    //                 ABCBA
    public static void pattern17(int n) {
        // code
    }

    // easy
    // 18. Pattern 18 - Reverse alphabet triangle
    // Description: Row i ends at the n-th letter going back.
    // Example input : n=3
    // Example output: C
    //                 BC
    //                 ABC
    public static void pattern18(int n) {
        // code
    }

    // easy
    // 19. Pattern 19 - Hollow butterfly
    // Description: Stars with a hollow gap forming a butterfly.
    // Example input : n=3
    // Example output: **    **
    //                 **    **
    public static void pattern19(int n) {
        // code
    }

    // easy
    // 20. Pattern 20 - Symmetric butterfly
    // Description: Butterfly of stars.
    // Example input : n=3
    // Example output: *    *
    //                 **  **
    //                 ******
    //                 **  **
    //                 *    *
    public static void pattern20(int n) {
        // code
    }

    // easy
    // 21. Pattern 21 - Hollow square
    // Description: Square with only border stars.
    // Example input : n=4
    // Example output: ****
    //                 *  *
    //                 *  *
    //                 ****
    public static void pattern21(int n) {
        // code
    }

    // easy
    // 22. Pattern 22 - Concentric numbers
    // Description: Concentric squares, outer value n down to 1.
    // Example input : n=3
    // Example output: 33333
    //                 32223
    //                 32123
    //                 32223
    //                 33333
    public static void pattern22(int n) {
        // code
    }

    // easy
    // 23. Count Digits
    // Description: Count the digits of n.
    // Example input : n=7789
    // Example output: 4
    public static int countDigits(int n) {
        // code
        return 0;
    }

    // easy
    // 24. Reverse a Number
    // Description: Reverse the digits.
    // Example input : n=123
    // Example output: 321
    public static int reverseNumber(int n) {
        // code
        return 0;
    }

    // easy
    // 25. Check Palindrome Number
    // Description: True if number reads same backwards.
    // Example input : n=121
    // Example output: true
    public static boolean isPalindrome(int n) {
        // code
        return false;
    }

    // easy
    // 26. GCD / HCF
    // Description: Greatest common divisor.
    // Example input : a=20, b=15
    // Example output: 5
    public static int gcd(int a, int b) {
        // code
        return 0;
    }

    // easy
    // 27. Armstrong Number
    // Description: Sum of digits raised to digit-count equals n.
    // Example input : n=153
    // Example output: true
    public static boolean isArmstrong(int n) {
        // code
        return false;
    }

    // easy
    // 28. Print All Divisors
    // Description: Return all divisors in ascending order.
    // Example input : n=36
    // Example output: [1,2,3,4,6,9,12,18,36]
    public static List<Integer> divisors(int n) {
        // code
        return null;
    }

    // easy
    // 29. Check Prime
    // Description: True if n is prime.
    // Example input : n=11
    // Example output: true
    public static boolean isPrime(int n) {
        // code
        return false;
    }

    // easy
    // 30. Sum of First N Numbers
    // Description: Return 1+2+...+n.
    // Example input : n=5
    // Example output: 15
    public static int sumToN(int n) {
        // code
        return 0;
    }

    // easy
    // 31. Count Primes up to N (Sieve)
    // Description: Number of primes strictly less than n.
    // Example input : n=10
    // Example output: 4
    public static int countPrimes(int n) {
        // code
        return 0;
    }

    // easy
    // 32. LCM of Two Numbers
    // Description: Least common multiple.
    // Example input : a=4, b=6
    // Example output: 12
    public static int lcm(int a, int b) {
        // code
        return 0;
    }

    // easy
    // 33. Print Name N Times
    // Description: Print name n times using recursion.
    // Example input : name=Raj, n=3
    // Example output: Raj
    //                 Raj
    //                 Raj
    public static void printNameNTimes(String name, int n) {
        // code
    }

    // easy
    // 34. Print 1 to N
    // Description: Print 1..n using recursion.
    // Example input : n=3
    // Example output: 1 2 3
    public static void print1ToN(int n) {
        // code
    }

    // easy
    // 35. Print N to 1
    // Description: Print n..1 using recursion.
    // Example input : n=3
    // Example output: 3 2 1
    public static void printNTo1(int n) {
        // code
    }

    // easy
    // 36. Sum of First N Numbers (Recursion)
    // Description: Recursive sum 1..n.
    // Example input : n=3
    // Example output: 6
    public static int sumOfN(int n) {
        // code
        return 0;
    }

    // easy
    // 37. Factorial of N
    // Description: Recursive factorial.
    // Example input : n=5
    // Example output: 120
    public static long factorial(int n) {
        // code
        return 0L;
    }

    // easy
    // 38. Reverse an Array
    // Description: Reverse array in place using recursion.
    // Example input : arr=[5,4,3,2,1]
    // Example output: [1,2,3,4,5]
    public static void reverseArray(int[] arr) {
        // code
    }

    // easy
    // 39. Check Palindrome String
    // Description: Recursive palindrome check.
    // Example input : s="ABCDCBA"
    // Example output: true
    public static boolean isPalindromeString(String s) {
        // code
        return false;
    }

    // easy
    // 40. Fibonacci Number
    // Description: n-th fibonacci number (0-indexed, f0=0, f1=1).
    // Example input : n=4
    // Example output: 3
    public static int fibonacci(int n) {
        // code
        return 0;
    }

    // easy
    // 41. Counting Frequencies of Array Elements
    // Description: Frequency of each element.
    // Example input : arr=[10,5,10,15,10,5]
    // Example output: {10=3, 5=2, 15=1}
    public static Map<Integer,Integer> countFrequencies(int[] arr) {
        // code
        return null;
    }

    // easy
    // 42. Count Characters Frequency (a-z)
    // Description: Return int[26] counts.
    // Example input : s="aab"
    // Example output: [2,1,0,...]
    public static int[] charFrequency(String s) {
        // code
        return null;
    }

    // medium
    // 43. Highest and Lowest Frequency Element
    // Description: Return {highestFreqElement, lowestFreqElement}; ties pick smaller.
    // Example input : arr=[10,5,10,15,10,5]
    // Example output: [10,15]
    public static int[] highLowFrequency(int[] arr) {
        // code
        return null;
    }

    public static void main(String[] args) {
        pattern1(3); pattern2(3); pattern3(3); pattern4(3); pattern5(3);
        pattern6(3); pattern7(3); pattern8(3); pattern9(3); pattern10(3);
        pattern11(3); pattern12(3); pattern13(3); pattern14(3); pattern15(3);
        pattern16(3); pattern17(3); pattern18(3); pattern19(3); pattern20(3);
        pattern21(4); pattern22(3);

        System.out.println(countDigits(7789));
        System.out.println(reverseNumber(123));
        System.out.println(isPalindrome(121));
        System.out.println(gcd(20, 15));
        System.out.println(isArmstrong(153));
        System.out.println(divisors(36));
        System.out.println(isPrime(11));
        System.out.println(sumToN(5));
        System.out.println(countPrimes(10));
        System.out.println(lcm(4, 6));
        printNameNTimes("Raj", 3);
        print1ToN(3);
        printNTo1(3);
        System.out.println(sumOfN(3));
        System.out.println(factorial(5));
        int[] a = {5, 4, 3, 2, 1};
        reverseArray(a);
        System.out.println(Arrays.toString(a));
        System.out.println(isPalindromeString("ABCDCBA"));
        System.out.println(fibonacci(4));
        int[] f = {10, 5, 10, 15, 10, 5};
        System.out.println(countFrequencies(f));
        System.out.println(Arrays.toString(charFrequency("aab")));
        System.out.println(Arrays.toString(highLowFrequency(f)));
    }
}
