// class Solution {
//     public int rev(int n){
//         int rv=0;
//         for(int i=n; i>0; i/=10)
//         rv=rv*10+i%10;
//         return rv;
//     }
//     public int countNicePairs(int[] arr) {
//     int n=arr.length;
//     int c=0;
//     for(int i=0; i<n; i++){
//         for(int j=i+1; j<n; j++){
//         if(arr[i]+rev(arr[j])==(arr[j])+rev(arr[i]))
//         c++;
//         }
//     }   
//     return c;
//     }
// }
class Solution {
    public int rev(int n){
        int rv=0;
        for(int i=n; i>0; i/=10)
        rv=rv*10+i%10;
        return rv;
    } 
    public int countNicePairs(int[] arr) {
    HashMap<Integer,Integer> map = new HashMap<>();
    int c=0; 
    for(int i=0; i<arr.length; i++){
    int ans=arr[i]-rev(arr[i]);
    if(map.containsKey(ans)){
       c+=map.get(ans);
       c%=1000000007;
       map.put(ans,map.get(ans)+1);
    }else{
        map.put(ans,1);
    }
    } 
    return c;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna