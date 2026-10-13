class Solution {
    public int elevatorRequests(int n, int[] arr) {
    int sum=arr[0];
    for(int i=0; i<arr.length-1; i++){
    sum=sum+Math.abs((arr[i+1]-arr[i]));
    }   
    return sum;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna