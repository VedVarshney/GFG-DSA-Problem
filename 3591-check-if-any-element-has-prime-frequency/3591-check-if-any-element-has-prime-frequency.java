class Solution {
    public boolean prime(int n){
        if(n==1 || n==0) return false;
        for(int i=2; i<n-1; i++){
            if(n%i==0)
            return false;
        }
        return true;
    }
    public boolean checkPrimeFrequency(int[] arr) {
    int[] frr = new int[101];
    for(int i=0; i<arr.length; i++){
        frr[arr[i]]++;
    }   
    for(int i=0; i<frr.length; i++){
        if(prime(frr[i]))
        return true;
    }
    return false;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna