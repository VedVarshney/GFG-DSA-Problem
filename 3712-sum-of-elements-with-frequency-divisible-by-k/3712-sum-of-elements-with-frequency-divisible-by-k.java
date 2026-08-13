class Solution {
    public int sumDivisibleByK(int[] arr, int k) {
    HashMap<Integer,Integer> map = new HashMap<>();
    for(int ele : arr){
        if(map.containsKey(ele))
           map.put(ele,map.get(ele)+1);
        else
           map.put(ele,1);
    } 
    int s=0;    
    for(int ele : map.keySet()){
    if((int)map.get(ele)%k==0){
        s+=ele*(int)map.get(ele);
    }
    }
    return s;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna