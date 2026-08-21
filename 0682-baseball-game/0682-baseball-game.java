class Solution {
    public int calPoints(String[] arr) {
    int sum=0;
    ArrayList<Integer> al = new ArrayList<>();
    for(int i=0; i<arr.length; i++){
        if(arr[i].equals("C")){
        al.remove(al.size()-1);
        }else if(arr[i].equals("D")){
        al.add(2*al.get(al.size()-1));
        }else if(arr[i].equals("+")){
        al.add(al.get(al.size()-1) + al.get(al.size()-2));
        }else{
        al.add(Integer.parseInt(arr[i]));   
        }
    }
    for(int i=0; i<al.size(); i++){
        sum+=al.get(i);
    }    
    return sum;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna