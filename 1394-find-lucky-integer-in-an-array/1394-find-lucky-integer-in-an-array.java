class Solution {
    public int findLucky(int[] arr) {
    HashMap<Integer,Integer> map = new HashMap<>();
    for(int ele : arr){
        if(map.containsKey(ele))
        map.put(ele,map.get(ele)+1);
        else
        map.put(ele,1);
    }   
    ArrayList<Integer> al = new ArrayList<>();
    for(int ele : map.keySet()){
        if((int)map.get(ele)==ele)
        al.add(ele);
    }
    int mx=-1;
    for(int i=0; i<al.size(); i++){
    if(al.get(i)>mx)
    mx=al.get(i);
    }
    return mx;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna