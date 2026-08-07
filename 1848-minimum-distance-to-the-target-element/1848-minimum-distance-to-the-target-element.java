class Solution {
    public int getMinDistance(int[] arr, int target, int start) {
    int min=arr.length;
    for(int i=0; i<arr.length; i++){
        if(arr[i]==target){
        min=Math.min(Math.abs(i-start),min);
        }
    }  
    return min;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna