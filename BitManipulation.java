import java.util.ArrayList;
import java.util.List;

public class BitManipulation {

   // public static String numberToBinary(int n) {
   // String s = "";
   // while (n != 1) {
   // if (n % 2 == 1)
   // s += '1';
   // else
   // s += '0';
   // n = n / 2;
   // }
   // s += '1'; // final 1 for n == 1

   // return new StringBuilder(s).reverse().toString();
   // }

   // public static int binaryToNumber(String res) {
   // int n = 0;
   // int len = res.length();
   // int p2 = 1;

   // for (int i = len - 1; i >= 0; i--) {
   // if (res.charAt(i) == '1') {
   // n += p2;
   // }
   // p2 = p2 * 2;

   // }
   // return n;
   // }

   // check if number is odd or even

   // *************************right shift

   // public static boolean checkIthBit(int n, int i) {
   // return ((n >> i) & 1) == 1;
   // }

   /******** OR Operator set in ith bit ***********/

   // public static int checkIthBit(int n, int i) {
   // return n | (n >> i);
   // }

   /******** AND && ~ Operator clear the ith bit ***********/
   // public static int checkIthBit(int n, int i) {
   // return n & ~( 1 >> i );
   // }

   // public static int checkIthBit(int n) {
   // int count = 0;
   // while (n != 1) {
   // if (n % 2 == 1)
   // count++;
   // n = n / 2;
   // }
   // if(n == 1) count++;
   // return count;
   // }

   // public static int setbit(int n, int i) {
   //    return n | (1 << i);
   // }


   //  public static String convertToBinary(int n) {
   //      StringBuilder s = new StringBuilder();

   //      while (n > 0) {
   //          s.append(n & 1);
   //          n >>= 1;
   //      }
   //      return s.reverse().toString();
   //  }

   //  public static boolean checkIthBit(int n, int i) {
   //      return (n & (1 << i)) != 0;
   //  }
          
   //  public static int toggle(int n, int i ){
   //   return (n ^ (1 << i));
   //  }

   // public static int countset(int n){
   //    int count = 0;
   //    while(n > 0){
   //       n = n & (n - 1);
   //    count++;      }
   //    return count;
   // }


   // public static int oddeven(int n){
   // return (n ^ (n >> 2));  
   // }

   public static int prime(int n , List<List<Integer>> result ){

      
      return n;

   }



   public static void main(String[] args) {
     List<List<Integer>> result = new ArrayList<>();



      int n = 10; // binary = 1010

      int i = 1;
      System.out.println(prime(n , result));


     
      // System.out.println(countset(n));

      // System.out.println("Binary of " + n + ": " + convertToBinary(n));
      // // boolean result = checkIthBit(n, i);
      // // System.out.println("Is bit at index " + i + " set? " + result);

      // int result = toggle(n, i);
      // System.out.println(convertToBinary(result));

   }

}
// int []nums = {1,2,3};

// int n = nums.length;
// int total = 1 << n;

// List<List<Integer>> result = new ArrayList<>();

// for (int mask = 0; mask < total; mask++) {
// List<Integer> subset = new ArrayList<>();

// for(int i = 0; i < n; i++){
// if ((mask & (1 << i)) != 0) {
// subset.add(nums[i]);
// }

// result.add(subset);
// }

// return result;
// }
