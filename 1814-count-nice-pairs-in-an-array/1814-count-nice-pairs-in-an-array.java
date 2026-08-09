class Solution {
    public int rev(int n){
        int rv=0;
        while(n>0){
            rv=rv*10+n%10;
            n/=10;
        }
        return rv;
    }
    public int countNicePairs(int[] arr) {
    HashMap<Integer,Integer> map = new HashMap<>();
    int c=0;
    for(int i=0; i<arr.length; i++){
    arr[i]-=rev(arr[i]);
    }    
    for(int ele : arr){
        if(map.containsKey(ele)){
            c+=map.get(ele);
            c%=1000000007;
            map.put(ele,map.get(ele)+1);
        }else{
            map.put(ele,1);
        }
    }
    return c;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna