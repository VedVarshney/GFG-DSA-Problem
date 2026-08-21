class Solution {
    public boolean check(String s , String t){
        HashSet<Character> set1 = new HashSet<>();
        HashSet<Character> set2 = new HashSet<>();
        for(int i=0; i<t.length(); i++){
            set1.add(t.charAt(i));
        }
        for(int i=0; i<s.length(); i++){
            if(!set1.contains(s.charAt(i)))
            return false;
        }
        for(int i=0; i<s.length(); i++){
            set2.add(s.charAt(i));
        }
        for(int i=0; i<t.length(); i++){
            if(!set2.contains(t.charAt(i)))
            return false;
        }
        return true;
    }
    public int similarPairs(String[] arr) {
    int c=0;
    for(int i=0; i<arr.length; i++){
        for(int j=i+1; j<arr.length; j++){
            if(check(arr[i],arr[j]))
            c++;
        }
    }     
    return c;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna