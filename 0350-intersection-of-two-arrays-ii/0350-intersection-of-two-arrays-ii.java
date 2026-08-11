class Solution {
    public int[] intersect(int[] arr, int[] brr) {
    HashMap<Integer,Integer> map1= new HashMap<>();
    HashMap<Integer,Integer> map2= new HashMap<>();
    ArrayList<Integer> al = new ArrayList<>();
    for(int ele : arr){
        if(map1.containsKey(ele))
        map1.put(ele,map1.get(ele)+1);
        else
        map1.put(ele,1);
    }
    for(int ele :brr){
        if(map2.containsKey(ele))
        map2.put(ele,map2.get(ele)+1);
        else
        map2.put(ele,1);
    }
    for(int ele : map1.keySet()){
        if(map2.containsKey(ele)){
            int f1=map1.get(ele);
            int f2=map2.get(ele);
            for(int i=0; i<Math.min(f1,f2); i++){
                al.add(ele);
            }
        }
    }
    int[] ans= new int[al.size()];
    for(int i=0; i<ans.length; i++){
        ans[i]=al.get(i);
    }
    return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna