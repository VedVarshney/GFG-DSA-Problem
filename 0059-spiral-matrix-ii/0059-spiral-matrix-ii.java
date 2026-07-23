class Solution {
    public int[][] generateMatrix(int n) {
    int[][] ans =new int[n][n];   
    int minr=0,maxr=n-1;
    int minc=0,maxc=n-1;
    int k=1;
    while(k<=n*n){
        for(int j=minc; j<=maxc && k<=n*n; j++){
            ans[minr][j]=k++;
        }
        minr++;
        for(int i=minr; i<=maxr && k<=n*n; i++){
            ans[i][maxc]=k++;
        }
        maxc--;
        for(int j=maxc; j>=minc && k<=n*n; j--){
            ans[maxr][j]=k++;
        }
        maxr--;
        for(int i=maxr; i>=minr && k<=n*n; i--){
            ans[i][minc]=k++;
        }
        minc++;
    }
    return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna