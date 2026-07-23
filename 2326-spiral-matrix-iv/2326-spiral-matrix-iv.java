class Solution {
    public int[][] spiralMatrix(int m, int n, ListNode head) {
     int[][] arr=new int[m][n];
     for(int i=0; i<m; i++){
        for(int j=0; j<n; j++){
            arr[i][j]=-1;
        }
     }
     int minr=0,maxr=m-1;
     int minc=0,maxc=n-1;
     while(minc<=maxc && minr<=maxr){
     for(int j=minc; j<=maxc && head!=null; j++){
        arr[minr][j]=head.val;
        head=head.next;
     }  
     minr++;
     for(int i=minr; i<=maxr && head!=null; i++){
        arr[i][maxc]=head.val;
        head=head.next;
     } 
     maxc--;
     for(int j=maxc; j>=minc && head!=null; j--){
        arr[maxr][j]=head.val;
        head=head.next;
     }  
     maxr--;
     for(int i=maxr; i>=minr && head!=null; i--){
        arr[i][minc]=head.val;
        head=head.next;
     } 
     minc++;
     }
     return arr;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna