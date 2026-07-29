class Solution {
    public int rev(int n){
        int rv=0;
        while(n>0){
            rv=rv*10+n%10;
            n/=10;
        }
        return rv;
    }
    public int countDistinctIntegers(int[] arr) {
    HashSet<Integer> set = new HashSet<>();
    for(int i=0; i<arr.length; i++){
        set.add(arr[i]);
        set.add(rev(arr[i]));
    }
    return set.size();
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna