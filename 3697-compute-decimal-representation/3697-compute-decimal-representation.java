class Solution {
    public int[] decimalRepresentation(int n) {
    ArrayList<Integer> al = new ArrayList<>();
    int rm;
    int i=0;
    while(n>0){
        rm=n%10;
        int item=rm*(int)Math.pow(10,i++);
        if(item!=0)
        al.add(item);
        n/=10;
    }  
    // for(int k=0; k<al.size(); k++){
    //     if(al.get(k)==0)
    //     al.remove(k);
    // }
    int[] ans = new int[al.size()];
    int j=0;
    for(int k=al.size()-1; k>=0; k--){
        ans[j++]=al.get(k);
    }
    return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna