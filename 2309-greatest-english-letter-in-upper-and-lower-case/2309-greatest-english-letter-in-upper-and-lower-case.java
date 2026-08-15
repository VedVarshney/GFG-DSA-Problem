class Solution {
    public String greatestLetter(String s) {
    for(char ch='z'; ch>='a'; ch--){
        String x=""; x+=ch;
        String y=""; 
        int as=ch-32;
        y+=(char)as;
        if(s.contains(x) && s.contains(y))
        return y;
    }    
    return "";
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna