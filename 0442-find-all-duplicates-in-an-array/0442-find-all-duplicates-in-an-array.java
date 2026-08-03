class Solution {
    public List<Integer> findDuplicates(int[] arr) {
    HashMap<Integer,Integer> map= new HashMap<>();
    for(int i=0; i<arr.length; i++){
        if(map.containsKey(arr[i])){
        map.put(arr[i],map.get(arr[i])+1);
        }else{
            map.put(arr[i],1);
        }
    }
    ArrayList<Integer> al = new ArrayList<>();
    for(int key : map.keySet()){
        if(map.get(key)==2)
        al.add(key);
    }
    return al;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna