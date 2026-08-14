class Solution {
    public int prefixCount(String[] arr, String p) {
    int c=0;
    for(int i=0; i<arr.length; i++){
        String s=arr[i];
        if(s.startsWith(p))
        c++;
    }    
    return c;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna