class Solution {
    public int countSpecialIntegers(int[] arr) {
    HashMap<Integer,Integer> map = new HashMap<>();
    for(int ele : arr){
        if(map.containsKey(ele))
           map.put(ele,map.get(ele)+1);
        else
           map.put(ele,1);
    }    
    int c=0;
    for(int key : map.keySet()){
        int x=map.get(key);
        if(x==3){
            int j=0;
            int[] trr=new int[3];
            for(int i=0; i<arr.length; i++){
            if(key==arr[i]){
            trr[j++]=i;
            }
            }
            if((trr[1]-trr[0])==(trr[2]-trr[1]))
            c++;
        }
    }
    return c;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna