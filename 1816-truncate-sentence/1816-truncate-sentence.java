class Solution {
    public String truncateSentence(String s, int k) {
    int i=0,j=0;
    int c=0;
    StringBuilder sb = new StringBuilder();
    while(j<s.length() && c<k){
        if(s.charAt(j)!=' '){
            j++;
        }else{
            String x=s.substring(i,j);
            sb.append(x);
            sb.append(" ");
            c++;
            i=j+1;
            j=i;
        }
    }
    if(c<k){
    String x=s.substring(i,j);
    sb.append(x);
    sb.append(" ");
    }
    sb.deleteCharAt(sb.length()-1);
    return sb.toString();
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna