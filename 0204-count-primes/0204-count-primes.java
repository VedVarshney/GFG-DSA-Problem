class Solution {
    public int countPrimes(int n) {
    if(n<=2) return 0;
    boolean[] arr = new boolean[n];  
    for(int i=2; i<n; i++){
        arr[i]=true;
    } 
    for(int i=2; i*i<n; i++){
        if(arr[i]) {
        for(int j=i*i; j<n; j+=i)
        arr[j]=false;
        }
    }
    int c=0;
    for(int i=2; i<n; i++){
        if(arr[i]) c++;
    }
    return c;
    }
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna