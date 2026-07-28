class Solution {
    public int rev(int num){
        int rm,rv=0;
        while(num>0){
            rm=num%10;
            rv=rv*10+rm;
            num/=10;
        }
        return rv;
    }
    public int countDistinctIntegers(int[] arr) {
    HashSet<Integer> set = new HashSet();
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