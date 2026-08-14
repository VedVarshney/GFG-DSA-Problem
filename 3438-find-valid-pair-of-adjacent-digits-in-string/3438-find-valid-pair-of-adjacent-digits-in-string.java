class Solution {
    public String findValidPair(String s) {
    HashMap<Character,Integer> map = new HashMap<>();
    for(int i=0; i<s.length(); i++){
        char ch=s.charAt(i);
        if(map.containsKey(ch))
          map.put(ch,map.get(ch)+1);
        else
          map.put(ch,1);
    }
    String x="";
    for(int i=0; i<s.length()-1; i++){
       if(s.charAt(i)!=s.charAt(i+1)){
         if((int)s.charAt(i)-48==(int)map.get(s.charAt(i))&&(int)s.charAt(i+1)-48==(int)map.get(s.charAt(i+1))){
          x+=s.charAt(i);
          x+=s.charAt(i+1);
          return x;
         }
       }
    }        
    return x;
   }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna