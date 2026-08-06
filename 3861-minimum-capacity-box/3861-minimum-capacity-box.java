class Solution {
    public int minimumIndex(int[] arr, int s) {
    int  mn=Integer.MAX_VALUE;
    int ix=-1;
    for(int i=0; i<arr.length; i++){
        if(arr[i]>=s){
            if(arr[i]<mn){
                ix=i;
                mn=arr[i];
            }
        }
    }
    return ix;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna