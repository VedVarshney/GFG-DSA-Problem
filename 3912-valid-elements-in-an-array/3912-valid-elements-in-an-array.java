class Solution {
    public int max(int[] arr,int i, int j){
        int max=Integer.MIN_VALUE;
        for(int k=i; k<=j; k++){
        if(arr[k]>max)
        max=arr[k];
        }
        return max;
    }
    public List<Integer> findValidElements(int[] arr) {
    int n=arr.length;
    List<Integer> al = new ArrayList<>();
    al.add(arr[0]);
    if(n==1) return al;
    for(int i=1; i<arr.length-1; i++){
        if(arr[i]>max(arr,0,i-1) || arr[i]>max(arr,i+1,n-1))
        al.add(arr[i]);
    }   
    al.add(arr[n-1]);
    return al;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna