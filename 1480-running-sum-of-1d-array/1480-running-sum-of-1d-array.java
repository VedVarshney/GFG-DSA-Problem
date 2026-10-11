class Solution {
    public int[] runningSum(int[] arr) {
    int[] pre=new int[arr.length];
    pre[0]=arr[0];
    for(int i=1; i<arr.length; i++){
        pre[i]=arr[i]+pre[i-1];
    }    
    return pre;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna