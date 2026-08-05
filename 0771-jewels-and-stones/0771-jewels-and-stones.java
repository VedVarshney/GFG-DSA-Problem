class Solution {
    public int numJewelsInStones(String j, String s) {
    HashSet<Character> set = new HashSet<>();
    for(int i=0; i<j.length(); i++){
        set.add(j.charAt(i));
    }
    int c=0;
    for(int i=0; i<s.length(); i++){
        char ch = s.charAt(i);
        if(set.contains(ch))
        c++;
    }
    return c;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna