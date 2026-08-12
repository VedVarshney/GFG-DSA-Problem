class Solution {
    public void rotate(int[][] arr){
        int n=arr.length;
        for(int i=0; i<n; i++){
            for(int j=0; j<i; j++){
                int t=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=t;
            }
        }
        for(int i=0; i<n; i++){
            int a=0,b=n-1;
            while(a<b){
                int t=arr[i][a];
                arr[i][a]=arr[i][b];
                arr[i][b]=t;
                a++;
                b--;
            }
        }
    }
    public boolean check(int[][] arr , int[][] trr){
    int n=arr.length;
    for(int i=0; i<n; i++){
        for(int j=0; j<n; j++){
            if(arr[i][j]!=trr[i][j])
            return false;
        }
    }  
    return true;
    }
    public boolean findRotation(int[][] arr, int[][] trr) {
    for(int k=0; k<4; k++){
    if(check(arr,trr)) return true;
    rotate(arr);
    }
    return false;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna