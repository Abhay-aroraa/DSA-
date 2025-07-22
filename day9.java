public class day9 {
    public static void main(String[] args) {

        int[] nums = { 1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 0 };
        int k = 2;

        int left = 0;
        int right = 0;
        int n = nums.length;
        int max = 0;
        int count = 0;

        while (right < n) {
            if(nums[right] == 0) count++;

            if(count > k){
                if(nums[left] == 0){
                    count--;
                }
                left++;
            }
            if(count <= k ){
                max = Math.max(max, right - left + 1);
            }
            right++;

        }

        System.out.println(max);

    }

}
