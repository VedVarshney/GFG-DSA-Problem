class Solution {
    public int pivotIndex(int[] arr) {
    for(int i=0; i<arr.length; i++){
    int leftSum=0,rightSum=0;
        for(int j=0; j<i; j++){
            leftSum+=arr[j];
        }
        for(int j=i+1; j<arr.length; j++){
            rightSum+=arr[j];
        }
        if(leftSum==rightSum) return i;
    }    
    return -1;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna