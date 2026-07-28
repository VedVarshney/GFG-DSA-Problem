class Solution {
    public int firstUniqChar(String s) {
    int[] frq=new int[26];
    for(int i=0; i<s.length(); i++){
        int as=s.charAt(i);
        as=as-97;
        frq[as]++;
    }   
    for(int i=0; i<s.length(); i++){
        char ch=s.charAt(i);
        if(frq[(int)ch-97]==1)
        return i;
    }
    return -1;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna