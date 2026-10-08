class Solution {
    public boolean hasSameDigits(String s) {
    StringBuilder sb = new StringBuilder(s);
    while(sb.length()>2){
    for(int i=0; i<sb.length()-1; i++){
    int a=sb.charAt(i)-'0';
    int b=sb.charAt(i+1)-'0';
    int d=(a+b)%10;
    sb.setCharAt(i,(char)(d+48));
    }
    sb.deleteCharAt(sb.length()-1);
    }
    return sb.charAt(0)==sb.charAt(1);
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna