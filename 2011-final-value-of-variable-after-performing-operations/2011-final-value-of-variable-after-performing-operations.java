class Solution {
    public int finalValueAfterOperations(String[] s) {
    int n=0;
    for(int i=0; i<s.length; i++){
        String x=s[i];
        if(x.equals("--X"))
        --n;
        else if(x.equals("X++"))
        n++;
        else if(x.equals("X--"))
        n--;
        else
        ++n;
    }    
    return n;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna