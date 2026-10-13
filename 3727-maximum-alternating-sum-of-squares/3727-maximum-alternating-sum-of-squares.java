class Solution {
    public long maxAlternatingSum(int[] arr) {
    for(int i=0; i<arr.length; i++) arr[i]=arr[i]*arr[i];   
    Arrays.sort(arr);
    long sum1=0 , sum2=0;
    for(int i=0; i<arr.length; i++){
        if(i<arr.length/2) sum1+=arr[i];
        else sum2+=arr[i];
    }
    return sum2-sum1;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna