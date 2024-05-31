package Binary;
/**
 * Given two integers a and b, return the sum of the two integers without using the operators + and -.
 * Example 1:
 * Input: a = 1, b = 2
 * Output: 3
 * Example 2:
 * Input: a = 2, b = 3
 * Output: 5
 */
public class SumOfTwoIntegers {
    public static int getSum(int a, int b) {
        while (b != 0) {
            int carry = (a & b); // we will perform AND operation to find the carry
            int result = (a ^ b); // we perform XOR operation to find the actual addition of binary numbers
            a = result;   // a will hold the result in each loop
            b = carry << 1; // we keep the carry left shifted by one in b
        }
        return a; // as a holds the result
    }

    public static void main(String[] args) {
        int a = 9;
        int b = 7;
        int result = getSum(a, b);
        System.out.println(result);
    }
}

/**
 * As we know in the half adder logic, we can add two bits by performing logical XOR(^) operation, the bit sum.
 * We can obtain the carry bit by performing AND(&) operation of two bits.
 *
 * We can apply the same logic to find the sum of two integers.
 *
 * The steps for algorithm are as follows:
 *  1) Find the carry by performing the AND(&) operation on two integers
 *  2) Find the sum by performing the XOR(^) operation on both the integer
 *  3) The carry is left shifted by 1 so that adding it to a gives the required sum. The left shifted carry is assigned to b.
 *  4) Return a as a holds the resulted sum
 */
