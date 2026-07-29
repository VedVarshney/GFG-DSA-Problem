class Solution {
    public String rev(String s){
        StringBuilder sb = new StringBuilder(s);
        return sb.reverse().toString();
    }
    public int maximumNumberOfStringPairs(String[] arr) {
    HashSet<String> set = new HashSet<>();
    int c=0;
    for(int i=0; i<arr.length; i++){
    if(set.contains(rev(arr[i]))){
    c++;
    set.remove(arr[i]);
    }else{
        set.add(arr[i]);
    } 
    } 
    return c; 
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna