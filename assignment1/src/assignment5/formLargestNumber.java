package assignment5;

import java.util.*;

public class formLargestNumber {

	
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        int t = scanner.nextInt();

	        while (t > 0) {
	            int n = scanner.nextInt();
	            int[] arr = new int[n];
	            for (int i = 0; i < n; i++) {
	                arr[i] = scanner.nextInt();
	            }

	            // Convert the integers to strings for custom sorting
	            String[] arrStr = new String[n];
	            for (int i = 0; i < n; i++) {
	                arrStr[i] = Integer.toString(arr[i]);
	            }

	            // Custom comparator for sorting
	            Arrays.sort(arrStr, new Comparator<String>() {
	                @Override
	                public int compare(String a, String b) {
	                    String order1 = a + b;
	                    String order2 = b + a;
	                    return order2.compareTo(order1); // Reverse order for descending
	                }
	            });

	            // Concatenate the sorted strings to get the largest value
	            StringBuilder largestValue = new StringBuilder();
	            for (String str : arrStr) {
	                largestValue.append(str);
	            }

	            System.out.println(largestValue.toString());

	            t--;
	        }
	    }
	}
