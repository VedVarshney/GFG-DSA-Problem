class Solution {
    public boolean same(int x , int y){
        int a=0 , b=0;
        while(x>0){
            a=Math.max(a,x%10);
            x=x/10;
        }
        while(y>0){
            b=Math.max(b,y%10);
            y=y/10;
        }
        return a==b;
    }
    public int maxSum(int[] arr) {
    int sum=-1;
    for(int i=0; i<arr.length; i++){
        for(int j=i+1; j<arr.length; j++){
            if(same(arr[i],arr[j])){
                sum=Math.max(sum,(arr[i]+arr[j]));
            }
        }
    }  
    return sum;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna