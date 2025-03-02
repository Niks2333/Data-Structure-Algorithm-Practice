import java.util.PriorityQueue;
import java.util.Scanner;

public class Q16klargest {
    public static int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        for (int num : nums) {
            minHeap.add(num); 
            if (minHeap.size() > k) {
                minHeap.poll(); 
            }
        }
        return minHeap.peek(); 
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        
        int[] arr = new int[n];
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter value of k: ");
        int k = sc.nextInt();

        int result = findKthLargest(arr, k);
        System.out.println("The " + k + "th largest element is: " + result);

        sc.close();
    }
}
