class Solution {
    public void duplicateZeros(int[] arr) {
    ArrayList<Integer> al = new ArrayList<>();
    for(int i=0; i<arr.length; i++){
        if(arr[i]!=0){
            al.add(arr[i]);
        }else{
            al.add(0);
            al.add(0);
        }
        if(al.size()==arr.length)
        break;
    }
    for(int i=0; i<arr.length; i++){
        arr[i]=al.get(i);
    }
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna