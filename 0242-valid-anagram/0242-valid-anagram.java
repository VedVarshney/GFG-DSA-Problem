class Solution {
    public boolean isAnagram(String s, String t) {
    if(s.length()!=t.length())
    return false;
    char[] srr=s.toCharArray();
    char[] trr=t.toCharArray();   
    Arrays.sort(srr);
    Arrays.sort(trr);
    for(int i=0; i<srr.length; i++){
        if(srr[i]!=trr[i]){
            return false;
        }
    }
    return true;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna