class Solution {
    public boolean isPathCrossing(String s) {
    HashSet<String> set = new HashSet<>();
    int x=0,y=0;
    set.add(x+" "+y);
    for(int i=0; i<s.length(); i++){
        if(s.charAt(i)=='N')
        y++;
        else if(s.charAt(i)=='E')
        x++;
        else if(s.charAt(i)=='S')
        y--;
        else
        x--;
        String point=x+" "+y;
        if(set.contains(point)) return true;
        set.add(point);
        }
    return false;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna