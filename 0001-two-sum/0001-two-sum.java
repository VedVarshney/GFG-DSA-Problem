class Solution {
    public int[] twoSum(int[] arr, int x) {
    int[] ans={-1,-1};
    HashMap<Integer,Integer> map=new HashMap<>();
    for(int i=0; i<arr.length; i++){
        if(map.containsKey(x-arr[i])){
        ans[0]=i;
        ans[1]=map.get(x-arr[i]);
        break;
        }
        else{
            map.put(arr[i],i);
        }
    }     
    return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna