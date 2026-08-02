class Solution {
    public int reverse(int n){
    int rv=0;
    for(int i=n; i>0; i/=10){
        rv=rv*10+i%10;
    }
    return rv;
    }
    public int countDistinctIntegers(int[] arr) {
    HashSet<Integer> set = new HashSet<>();
    for(int i=0; i<arr.length; i++){
        set.add(arr[i]);
        set.add(reverse(arr[i]));
    }   
    return set.size();
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna