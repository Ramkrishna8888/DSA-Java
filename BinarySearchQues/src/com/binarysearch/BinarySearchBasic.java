package com.binarysearch;

public class BinarySearchBasic {
	 public static void main(String args[]) {
		 int[] arr = {1,2,3,4,5,6,7,8};
		 int low = 0;
		 int  high = arr.length-1;
		 int  mid = 0;
		 int  ans = 0;
		 int  target = 6;
		 while(low<=high) {
			 mid = low+(high-low)/2;
			 // never do it (low(high-low))/2 what it does for example arr = 0 1 2 3 4 5 6 7 low is 4 and high is 7 then acd to formula the mid will be 3 which is less than low
			 // but without outer bracket it would be high - low (7-4)= 3 then 3/2 = 1 and then low + 1 = 5
			 if(target == arr[mid]) {
				 ans = mid;
				 break; // comment for testing the github connection with STS again
			 }
			 else if(target < arr[mid]) {
				 high = mid - 1;
			 }
			 else
				 low = mid + 1;
		 }	 
		 System.out.println("The Taregt "+target);
	 }
}
