class Solution {
    public int percentageLetter(String s, char x) {
    int n=s.length();
    int c=0;
    for(int i=0; i<n; i++){
        if(s.charAt(i)==x)
        c++;
    } 
    return (int)(c*100/n);
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna