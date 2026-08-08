class Solution {
    public int[] twoSum(int[] arr, int x) {
    int[] ans = new int[2];
    boolean flag=false;
    for(int i=0; i<arr.length; i++){
        for(int j=i+1; j<arr.length; j++){
            if(arr[i]+arr[j]==x){
                ans[0]=i;
                ans[1]=j;
                flag=true;
                break;
            }
        }
        if(flag) break;
    }   
    return ans; 
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna