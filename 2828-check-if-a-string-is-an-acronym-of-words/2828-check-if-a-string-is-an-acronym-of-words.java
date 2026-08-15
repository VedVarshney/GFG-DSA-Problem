class Solution {
    public boolean isAcronym(List<String> al, String w) {
    if(al.size()!=w.length()) return false;
    for(int i=0; i<al.size(); i++){
        String x=al.get(i);
        if(w.charAt(i)!=x.charAt(0)) return false;
    }     
    return true;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna