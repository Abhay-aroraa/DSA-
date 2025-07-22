import java.util.Stack;

public class day8 {

    public static void main(String[] args) {
        int[][] matrix = {
                { 0, 1},
                
                { 0, 1}
        };

        int top = 0;
        int down = matrix.length - 1;

        while (top < down) {
            if (matrix[top][down] == 1) {
                top = top + 1;
            } else if (matrix[down][top] == 1) {
                down = down - 1;
            } else {
                down--;
                top++;

            }

        }
        if (top == down) {
            for (int i = 0; i < matrix.length; i++) {
                if (matrix[top][i] == 1) {
                    System.out.println(-1);
                }

            }
         
                    System.out.println(top)    
        } 

    }
}
