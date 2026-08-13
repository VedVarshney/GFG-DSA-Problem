class Solution {
    public int sum(int n){
        int s=0;
        for(int i=n; i>0; i/=10){
            s+=i%10;
        }
        return s;
    }
    public int smallestIndex(int[] arr) {
    for(int i=0; i<arr.length; i++){
        if(i==(sum(arr[i])))
        return i;
    }   
    return -1;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna