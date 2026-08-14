class Solution {
    public boolean checkIfPangram(String s) {
    int[] frr=new int[26];
    for(int i=0; i<s.length(); i++){
        int as=s.charAt(i)-'a';
        frr[as]++;
    }   
    for(int i=0; i<frr.length; i++){
        if(frr[i]==0)
        return false;
    }
    return true;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna