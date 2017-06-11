/**
 *
 *  202. Happy Number
 *    Write an algorithm to determine if a number is "happy".
 *    
 *    A happy number is a number defined by the following process: Starting 
 *    with any positive integer, replace the number by the sum of the squares 
 *    of its digits, and repeat the process until the number equals 1 (where 
 *    it will stay), or it loops endlessly in a cycle which does not include 
 *    1. Those numbers for which this process ends in 1 are happy numbers.
 *    
 *    Example: 19 is a happy number
 *    
 *    12 + 92 = 82
 *    82 + 22 = 68
 *    62 + 82 = 100
 *    12 + 02 + 02 = 1
 *
 */
import java.util.*;

public class Solution {
	public boolean isHappy(int n) {
		HashSet<Integer> set = new HashSet<Integer>();
		while (n != 1 && !set.contains(n)) {
			set.add(n);
			int temp = 0;
			while (n > 0) {
				int digit = n % 10;
				n = n / 10;
				temp += digit * digit;
			}
			n = temp;
		}
		return n == 1;
	}
}