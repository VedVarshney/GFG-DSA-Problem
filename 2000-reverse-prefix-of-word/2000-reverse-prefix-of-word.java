class Solution {
    public String reversePrefix(String s, char ch) {
    int ix=-1;
    for(int i=0; i<s.length(); i++){
        if(s.charAt(i)==ch){
        ix=i;
        break;
        }
    }    
    StringBuilder sb = new StringBuilder(s);
    int i=0, j=ix;
    while(i<j){
        char c=sb.charAt(i);
        sb.setCharAt(i,sb.charAt(j));
        sb.setCharAt(j,c);
        i++;
        j--;
    }
    return sb.toString();
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna