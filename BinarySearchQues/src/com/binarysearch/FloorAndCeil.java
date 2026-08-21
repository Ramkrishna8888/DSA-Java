package com.binarysearch;

class FindFloorAndCeil{
	int findFloor(int arr[], int target) {
	    int low = 0;
	    int high = arr.length-1;
	    int ans = arr.length;
	    while(low <= high) {
	    	int mid = low + (high-low)/2;
	    	if(arr[mid] <= target){
	    		ans = mid;
	    		low = mid + 1;
	    	}
	    	else {
	    		high = mid - 1;
	    	}
	    }
		return ans;
	}
	
	int findCeil(int arr[], int target) {
	    int low = 0;
	    int high = arr.length-1;
	    int ans = arr.length;
	    while(low <= high) {
	    	int mid = low + (high-low)/2;
	    	if(arr[mid] >= target){
	    		ans = mid;
	    		high = mid - 1;
	    		
	    	}
	    	else {
	    		low = mid + 1;
	    	}
	    }
		return ans;
	}

}

public class FloorAndCeil {
public static void main(String[] args) {
	int[] arr = {1,2,3,4,5,6,7};
	int target = 4;
	FindFloorAndCeil obj = new FindFloorAndCeil();
	System.out.println("Floor : "+obj.findFloor(arr, target)+" Ceil : "+obj.findCeil(arr, target)); 
	
}
}
