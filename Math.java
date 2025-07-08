import java.util.ArrayList;
import java.util.List;

public class Math {

    // public static int[] divisors(int n) {
    //     List<Integer> arr = new ArrayList<>();

    //     for (int i = 1; i * i <= n; i++) {
    //         if (n % i == 0) {
    //             arr.add(i);
    //             if (n / i != i) {
    //                 arr.add(n / i);
    //             }
    //         }
    //     }

    //     // Convert List<Integer> to int[]
    //     int[] result = new int[arr.size()];
    //     for (int i = 0; i < arr.size(); i++) {
    //         result[i] = arr.get(i);
    //     }

    //     return result;
    // }

    public static List<Integer> prime(int n ){
        List<Integer> arr = new ArrayList<>();
           for (int i = 2; i * i <= n; i++) {
            while (n % i == 0) {
                arr.add(i);
                n /= i;
            }
        }
         if (n > 1) {
            arr.add(n);
        }

        return arr;
    }

    public static void main(String[] args) {
        int n = 10;
        List<Integer> divs = prime(n);

       System.out.println(divs);
    }
}


