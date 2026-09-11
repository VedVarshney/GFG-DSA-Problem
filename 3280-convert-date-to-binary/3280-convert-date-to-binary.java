class Solution {
    public String fun(int n){
    String s="";
    while(n>0){
        s=n%2+s;
        n/=2;
    }
    return s;
    }
    public String convertDateToBinary(String s) {
    int y =Integer.parseInt(s.substring(0,4));
    int m =Integer.parseInt(s.substring(5,7));
    int d =Integer.parseInt(s.substring(8,10));   
    String x="";
    x+=fun(y)+"-"+fun(m)+"-"+fun(d);
    return x;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna