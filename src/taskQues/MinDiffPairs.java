package taskQues;

import java.util.Arrays;

public class MinDiffPairs {

	 static void printMinDiffPairs(int arr[] )
	  {
	      Arrays.sort(arr);
	     
	    // Compare differences of adjacent
	    // pairs to find the minimum difference.
	    int minDiff = arr[1] - arr[0];
	 //   System.out.println("initial ==> " +minDiff);
	    for (int i = 2; i < arr.length; i++) {
	    	
	      minDiff = Math.min(minDiff, arr[i] - arr[i-1]);
	   
	    }
	    System.out.println("Final minDiff " +minDiff);
	    // Traverse array again and print all pairs having minDiff in them
	
	    for ( int j = 1; j <= arr.length-1; j++)
	     { 
	    	if ((arr[j] - arr[j-1]) == minDiff)
	        {
	         System.out.print("(" + arr[j-1] + ", "+ arr[j] + ")," );
	        }   
	    	
	     }
	  }
	     
	  // Driver code
	  public static void main (String[] args)
	  {
	    int arr[] = {2,6,11,15,18,21,27};
	     printMinDiffPairs(arr);
	  }
	
}
