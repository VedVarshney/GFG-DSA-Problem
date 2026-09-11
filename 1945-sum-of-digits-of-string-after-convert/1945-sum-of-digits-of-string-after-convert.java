class Solution {
    public int getLucky(String s, int k) {
    String x="";
    for(int i=0; i<s.length(); i++){
    x+=(int)(s.charAt(i))-96;
    } 
    int ans=0;
    for(int i=0; i<k; i++){
        ans=0;
    for(int j=0; j<x.length(); j++){
        ans+=(int)(x.charAt(j))-48;
    }
    x=Integer.toString(ans);
    }
    return ans;   
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna