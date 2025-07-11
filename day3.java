public class day3 {
 
    class ArrayStack {
    int top = -1;
    int[] st = new int[10]; 
    public ArrayStack() {
        
    }


    public void push(int x) {
        if (top < 9) { 
            top++;
            st[top] = x;
        } 
    }

    public int pop() {
        if (top >= 0) { 
            return st[top--]; 
        } else {
              return -1; 
        }
    }  
    

    public int top() {
        if (top == -1) {
           return -1;
        }
        return st[top];
    }

    public boolean isEmpty() {
        return top == -1;
    }


}



    public int[] productExceptSelf(int[] nums) {
        int[] arr = new int[nums.length];
         arr[0] = 1;
        for (int i = 1; i < nums.length; i++) {
            arr[i] = arr[i - 1] * nums[i - 1];
        }
        int sufix = 1;
        for (int i = nums.length - 2; i >= 0; i--) {
            sufix *= nums[i + 1];
            arr[i] *= sufix;
        }

        return arr;
    }

    //brute force to generate subarray and check the sum ==  k

        public int subarraySum(int[] nums, int k) {
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            int sum = 0;
            for (int j = i; j < nums.length; j++) {
                sum += nums[j];

                if (sum == k) {
                    count++;
                }

            }

        }

        return count;
    }
}



class Solution {
    public static boolean checkEqual(int[] a, int[] b) {
    Arrays.sort(a);
    
    Arrays.sort(b);
    
    
    
    for(int i  = 0; i < a.length; i++){
        if(a[i] != b[i]) return false;
        }
    
          return true;
    }
  
}


    public static boolean checkEqual(int[] a, int[] b) {
        HashMap<Integer, Integer> map = new HashMap<>();

        if (a.length != b.length) return false;

        for (int i = 0; i < a.length; i++) {
            map.put(a[i], map.getOrDefault(a[i], 0) + 1);
        }

        for (int i = 0; i < b.length; i++) {
            if (!map.containsKey(b[i])) return false;
            map.put(b[i], map.get(b[i]) - 1);
            if (map.get(b[i]) < 0) return false;
        }

        return true;
    }

