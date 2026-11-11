class Solution {
    public int[] sumZero(int n) {
        // what a lovely question
        int[] arr = new int[n];
        int mid = n/2;
        int temp = n;
        int initial = 0;
        if(n%2==0){
        for(int i = 0; i<n; i++){
            if(i<mid){
                arr[i] = -1*temp;
                temp--;
            }
            if(i>=mid){
                arr[i] = arr[initial]*-1;
                initial++;
            }
        }
        }
        else{
             for(int j = 0; j<n; j++){
             if(j<mid){
                arr[j] = -1*temp;
                temp--;
            }
            if(j==mid){
                arr[j] = 0;
            }
            if(j>mid){
                arr[j] = arr[initial]*-1;
                initial++;
            }
          }
        }

        return arr;
    }
}