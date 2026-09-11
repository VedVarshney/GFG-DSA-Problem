class Solution {
    public int totalNumbers(int[] arr) {
    HashMap<Integer,Integer> map = new HashMap<>();
    for(int ele : arr){
        if(map.containsKey(ele))
        map.put(ele,map.get(ele)+1);
        else
        map.put(ele,1);
    }  
    int ans=0;   
    for(int i=100; i<=998; i+=2){
        int x=i;
        int c =x%10; x/=10;
        int b =x%10; x/=10;
        int a =x%10;
        if(map.containsKey(a)){
        int afrq=map.get(a);    
        map.put(a,afrq-1);
        if(afrq==1) map.remove(a);
        if(map.containsKey(b)){
        int bfrq=map.get(b);
        map.put(b,bfrq-1);
        if(bfrq==1) map.remove(b);
        if(map.containsKey(c)){
        ans++;
        }
        map.put(b,bfrq); 
        }
        map.put(a,afrq);
        }
    }
    return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna