class Solution {
    public int findDuplicate(int[] arr) {
    // HashSet<Integer> set = new HashSet<>();
    // for(int ele : arr) {
    //     if(set.contains(ele)) return ele;
    //     else
    //     set.add(ele);
    // } 
    // return 0;
    
    // int sum=0;
    // int n=arr.length-1;
    // for(int x : arr){
    //     sum += x;
    // }
    // int s = (n * (n+1))/2;
    // return sum - s;
    int n=arr.length;
    int[] brr= new int[n];
    for(int i=0; i<n; i++){
    if(brr[arr[i]]==1) 
       return arr[i];
    else
       brr[arr[i]]++;   
    }
    return 0;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna