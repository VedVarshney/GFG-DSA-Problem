class Solution {
  public:
    vector<int> matrixDiagonally(vector<vector<int>>& mat) {
        vector<int>ans;
        int n=mat.size();
        for(int i=0;i<n;i++){
            if(i%2!=0){
                int j=0,k=i;
                while(k>=0) ans.push_back(mat[j++][k--]);
            }
            else
            {
                int j=i,k=0;
                while(j>=0) ans.push_back(mat[j--][k++]);
            }
        }
        for(int i=1;i<n;i++){
            if((n - 1 + i) % 2 != 0){
                int j=i,k=n-1;
                while(j<n) ans.push_back(mat[j++][k--]);
            }
            else{
                int j=n-1,k=i;
                while(k<n) ans.push_back(mat[j--][k++]);
            }
        }
        return ans;
    }
};

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna