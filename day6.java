import java.util.Stack;

public class day6 {
      public static int maximalRectangle(int[] colPrefix) {
        Stack<Integer> stack = new Stack<>();
        int n = colPrefix.length;
        int maxi = 0;

        for(int i = 0; i <= colPrefix.length; i++){
        int currentheight = (i == n) ? 0 : colPrefix[i];
        while(!stack.isEmpty() && currentheight < colPrefix[stack.peek()]){
        int height = colPrefix[stack.pop()];
        int width = stack.isEmpty() ? i : i - stack.peek() - 1;;
        int areas = height * width;
        maxi = Math.max(maxi, areas);

        }
        stack.push(i);
        }
        return maxi;

    }
    
       
        public static void main(String[] args) {

        int[][] nums = {
                { 1, 0, }
,                { 1, 0,}
               ,
        };

        int row = nums.length;
        int col = nums[0].length;
        int max = 0;
        int[][] colPrefix = new int[row][col];
        for (int j = 0; j < col; j++) {
            colPrefix[0][j] = nums[0][j];

            for (int i = 1; i < row; i++) {
                colPrefix[i][j] = colPrefix[i - 1][j] + nums[i][j];
            }

        }

        for (int i = 0; i <= colPrefix.length - 1; i++) {
          max = Math.max(max,(maximalRectangle(colPrefix[i])));
        }

        System.out.println(max);

    }
}
