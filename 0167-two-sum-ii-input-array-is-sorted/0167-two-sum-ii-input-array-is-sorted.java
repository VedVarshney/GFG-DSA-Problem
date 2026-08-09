class Solution {
    public int[] twoSum(int[] arr, int x) {
    HashMap<Integer,Integer> map = new HashMap<>();
    int[] ans = new int[2];
    for(int i=0; i<arr.length; i++){
        if(map.containsKey(x-arr[i])){
        ans[0]=map.get(x-arr[i]);
        ans[1]=i+1;
        }else{
            map.put(arr[i],i+1);
        }
    }    
    return ans;    
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna