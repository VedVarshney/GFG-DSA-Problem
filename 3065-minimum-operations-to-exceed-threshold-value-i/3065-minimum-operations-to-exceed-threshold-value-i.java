class Solution {
    public int minOperations(int[] arr, int k) {
    int c=0;
    for(int i=0; i<arr.length; i++){
        if(arr[i]>=k)
        c++;
    }     
    return arr.length-c;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna