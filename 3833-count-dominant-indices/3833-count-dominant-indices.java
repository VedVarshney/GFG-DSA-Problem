class Solution {
    public double avg(int[] arr , int j){
        double sum=0;
        for(int i=j; i<arr.length; i++){
            sum+=arr[i];
        }
        return sum/(arr.length-j);
    }
    public int dominantIndices(int[] arr) {
    int n=arr.length;
    int  c=0;
    for(int i=0; i<n-1; i++){
        if(arr[i]>avg(arr,i+1)) c++;
    }   
    return c;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna