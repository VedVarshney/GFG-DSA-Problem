class Solution {
    public int firstUniqueEven(int[] arr) {
    HashMap<Integer,Integer> map = new HashMap<>();
    for(int ele : arr){
        if(map.containsKey(ele)){
           map.put(ele,map.get(ele)+1);
        }else{
            map.put(ele,1); 
        }
    }    
    for(int i=0; i<arr.length; i++){
        if(arr[i]%2==0 && map.get(arr[i])==1)
        return arr[i];
    }
    return -1;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna