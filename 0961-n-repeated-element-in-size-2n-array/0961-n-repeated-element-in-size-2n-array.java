class Solution {
    public int repeatedNTimes(int[] arr) {
    HashMap<Integer,Integer> map = new HashMap<>();
    for(int ele : arr){
        if(map.containsKey(ele))
        map.put(ele,map.get(ele)+1);
        else
        map.put(ele,1);
    } 
    for(int ele : map.keySet()){
        if(map.get(ele)==arr.length/2)
        return ele;
    }
    return -1;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna