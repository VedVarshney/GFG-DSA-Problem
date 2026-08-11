class Solution {
    public int[] findErrorNums(int[] arr) {
    HashMap<Integer,Integer> map = new HashMap<>();
    for(int ele : arr){
        if(map.containsKey(ele))
        map.put(ele,map.get(ele)+1);
        else
        map.put(ele,1);
    }
    ArrayList<Integer> al = new ArrayList<>();
    for(int ele : map.keySet()){
    if(map.get(ele)==2)
    al.add(ele);
    }
    for(int i=1; i<=arr.length; i++){
    if(!map.containsKey(i))
    al.add(i);
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