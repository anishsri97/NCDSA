package Arrays;


import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class ContainsDuplicates {

    /**
     * check the following array containing duplicates or not
     * HashSet Used for checking the duplicacy of number
     * if set contains the duplicate number it will return true else false
     *
     * @param nums
     * @return true/false
     */
    public boolean containsDuplicate(int[] nums) {

        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (!set.add(num)) return true;
        }
        return false;
    }

    /**
     * count character frequency of each string if they match
     *
     * @param s - first string
     * @param t - second string
     * @return -boolean result
     */

    public boolean isAnagram(String s, String t) {
        int count[] = new int[26];

        for (char x : s.toCharArray()) {
            count[x - 'a'] += 1;
            //  System.out.println (" x "+x + " freq "+count[x-'a']);
        }

        for (char x : t.toCharArray()) {
            count[x - 'a'] -= 1;
        }

        for (int num : count) {
            if (num != 0) return false;
        }

        return true;
    }

    /**
     * check for pair sum upto target
     *
     * @param nums
     * @param target
     * @return
     */
    public int[] twoSum(int[] nums, int target) {

        Map<Integer, Integer> map = new HashMap<>();
        int ans[] = new int[2];
        for (int indx = 0; indx < nums.length; indx++) {

            int req = target - nums[indx];
            if (map.containsKey(req)) {
                ans[0] = map.get(req);
                ans[1] = indx;
                return ans;
            }
            map.put(nums[indx], indx);
        }

        return ans;

    }


}
