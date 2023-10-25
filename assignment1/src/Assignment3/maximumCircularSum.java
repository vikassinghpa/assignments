package Assignment3;
import java.util.*;
public class maximumCircularSum {
    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        int t = scanner.nextInt(); // Number of test cases

	        while (t-- > 0) {
	            int n = scanner.nextInt(); // Size of the array
	            int[] nums = new int[n];   // Array to store elements

	            for (int i = 0; i < n; i++) {
	                nums[i] = scanner.nextInt(); // Read the elements
	            }

	            int maxSubarraySum = maxSubarraySum(nums);
	            int maxCircularSum = maxCircularSum(nums);

	            // Print the maximum circular sum
	            System.out.println(Math.max(maxSubarraySum, maxCircularSum));
	        }

	        scanner.close();
	    }

	    // Kadane's algorithm to find maximum subarray sum
	    private static int maxSubarraySum(int[] nums) {
	        int maxSum = nums[0];
	        int currentSum = nums[0];

	        for (int i = 1; i < nums.length; i++) {
	            currentSum = Math.max(nums[i], currentSum + nums[i]);
	            maxSum = Math.max(maxSum, currentSum);
	        }

	        return maxSum;
	    }

	    // Function to find maximum circular sum
	    private static int maxCircularSum(int[] nums) {
	        int maxSubarraySum = maxSubarraySum(nums);
	        int totalSum = 0;

	        for (int i = 0; i < nums.length; i++) {
	            totalSum += nums[i];
	            nums[i] = -nums[i]; // Invert the signs to find minimum subarray sum
	        }

	        int minSubarraySum = maxSubarraySum(nums); // Minimum subarray sum of inverted array
	        int maxCircularSum = totalSum + minSubarraySum;

	        // Handle the case where all elements are negative
	        if (maxCircularSum == 0) {
	            return maxSubarraySum;
	        }

	        return Math.max(maxSubarraySum, maxCircularSum);
	    }
	}

