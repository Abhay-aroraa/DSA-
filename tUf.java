import java.util.ArrayList;
import java.util.List;

public class tUf {
  public List<String> findPath(int[][] m, int n){
     if(m[0][0] == 0){
      return 
    }
  }

  public static void main(String[] args) {
    int[][] maze = { { 1, 0, 0, 0 }, { 1, 1, 0, 1 }, { 1, 1, 0, 0 }, { 0, 1, 1, 1 } };
    int n = 4;

   List<String> result = new ArrayList<>();
     char[][] board = new char[n][n];



  }
}

// class Node {
// int data;
// Node next;
// Node back;
// Node child;

// // Constructor with all parameters
// Node(int data, Node next, Node back, Node child) {
// this.data = data;
// this.next = next;
// this.back = back;
// this.child = child;
// }

// // Constructor with only data (rest null)
// Node(int data) {
// this.data = data;
// this.next = null;
// this.back = null;
// this.child = null;
// }
// }

// public class tUf {
// public static Node Convert(int[] arr) {
// if (arr.length == 0) return null;

// Node head = new Node(arr[0]);
// Node curr = head;

// for (int i = 1; i < arr.length; i++) {
// curr.next = new Node(arr[i]);
// curr = curr.next;
// }

// return head;

// }

// public static Node Reversed(Node head){
// Node temp = head;
// Node prev = null;

// while(temp != null){
// Node front = temp.next;
// temp.next = prev;
// prev = temp;
// temp = front;

// }

// return prev;
// }
// public static void printList(Node head) {
// Node temp = head;
// while (temp != null) {
// System.out.print(temp.data + " ");
// temp = temp.next;
// }
// System.out.println(); // newline
// }
// public static void main(String[] args) {
// int[] arr = { 2, 3, 4, 6 };
// Node head = Convert(arr);
// Node reverse = Reversed(head);
// printList(reverse);

// }
// }

// Single ll

// double ll;

// public static Node Convertdbll(int[] arr) {

// Node head = new Node(arr[0]);
// Node prev = head;

// for (int i = 1; i < arr.length; i++) {

// Node temp = new Node(arr[i], null, prev);
// prev.next = temp;
// prev = temp;

// }
// return head;

// }

// public static int getLength(Node head) {
// int count = 0;
// Node temp = head;

// while (temp != null) {
// count++;
// temp = temp.next;
// }

// return count;
// }

// public static Node convert(int[] arr) {
// Node head = new Node(arr[0]);
// Node mover = head;

// for (int i = 1; i < arr.length; i++) {
// Node temp = new Node(arr[i]);
// mover.next = temp;
// mover = temp;
// }
// return head;
// }

// public static int Print(Node head) {
// Node temp = head;

// while (temp != null) {
// System.out.print(temp.data + " ");
// temp = temp.next;
// }
// return 0;
// }

// public static Node findTail(Node head) {

// while (head.next != null) {
// head = head.next;
// }
// return head;
// }

// public static void findSum(Node head, int k) {
// Node start = head;
// Node end = findTail(head);

// while (start != null && end != null && start != end && end.next != start) {
// int sum = start.data + end.data;

// if (sum == k) {
// System.out.println(start.data + " " + end.data);
// start = start.next;
// end = end.back;
// } else if (sum > k) {
// end = end.back;
// } else {
// start = start.next;
// }

// }

// }

// public static Node removedup(Node head) {
// Node prev = head;
// Node current = head.next;

// while (current != null) {
// if (current.data == prev.data) {
// prev.next = current.next;

// } else {
// prev = current;

// }
// current = current.next;

// }

// return head;
// // }

// public static Node reverse(Node slow) {
// Node prev = null;

// while (slow != null) {
// Node newhead = slow.next;
// slow.next = prev;
// prev = slow;
// slow = newhead;

// }

// public static Node reversek(Node head, int k) {
// Node current = head;
// int count = 0;

// while (count < k) {
// if (current == null) return head;
// current = current.next;
// count++;
// }

