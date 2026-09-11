class Solution {
    public int countConsistentStrings(String s, String[] t) {
    HashSet<Character> set = new HashSet<>();
    for(int i=0; i<s.length(); i++){
        set.add(s.charAt(i));
    }    
    int c=0;
    for(int i=0; i<t.length; i++){
        String x = t[i];
        for(int j=0; j<x.length(); j++){
            if(!set.contains(x.charAt(j))){
                c++;
                break;
            }
        }
    }
    return  t.length-c;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna