class Solution {
    public String defangIPaddr(String s) {
    int i=0,j=0;
    StringBuilder sb = new StringBuilder();
    while(j<s.length()){
    if(s.charAt(j)!='.'){
        j++;
    }else{
        String x=s.substring(i,j);
        sb.append(x);
        sb.append("[.]");
        i=j+1;
        j=i;
    }
    }
    String x=s.substring(i,j);
    sb.append(x);
    return sb.toString();
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna