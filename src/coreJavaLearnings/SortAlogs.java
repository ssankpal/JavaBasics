package coreJavaLearnings;

import java.util.Arrays;

public class SortAlogs {
	
	// Selection Sort
	public static void selectionSort(int[] input) {
		
		for(int i=0;i<input.length-1;i++) {
			
			
		//	int min_idx=i;
			for(int j=i+1;j<input.length;j++) {
				
				if(input[i]>input[j]) {
		//			min_idx=j;
					int temp=input[j];
					input[j]=input[i];
					input[i]=temp;
				}
			}
		}
		
	}
	
	// Insertion Sort
	public static void insertSort(int[] input) {
		
	//	System.out.println("Input Array: "+Arrays.toString(input));
		for(int i=1;i<input.length;i++) {
				
			int current = input[i];
			int j=i-1;
		//	System.out.println(j +" "+current+" " +input[j]);
			while(j>=0 && current <input[j]) {
				input[j+1]=input[j];
				j--;
			}
			input[j+1]=current;
		}
	}
	
	// Bubble Sort
	public static void bubbleSort(int[] input) {
		
		for(int i=0;i<input.length-1;i++) {
		//	System.out.println("INterim: " +Arrays.toString(input));
			for(int j=0;j<input.length-i-1;j++) {
				
				if(input[j]>input[j+1]) {
					int temp=input[j+1];
					input[j+1]=input[j];
					input[j]=temp;
					
				}
			//	System.out.println("Interim: " +Arrays.toString(input));
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {22,5,47,19,23,65,89,3,8,6};
		int[] arr1 = {22,5,47,65,89,3,8,6};
		int[] arr2 = {22,5,47,65,89,3,8,6};
		
		selectionSort(arr);
		System.out.println("Using Selection Sort: " +Arrays.toString(arr));
		bubbleSort(arr1);
		System.out.println("Using Bubled Sort: " +Arrays.toString(arr1));
		insertSort(arr2);
		System.out.println("Using Insert Sort: " +Arrays.toString(arr1));

	}

}
