class Solution {
    public String largestGoodInteger(String s) {
    String x="";
    int mx=-1;
    for(int i=0; i<s.length()-2; i++){
        if(s.charAt(i)==s.charAt(i+1) && s.charAt(i)==s.charAt(i+2))
            mx=Math.max(mx,s.charAt(i)-'0');
    }  
    if(mx==-1) return x;
    return ""+mx+mx+mx;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna