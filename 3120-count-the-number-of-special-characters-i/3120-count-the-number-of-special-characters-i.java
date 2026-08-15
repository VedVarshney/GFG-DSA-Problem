class Solution {
    public int numberOfSpecialChars(String s) {
    int c=0;
    int[] frr= new int[26];
    for(int i=0; i<s.length(); i++){
        if(s.charAt(i)>='a' && s.charAt(i)<='z'){
        int as=s.charAt(i);
        String x="";
        x+=(char)(as-32);
        if(s.contains(x))
        frr[as-97]++;
        }
    }
    for(int i=0; i<26; i++){
        if(frr[i]>0)
        c++;
    }
    return c;    
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna