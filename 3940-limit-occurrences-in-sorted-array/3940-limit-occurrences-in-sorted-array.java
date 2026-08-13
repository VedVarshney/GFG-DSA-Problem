class Solution {
    public int[] limitOccurrences(int[] arr, int k) {
    HashMap<Integer,Integer> map = new HashMap<>();
    HashSet<Integer> set = new HashSet<>();
    for(int ele : arr){
        if(map.containsKey(ele))
            map.put(ele,map.get(ele)+1);
        else
            map.put(ele,1);
        set.add(ele);
    }   
    ArrayList<Integer> al = new ArrayList<>();
    for(int i=0; i<arr.length; i++){
        if(set.contains(arr[i]))
        for(int j=0; j<Math.min(k,(int)map.get(arr[i])); j++){
            al.add(arr[i]);
        }
        set.remove(arr[i]);
    } 
    int[] ans = new int[al.size()];
    for(int i=0; i<ans.length; i++){
        ans[i]=al.get(i);
    }
    return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna