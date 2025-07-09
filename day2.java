import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class day2 {


    class Solution {
    public int subarraySum(int[] nums, int k) {
        int count = 0;
        int prefixSum = 0;

        for(int i = 0; i <= nums.length; i++){
            for(int j = i; j <= nums.length; j++){

                int sum = 0;
                for(int d = i ; d < j; d++){
                    sum = sum +nums[d];
                }
                if(sum == k)count++;
                
            }
        }
    
    return count;
    }
}
    public static void main(String[] args) {
        int[] a = { 1, 2, 2, 1 };
        int[] b = { 2, 2 };


        ArrayList<Integer> result = new ArrayList<>();
        HashSet<Integer> ans = new HashSet<>();

        for (int num : a) {
            ans.add(num);
        }

        for(int i = 0; i < b.length; i++){
            if(ans.contains(b[i])){
                result.add(b[i]);
                   ans.remove(b[i]);    
            }
        }


        System.out.println(result);

    }
}
