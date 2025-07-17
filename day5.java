import java.util.Arrays;
import java.util.Stack;

public class day5 {

    public static void main(String[] args) {
        // int[] nums = { 5, 10, -5 };

        // Stack<Integer> stack = new Stack<>();
        // int ans[] = new int[stack.size()];

        // for (int i = 0; i < nums.length; i++) {

        // boolean alive = true;
        // while (!stack.isEmpty() && nums[i] < 0 && stack.peek() > 0) {
        // int top = stack.peek();

        // if (top < -nums[i]) {
        // stack.pop();
        // } else if (top == -nums[i]) {
        // stack.pop();
        // alive = false;
        // break;
        // } else {

        // alive = false;
        // break;

        // }

        // }

        // if (alive) {
        // stack.push(nums[i]);
        // }

        // }

        // for (int i = 0; i < stack.size(); i++) {
        // ans[i] = stack.get(i);
        // }

        // System.out.println(Arrays.toString(ans));

        String nums = "10200";
        Stack<Integer> stack = new Stack<>();
        int k = 1;
        int count = 0;

        for (int i = 0; i < nums.length(); i++) {

            while (!stack.isEmpty() && k > 0 && stack.peek() > nums.charAt(i) - '0') {
                stack.pop();

                k--;
            }
            stack.push((int) nums.charAt(i) - '0');
        }

        if (k > 0) {
            stack.pop();
            k--;
        }

        System.out.println("Stack content: " + stack);
        StringBuilder ans = new StringBuilder();

        for (int i = 0; i < stack.size(); i++) {
            ans.append(stack.get(i));
        }

        while (ans.length() > 1 && ans.charAt(0) == '0') {
            ans.deleteCharAt(0);
        }

        System.out.println(ans);

    }
}
