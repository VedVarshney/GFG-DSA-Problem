class Solution {
    public String restoreString(String s, int[] arr) {
    HashMap<Integer,Character> map=new HashMap<>();
    for(int i=0; i<arr.length; i++){
        map.put(arr[i],s.charAt(i));
    }
    String x="";
    for(int i=0; i<arr.length; i++){
    x+=map.get(i);
    }
    return x;   
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna