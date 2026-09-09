class Solution {
    public int[] separateDigits(int[] arr) {
    ArrayList<Integer> al = new ArrayList<>();
    for(int i=arr.length-1; i>=0; i--){
        int n = arr[i];
        while(n>0){
            al.add(n%10);
            n/=10;
        }
    }
    int[] ans=new int[al.size()];
    int j=0;
    for(int i=al.size()-1; i>=0; i--){
        ans[j++]=al.get(i);
    }
    return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna