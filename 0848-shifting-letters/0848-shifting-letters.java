class Solution {
    public String shiftingLetters(String s, int[] arr) {
    StringBuilder sb = new StringBuilder(s);
    int n=arr.length;
    arr[n-1]=arr[n-1]%26;
    for(int i=n-2; i>=0; i--){
         arr[i]=(arr[i]+ arr[i+1])%26;
    }
    for(int i=0; i<sb.length(); i++){
        int as=sb.charAt(i)-'a';
        as=(arr[i]+as)%26;
        sb.setCharAt(i,(char)(as+'a'));
    }
    return sb.toString();
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna