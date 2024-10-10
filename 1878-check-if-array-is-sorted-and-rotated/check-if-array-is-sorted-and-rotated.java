class Solution {
    public boolean check(int[] arr) {
        int drop = 0;
        for(int i = 1; i < arr.length; i++){
            // Count drops where the current element is greater than the next one
            if(arr[i - 1] > arr[i]){
                drop++;
            }
        }

        // Check if there is a drop from the last element to the first element
        if(arr[0] < arr[arr.length - 1]) drop++;
        
        // The array is sorted or can be sorted with at most one rotation if drop count <= 1
        return drop <= 1;
    }
}