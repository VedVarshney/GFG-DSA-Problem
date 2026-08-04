class Solution {
    public int rev(int n){
        int rv=0;
        for(int i=n; i>0; i/=10)
        rv=rv*10+i%10;
        return rv;
    }
    public int countNicePairs(int[] arr) {
    HashMap<Integer,Integer> map = new HashMap<>();
    int c=0;
    for(int ele : arr){
        int diff=ele-rev(ele);
        if(map.containsKey(diff)){
           c+=map.get(diff);
           c%=1000000007;
           map.put(diff,map.get(diff)+1);
        }else{
           map.put(diff,1);
        }
    }   
    return c;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna