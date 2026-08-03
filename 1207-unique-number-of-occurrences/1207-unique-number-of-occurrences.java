class Solution {
    public boolean uniqueOccurrences(int[] arr) {
    HashMap<Integer,Integer> map = new HashMap<>();
    for(int i=0; i<arr.length; i++){
        if(map.containsKey(arr[i])){
        int frq=map.get(arr[i]);
        map.put(arr[i],frq+1);
        }else{
            map.put(arr[i],1);
        }
    }
    HashSet<Integer> set = new HashSet<>();
    for(int key:map.keySet()){
        set.add(map.get(key));
    }
    if(set.size()!=map.size())
    return false;
    return true;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna