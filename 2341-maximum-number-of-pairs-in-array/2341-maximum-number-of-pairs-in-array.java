class Solution {
    public int[] numberOfPairs(int[] arr) {
    HashMap<Integer,Integer> map = new HashMap<>();
    for(int ele : arr){
        if(map.containsKey(ele))
        map.put(ele,map.get(ele)+1);
        else
        map.put(ele,1);
    }
    int p=0,c=0;
    for(int i : map.keySet()){
    if(map.get(i)%2==0){
        p+=map.get(i)/2;
    }
    else{
        p+=map.get(i)/2;
        map.put(i,1);
    }
    }
    int[] ans = new int[2];
    ans[0]=p;
    for(int i : map.values()){
        if(i==1)
        c++;
    }
    ans[1]=c;
    return ans;
    } 
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna