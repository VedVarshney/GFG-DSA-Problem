class Solution {
    public static boolean palindrome(int n){
        int og=n;
        int rm,rv=0;
        while(n>0){
            rm=n%10;
            rv=rv*10+rm;
            n/=10;
        }
        return og==rv;
    }
    public static boolean isPalinArray(int[] arr) {
    for(int i=0; i<arr.length; i++){
        if(palindrome(arr[i])==false)
        return false;
    }
    return true;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna