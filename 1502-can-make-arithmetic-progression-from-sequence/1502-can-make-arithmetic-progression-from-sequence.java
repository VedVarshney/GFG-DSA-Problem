class Solution {
    public boolean canMakeArithmeticProgression(int[] arr) {
    Arrays.sort(arr);  
    int diff=arr[1]-arr[0];
    for(int i=0; i<arr.length-1; i++){
        if((arr[i+1]-arr[i])!=diff)
        return false;
    } 
    return true;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna