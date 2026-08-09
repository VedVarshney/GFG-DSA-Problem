class Solution {
    public int[] findEvenNumbers(int[] arr) {
    HashMap<Integer,Integer> map = new HashMap<>();
    ArrayList<Integer> al = new ArrayList<>();
    for(int ele:arr){
        if(map.containsKey(ele))
        map.put(ele,map.get(ele)+1);
        else
        map.put(ele,1);
    }
    for(int i=100; i<=998; i+=2){
    int x=i;
    int c=x%10; x/=10;
    int b=x%10; x/=10;
    int a=x;
    if(map.containsKey(a)){
        int afrq=map.get(a);
        map.put(a,afrq-1);
        if(afrq==1) map.remove(a);
        if(map.containsKey(b)){
        int bfrq=map.get(b);
        map.put(b,bfrq-1);
        if(bfrq==1) map.remove(b);
        if(map.containsKey(c)){
        al.add(i);
        }
        map.put(b,bfrq); 
        }
        map.put(a,afrq);
    }
    }   
    int[] ans = new int[al.size()];
    for(int i=0; i<al.size(); i++){
        ans[i]=al.get(i);
    }
    return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna