class Solution {
    public String rev(String s){
        StringBuilder sb = new StringBuilder(s);
        return sb.reverse().toString();
    }
    public int maximumNumberOfStringPairs(String[] arr) {
    int c=0;
    HashSet<String> set = new HashSet<>();
    for(String ele : arr){
        if(set.contains(rev(ele))){
        c++;
        }else{
        set.add(ele);
        }
    }    
    return c;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna