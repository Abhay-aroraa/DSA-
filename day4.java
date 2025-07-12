import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class day4 {

    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                int prevIndex = map.get(nums[i]);
                if (i - prevIndex <= k) {
                    return true;
                }
            }
            map.put(nums[i], i); // update index of current number
        }
        return false;
    }

    int maxi = Integer.MIN_VALUE;
int sum = 0;

    for(
    int i = 0;i<arr.length;i++)
    {
        sum += arr[i];

        if (sum > maxi) {
            maxi = sum;
        }

        if (sum < 0) {
            sum = 0;
        }
    }
       public int lengthOfLongestSubstring(String s) {
          Set<Character> set = new HashSet<>();
          int left = 0;
          int right = 0;
          int max = 0;

          while(right < s.length()){
            if(!set.contains(s.charAt(right))){
                set.add(s.charAt(right));
                max = Math.max(max,right - left + 1);
                right++;
            }else{
                set.remove(s.charAt(left));
                left++;
            }
           

          }
          return max;
        
    }

}
