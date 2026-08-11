class Solution {
    public int lengthOfLastWord(String s) {
    s=s.trim();
    int i=0,j=0;
    while(j<s.length()){
        if(s.charAt(j)!=' ')
        j++;
        else{
            i=j+1;
            j=i;
        }
    }   
    return j-i;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna