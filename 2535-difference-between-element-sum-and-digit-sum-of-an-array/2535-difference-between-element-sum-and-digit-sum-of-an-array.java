class Solution {
    public int differenceOfSum(int[] arr) {
    int esum=0,dsum=0;
    for(int i=0; i<arr.length; i++){
        esum+=arr[i];
        int a=arr[i]%10; arr[i]/=10;
        int b=arr[i]%10; arr[i]/=10;
        int c=arr[i]%10; arr[i]/=10;
        int d=arr[i]%10; 
        dsum+=a+b+c+d;
    }    
    return Math.abs(esum-dsum);
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna