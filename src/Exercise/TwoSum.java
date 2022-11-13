package Exercise;
/* Given an unsorted integer array, find a pair with the given sum in it.
• Each input can have multiple solutions. The output should match with either one of them.
Input : nums[] = [8, 7, 2, 5, 3, 1], target = 10
Output: (8, 2) or (7, 3)

• The solution can return pair in any order. If no pair with the given sum exists, the solution should return null.
Input : nums[] = [5, 2, 6, 8, 1, 9], target = 12
Output: null */
/*        The Pair<U, V> class have
		1. Two member variables, first and second.
		2. Factory method `Pair.of(U, V)` for creating its immutable instance.
		3. equals() and hashCode() methods overridden.  */

import com.sun.jdi.Value;

import java.security.Key;
import java.util.HashMap;

public class TwoSum extends Pair {
    public static void main(String[] args) {
        int[] nums = { 8, 7, 2, 5, 3, 1 };
        int target = 10;
        findPair(nums, target);
    }

    public static Pair<Integer, Integer> findPair(int[] nums, int target){
        Pair<Integer, Integer> map = new Pair<>();

        // do for each element
        for (int i = 0; i < nums.length; i++)
        {
            if (map.equals(target))
            {
                System.out.println(map.getKey() + map.getValue());
            }else return null;

        }
        return map;
    }
}
