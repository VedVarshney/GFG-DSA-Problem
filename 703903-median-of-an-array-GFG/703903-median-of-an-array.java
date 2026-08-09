class Solution {
    public double findMedian(int[] arr) {
        Arrays.sort(arr);
        if(arr.length%2==1)
        return arr[arr.length/2];
        return (arr[arr.length/2]+arr[arr.length/2-1])/2.0;
    }
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna