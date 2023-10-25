package Assignment3;
import java.util.Scanner;
public class nextPermutation {

	public static void main(String[] args) {
		

		
		        Scanner scanner = new Scanner(System.in);

		        int t = scanner.nextInt(); // Number of test cases

		        while (t-- > 0) {
		            int n = scanner.nextInt(); // Number of digits in the number
		            int[] arr = new int[n];   // Array to store the digits

		            for (int i = 0; i < n; i++) {
		                arr[i] = scanner.nextInt(); // Read the digits
		            }

		            // Find the next permutation in-place
		            if (nextPermutation(arr)) {
		                for (int i : arr) {
		                    System.out.print(i + " ");
		                }
		            } else {
		                // If next permutation is not possible, sort in ascending order
		                java.util.Arrays.sort(arr);
		                for (int i : arr) {
		                    System.out.print(i + " ");
		                }
		            }

		            System.out.println(); // New line for the next test case
		        }

		        scanner.close();
		    }

		    // Function to find the next permutation in-place
		    private static boolean nextPermutation(int[] arr) {
		        int i = arr.length - 2;
		        while (i >= 0 && arr[i] >= arr[i + 1]) {
		            i--;
		        }

		        if (i >= 0) {
		            int j = arr.length - 1;
		            while (j >= 0 && arr[j] <= arr[i]) {
		                j--;
		            }

		            swap(arr, i, j);
		        } else {
		            return false; // No next permutation possible
		        }

		        reverse(arr, i + 1, arr.length - 1);
		        return true;
		    }

		    // Function to swap two elements in an array
		    private static void swap(int[] arr, int i, int j) {
		        int temp = arr[i];
		        arr[i] = arr[j];
		        arr[j] = temp;
		    }

		    // Function to reverse a portion of the array
		    private static void reverse(int[] arr, int start, int end) {
		        while (start < end) {
		            swap(arr, start, end);
		            start++;
		            end--;
		        }
		    }
		


	}


