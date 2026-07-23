class Solution {
    public int[][] generateMatrix(int n) {
    int[][] ans =new int[n][n];   
    int minr=0,maxr=n-1;
    int minc=0,maxc=n-1;
    int k=1;
    while(minr<=maxr && minc<=maxc){
        for(int j=minc; j<=maxc; j++){
            ans[minr][j]=k++;
        }
        minr++;
        if(minr>maxr || minc>maxc) break;
        for(int i=minr; i<=maxr; i++){
            ans[i][maxc]=k++;
        }
        maxc--;
        if(minr>maxr || minc>maxc) break;
        for(int j=maxc; j>=minc; j--){
            ans[maxr][j]=k++;
        }
        maxr--;
        if(minr>maxr || minc>maxc) break;
        for(int i=maxr; i>=minr; i--){
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