// // Reverse next k-group recursively
// Node prev = reversek(current, k);

// // Reverse current k nodes
// Node temp = head;
// count = 0;
// while (count < k) {
// Node next = temp.next;
// temp.next = prev; // 🔁 reverse
// prev = temp;
// temp = next;
// count++;
// }

// return prev;
// }

// int buy = prices[0];
// int profit = 0;
// int count=0;

// for(int i = 1; i < prices.length; i++){
// if(buy > prices[i]){
// buy = prices[i];
// count = i;
// }
// }
// if(count == prices.length) System.out.println(0);
// for(int i = count + 1; i < prices.length; i++){
// int max =prices[i] - buy;
// if(profit < max){
// profit = max;
// }
// }
// System.out.println(profit);
// public static Node rotatek(Node head, int k) {
// Node temp = head;
// int len = getLength(head);
// k = k % len;
// int count = 0;

// if (k == 0)
// return head;

// while (count < len - k) {
// temp = temp.next;
// count++;
// }

// Node newHead = temp.next;
// temp.next = null;

// Node tail = newHead;
// while (tail.next != null) {
// tail = tail.next;
// }
// return newHead;

// }
// public static Node mergell(Node l1, Node l2) {
// Node dummy = new Node(0);
// Node temp = dummy;

// while (l1 != null && l2 != null) {
// if (l1.data < l2.data) {
// temp.child = l1;
// l1 = l1.child;
// } else {
// temp.child = l2;
// l2 = l2.child;
// }
// temp = temp.child;

// }
// temp.child = (l1 != null) ? l1 : l2;

// }

// public static Node delete(Node head, int k) {
// while (head != null && head.data == k) {
// head = head.next;
// }

// Node temp = head;

// while (temp != null && temp.next != null) {
// if (temp.next.data == k) {
// temp.next = temp.next.next;
// } else {
// temp = temp.next;
// }
// }

// return head;
// }

// public static Node reverse(Node slow) {
// Node prev = null;

// while (slow != null) {
// Node newhead = slow.next;
// slow.next = prev;
// prev = slow;
// slow = newhead;

// }

// return prev;

// }

// public static boolean mid(Node head) {
// if (head == null || head.next == null)
// return true;

// Node slow = head;
// Node fast = head;
// while (fast != null && fast.next != null) {
// slow = slow.next;
// fast = fast.next.next;
// }

// Node secondhalf = reverse(slow);
// Node fisrthalf = head;

// while (secondhalf != null) {
// if (secondhalf.data != fisrthalf.data) {
// return false;
// }
// secondhalf = secondhalf.next;
// fisrthalf = fisrthalf.next;
// }

// return true;
// }

// public static Node findMiddle(Node head, int mid) {
// Node temp = head;
// int count = 0;

// while (temp != null) {
// count++;
// if (count == mid) {
// return temp;

// }
// temp = temp.next;
// }

// return null;
// }

// public static Node reversell(Node head) {
// Node temp = head;
// Stack<Integer> stack = new Stack<>();

// while (temp != null) {
// public static Node reversell(Node head) {
// Node current = head;
// Node previous = null;
// while (current != null) {
// Node temp = current.next;
// current.next = previous;

// previous = current;
// current = temp;

// stack.push(temp.data);
// temp = temp.next;
// }
// temp = head;
// while (temp != null && !stack.isEmpty()) {
// temp.data = stack.pop();
// temp = temp.next;
// }
// return head;
// }

// public static Boolean sortll(Node head) {
// HashMap<Node, Integer> map = new HashMap<>();

// Node temp = head;

// while (temp != null) {
// if (map.containsKey(temp)) {
// return true;
// }

// map.put(temp, 1);
// temp = temp.next;
// }

// return false;

// }
// }

// return previous;

// }

// public static Node addonemore(Node head) {
// Node temp = head;

// int carry = 1;
// Node addOne = addonemore(reverse);

// while (temp != null) {
// temp.data = temp.data + carry;

// if(temp.data < 10){
// carry = 0;
// break;
// }else{
// temp.data = 0;
// carry = 1;
// }
// temp = temp.next;

// }
// if(carry == 1){
// Node newHead = new Node(carry);

// head = reversell(head);
// newHead.next = head;
// return newHead;

// }

// head= reversell(head);
// return head;

// }

// public static Node deleteNode(Node head, int len) {
// Node temp = head;
// int count = 0;
// Node previous = null;

// if (head == null) {
// return null;
// }
// if (head.next == null) {
// return head;
// }

// while (temp != null) {
// count++;

// if (count == len) {
// if (previous == null) {
// head = temp.next;
// } else {
// previous.next = temp.next;
// }
// }

// previous = temp;
// temp = temp.next;

// }

// return head;
// }

// Fast and slow pionter
// public static Node deleteNode(Node head) {
// if (head == null || head.next == null) {
// return null;
// }

// Node slow = head;
// Node fast = head;
// Node prev = null;

// while (fast != null && fast.next.next != null) {
// fast = head.next.next;
// prev = slow;
// slow = slow.next;
// }
// prev.next = slow.next;

// return head;
// }

// //42.28
// MB
// Beats
// 8.03%
// public static Node removeNthFromEnd(Node head, int n, int len) {
// if (head == null) {
// return null;
// }

// Special case: remove head
// if (n == len) {
// return head.next;
// }
// int count = 1;
// Node temp = head;

// while (temp != null) {
// if (count == len - n) {
// if (temp.next != null) {
// temp.next = temp.next.next;
// }
// }
// count++;
// temp = temp.next;
// }

// return head;
// }

// two pionter

// public static Node removeNthFromEnd(Node head, int n) {
// Node fast = head;
// for (int i = 0; i < n; i++) {
// fast = fast.next;
// }
// if(fast == null) return head.next;
// Node slow = head;

// while (fast != null && fast.next != null) {
// slow = slow.next;
// fast = fast.next;

// }

// slow.next = slow.next.next;

// return head;
// }

// Node reverse = reversell(head);
// int len = getLength(head) / 2 + 1;
// middle = \\

// Node nn = findMiddle(head, len);

// public static Node insertbeforetail(Node head, int val) {

// if (head == null)
// return null;

// if (head.next == null) {
// Node newnode = new Node(val);
// head.back = newnode;
// newnode.next = head;
// }

// Node temp = head;
// while (temp.next.next != null) {
// temp = temp.next; // move to second last node
// }

// Node newNode = new Node(val);
// newNode.next = temp.next;
// newNode.back = temp;
// temp.next.back = newNode;
// temp.next = newNode;

// return head;

// }
/// swapping

// public static Node reverseDbll(Node head) {
// if (head == null) return null;

// Node temp = null;
// Node current = head;

// while (current != null) {
// temp = current.back;
// current.back = current.next;
// current.next = temp;
// current = current.back; // move to the "next" node which is stored in back
// now
// }

// // After the loop, temp points to the previous node of null (i.e., new head)
// if (temp != null) {
// head = temp.back;
// }

// return head;
// }

///////////////////////////////////////////////////////////////////// with stack
// public static Node reverseDbll(Node head) {

// Node temp = head;
// Stack<Integer> stack = new Stack<>();

// while (temp != null) {
// stack.push(temp.data);
// temp = temp.next;
// }
// temp = head;

// while (temp != null && !stack.isEmpty()) {
// temp.data = stack.pop(); // Get data from stack and put into node
// temp = temp.next;
// }

// return head;
// }

// public static Node insertbeforehead(Node head, int val) {

// Node newnode = new Node(val);
// head.back = newnode;
// newnode.next= head;

// return newnode;
// }

// public static Node reverseDbll(Node head){

// return head;
// }

// public static Node deletNode double linklist(Node head) {
// if (head == null && head.next == null)
// return null;
// if (head.next == null) {
// return null;
// }

// Node prev = head;
// head = head.next;

// head.back = null;
// prev.next = null;
// return head;
// }

// class Solution {
// public ListNode deleteHead(ListNode head) {
// if(head == null && head.next == null){
// return null;
// }

// ListNode prev = head;
// head = head.next;
// head.prev = null;
// prev.next = null;
// return head;

// }
// }

// int val = 88;
// int k = 1;
// head = reverseDbll(head);
// head = insertbeforehead(head, 8);
// head = deletNode(head);
// head = insertKth(head, val, k);
// public static Node removeHead(Node head) {
// if (head == null) return head;
// return head.next;
// }

// public static Node removeTail(Node head) {

// Node temp = head;
// Traverse till second-last node
// while (temp.next.next != null) {
// temp = temp.next;
// }
// temp.next = null;
// return temp;

// }
// public static Node deletNode(Node head, int val) {

// // if (head == null)
// // return null;
// // if (k == 1) {
// // return head.next;
// // }

// Node prev = null;

// Node temp = head;
// while (temp != null) {

// if (temp.data == val) {
// prev.next = prev.next.next;
// break;
// }

// prev = temp;
// temp = temp.next;

// }

// return head;

// }

// public static Node insertNode(Node head, int val){
// Node temp = new Node(val,head);
// return temp;

// }
// public static Node insertTail(Node head, int val) {
// if (head == null)
// {
// return new Node(val);
// }

// Node temp = head;
// while (temp.next != null) {
// temp = temp.next;
// }
// Node NewNode = new Node(val);
// temp.next = NewNode;
// return head;

// }

// public static Node insertKth(Node head, int val, int k) {
// if (head == null)
// return new Node(val);
// int count = 0;

// if (k == 1) {
// Node temp = new Node(val, head);
// return temp;

// }

// Node temp = head;

// while (temp != null) {
// count++;
// if (count == k - 1) {
// Node newnode = new Node(val);
// newnode.next = temp.next;
// temp.next = newnode;

// }
// temp = temp.next;
// }

// return head;
// }

// head = removeHead(head);
// head = removeTail(head);
// head = deletNode(head, val);

// String s = "babad";

// Character low = s.charAt(0);
// Character high = s.charAt(s.length() - 1);
// System.out.println(high);
// int i =0;

// while(i <= s.length() ){
// if(low == high){

// }
// }
// }

// String s = "aabcb";
// int totalBeauty = 0;
// for (int i = 0; i < s.length(); i++) {
// int[] freq = new int[26];
// for (int j =i; j < s.length(); j++) {
// freq[s.charAt(j) - 'a']++;

// int max = 0;
// int min = Integer.MAX_VALUE;

// for (int k = 0; k < 26; k++) {
// if (freq[k] > 0) {
// max = Math.max(max, freq[k]);
// min = Math.min(min, freq[k]);

// }
// }

// totalBeauty += (max - min);

// }
// }

// System.out.println(totalBeauty);

// String s = "the sky is blue\"";
// String[] words = s.trim().split("\\s+");

// StringBuilder reversed = new StringBuilder();

// for (int i = words.length - 1; i >= 0; i--) {
// reversed.append(words[i]);
// if (i != 0)
// reversed.append(" ");
// }

// int i = 0;
// int n = s.length();
// StringBuilder ans = new StringBuilder();

// while (i < n && s.charAt(i) == ' ') {
// i++;
// }

// // 2. Check for optional sign
// if (i < n && (s.charAt(i) == '-' || s.charAt(i) == '+')) {
// ans.append(s.charAt(i));
// i++;
// }

// // 3. Collect digits only
// while (i < n && Character.isDigit(s.charAt(i))) {
// ans.append(s.charAt(i));
// i++;
// }

// // 4. Handle no digits
// if (ans.length() == 0 || (ans.length() == 1 && (ans.charAt(0) == '-' ||
// ans.charAt(0) == '+'))) {
// System.out.println("Result: 0");
// } else {
// System.out.println("Result: " + ans.toString());
// }

// String s = "MCMXCIV";
// System.out.println("Roman numeral: " + intToRoman(s));

// }

// public static int intToRoman(String s) {
// int result = 0;

// Map<Character, Integer> romanMap = new HashMap<>();
// romanMap.put('I', 1);
// romanMap.put('V', 5);
// romanMap.put('X', 10);
// romanMap.put('L', 50);
// romanMap.put('C', 100);
// romanMap.put('D', 500);
// romanMap.put('M', 1000);

// for (int i = 0; i < s.length(); i++) {
// int cur = romanMap.get(s.charAt(i));
// int next = (i + 1 < s.length()) ? romanMap.get(s.charAt(i + 1)) : 0;

// if (cur < next) {
// result -= cur;
// } else {
// result += cur;
// }

// }

// return result;

// public static void main(String[] args) {
// String[] kk = { "dog", "racecar", "car" };
// String ans = " ";

// for (int i = 0; i < kk.length; i++) {
// char ch = kk[0].charAt(i);
// for (int j = 1; j < kk.length; j++) {
// if (i >= kk[j].length() || kk[j].charAt(i) != ch) {
// System.out.println(ans);
// return;
// }

// }
// ans += ch;

// }

// }

// abhi m buke h te k phul h te lga tar hone chadie h ;

// private static void merge(int[] arr, int low, int mid, int high) {
// ArrayList<Integer> temp = new ArrayList<>(); // temporary array
// int left = low; // starting index of left half of arr
// int right = mid + 1; // starting index of right half of arr

// //storing elements in the temporary array in a sorted manner//

// while (left <= mid && right <= high) {
// if (arr[left] <= arr[right]) {
// temp.add(arr[left]);
// left++;
// } else {
// temp.add(arr[right]);
// right++;
// }
// }
// while (left <= mid) {
// temp.add(arr[left]);
// left++;
// }

// while (right <= high) {
// temp.add(arr[right]);
// right++;
// }

// // transfering all elements from temporary to arr //
// for (int i = low; i <= high; i++) {
// arr[i] = temp.get(i - low);
// }
// }

// public static int countPairs(int[] arr, int low, int mid, int high) {
// int right = mid + 1;
// int cnt = 0;
// for (int i = low; i <= mid; i++) {
// while (right <= high && arr[i] > 2 * arr[right]) right++;
// cnt += (right - (mid + 1));
// }
// return cnt;
// }

// public static int mergeSort(int[] arr, int low, int high) {
// int cnt = 0;
// if (low >= high) return cnt;
// int mid = (low + high) / 2 ;
// cnt += mergeSort(arr, low, mid); // left half
// cnt += mergeSort(arr, mid + 1, high); // right half
// cnt += countPairs(arr, low, mid, high); //Modification
// merge(arr, low, mid, high); // merging sorted halves
// return cnt;
// }

// public static int team(int[] skill, int n) {
// return mergeSort(skill, 0, n - 1);
// }

// public static void main(String[] args) {
// int[] a = {4, 1, 2, 3, 1};
// int n = 5;
// int cnt = team(a, n);
// System.out.println("The number of reverse pair is: " + cnt);
// }

// // Recursive Fibonacci function
// public static int fab(int n) {
// if (n <= 1)
// return n;
// int last = fab(n - 1);
// int lastsec = fab(n - 2);
// return last + lastsec;
// }

// public static void main(String[] args) {
// int n = 5;
// int result = fab(n); // Call the function and store the result
// System.out.println("Fibonacci of " + n + " is: " + result); // Print result
// }
// }

// public class HelloWorld {

// public static void main(String[] args) {
// MyThread t1 = new MyThread(); // Create an instance of MyThread
// t1.start(); // Start the thread
// }
// }

// // Custom thread class extending Thread
// class MyThread extends Thread {
// @Override
// public void run() {
// for(int i = 0 ; i <= 5; i++){
// try {
// Thread.sleep(1000);
// } catch (InterruptedException e) {
// throw new RuntimeException (e);

// }
// System.out.println(i);
// }
// }
// }f

// public class HelloWorld {
// import java.util.Arrays;

// public class HelloWorld {

// public static void main(String[] args) {
// int[] a = {5, 6, 7, 8, 9 };
// int n = a.length;
// int k = 5;
// int cnt = 0;

// // Step 1: Generating subarrays:
// for (int i = 0; i < n; i++) {
// int xorr = 0;
// for (int j = i; j < n; j++) {

// //step 2:calculate XOR of all
// // elements:
// xorr = xorr ^ a[j];

// // step 3:check XOR and count:
// if (xorr == k) cnt++;
// }
// }
// System.out.println(cnt);
// }
// }

// public class HashingExample {
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);

// int n = sc.nextInt();
// int[] arr = new int[n];

// for (int i = 0; i < n; i++) {
// arr[i] = sc.nextInt(); // Read each number
// }

// int[] hash = new int[13]; // Hash table for 0 to 12

// // Precompute frequencies
// for (int i = 0; i < n; i++) {
// hash[arr[i]]++;
// }

// int q = sc.nextInt(); // Number of queries
// while (q-- > 0) {
// int number = sc.nextInt();
// System.out.println(hash[number]);
// }

// sc.close();
// }
// }

// public HelloWorld() {
// }

// public static void main(String[] args) {
// int numbers =36;
// for(int i = 1; i <= numbers; i++){
// if(numbers % i == 0){
// System.out.println(i);
// }
// else{
// }

// }

// }
// }

// class Solution {
// public int[] twoSum(int[] nums, int target) {
// for(int i = 0; i <= nums.length; i++){
// for(int j =1; j <= nums.length; j++){
// if(nums[i] + nums[j] == target){
// System.out.println(nums[i] + nums[j]);
// }
// }
// }
// return new int[] {};
// }
// }

// Scanner sc = new Scanner(System.in);
// int n = sc.nextInt();
// int m = sc.nextInt();

// int matrix[][] = new int[n][m];
// for(int i=0; i<n; i++) {
// for(int j=0; j<m; j++) {
// matrix[i][j] = sc.nextInt();
// }
// }

// System.out.println("The transpose is : ");
// //To print transpose
// for(int j=0; j<m ;j++) {
// for(int i=0; i<n; i++) {
// System.out.print(matrix[i][j]+" ");
// }
// System.out.println();
// }
// }
// }

// int positiveCount = 0, negativeCount = 0, zeroCount = 0;
// char choice;

// do {
// System.out.print("Enter a number: ");
// int num = scanner.nextInt();

// if (num > 0) {
// positiveCount++;
// } else if (num < 0) {
// negativeCount++;
// } else {
// zeroCount++;
// }
// System.out.print("Do you want to enter another number? (y/n): ");
// choice = scanner.next().charAt(0);

// } while (choice == 'y' || choice == 'Y');

// System.out.println("\nCount of positive numbers: " + positiveCount);
// System.out.println("Count of negative numbers: " + negativeCount);
// System.out.println("Count of zeros: " + zeroCount);

// Close the scanner to prevent resource leaks
// scanner.close();
// }
// }

// Scanner sc = new Scanner(System.in);
// int size = sc.nextInt();

// int number[] = new int[size];

// for (int i = 0; i < size; i++) {
// number[i] = sc.nextInt();
// }
// int prvs = 0;

// for (int i = 0; i <=number.length; i++) {
// if (number[i] > prvs) {
// prvs = number[i];

// System.out.println("its accending order data");
// } else {
// System.out.println("its decending order data");
// }
// ;

// }

// import java.util.Scanner;

// public class twoarray {
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);

// int row = sc.nextInt();
// int cols = sc.nextInt();
// int x = sc.nextInt();

// int[][] number = new int[row][cols];

// for (int i = 0; i < row; i++) {
// for (int j = 0; j < cols; j++) {
// number[i][j] = sc.nextInt();
// }
// }

// for (int i = 0; i <row; i++) {
// for (int j = 0; j <cols; j++) {
// if(number[i][j] == x) {
// System.out.println( i +" " + j);
// }

// }
// System.out.println();
// }

// sc.close();
// }
// }