class Solution {
    boolean twoSum(int arr[], int  x) {
    HashMap<Integer,Integer> map = new HashMap<>();
    for(int i=0; i<arr.length; i++){
    if(map.containsKey(x-arr[i])){
        return true;
    }else{
        map.put(arr[i],i);
    }
    }
    return false;  
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna