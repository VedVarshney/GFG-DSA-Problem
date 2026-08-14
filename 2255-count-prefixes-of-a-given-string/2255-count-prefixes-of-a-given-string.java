class Solution {
    public int countPrefixes(String[] arr, String p) {
    int c=0;
    for(int i=0; i<arr.length; i++){
        String x=arr[i];
        if(p.startsWith(x))
        c++;
    }
    return c;    
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna