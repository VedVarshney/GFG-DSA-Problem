class Solution {
    public boolean digitCount(String s) {
    HashMap<Integer,Integer> map = new HashMap<>();
    for(int i=0; i<s.length(); i++){
        int as=s.charAt(i)-'0';
        if(map.containsKey(as))
        map.put(as,map.get(as)+1);
        else
        map.put(as,1);
    }   
    for(int i=0; i<s.length(); i++){
        if(map.containsKey(i)==false)
        map.put(i,0);
        if(((int)(s.charAt(i))-'0')!=(int)map.get(i)) return false;
    }
    return true;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna