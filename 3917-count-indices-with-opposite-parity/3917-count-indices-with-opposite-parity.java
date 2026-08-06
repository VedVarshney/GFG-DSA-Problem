class Solution {
    public int[] countOppositeParity(int[] arr) {
    int[] ans=new int[arr.length];
    for(int i=0; i<arr.length; i++){
        int c=0;
        for(int j=i+1; j<arr.length; j++){
        if(arr[i]%2==0){
        if(arr[j]%2==1) c++;    
        }else{
        if(arr[j]%2==0) c++;  
        }  
        }
        ans[i]=c;
    }  
    return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna