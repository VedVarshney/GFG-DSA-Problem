class Solution {
    public boolean uniqueOccurrences(int[] arr) {
    HashMap<Integer,Integer> map = new HashMap<>();
    for(int ele : arr){
        if(map.containsKey(ele))
           map.put(ele,map.get(ele)+1);
        else
           map.put(ele,1);
    }
    HashSet<Integer> set = new HashSet<>();
    for(int ele : map.keySet()){
        set.add(map.get(ele));
    }
    return set.size()==map.size();
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna