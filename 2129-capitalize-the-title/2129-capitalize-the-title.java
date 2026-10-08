class Solution {
    public String capitalizeTitle(String s) {
    StringBuilder sb = new StringBuilder(s);
    int i=0,j=0;
    while(j<sb.length()){
    if(sb.charAt(j)!=' ') j++;
    else{
        int ln=j-i;
        if(ln==1){
            if(sb.charAt(i)>=65 && sb.charAt(i)<=90)
                sb.setCharAt(i,(char)((int)sb.charAt(i)+32));
        }else if(ln==2){
            if(sb.charAt(i)>=65 && sb.charAt(i)<=90)
                sb.setCharAt(i,(char)((int)sb.charAt(i)+32));
            if(sb.charAt(i+1)>=65 && sb.charAt(i+1)<=90)
                sb.setCharAt(i+1,(char)((int)sb.charAt(i+1)+32));
        }else{
            if(sb.charAt(i)>=97 && sb.charAt(i)<=122)
                sb.setCharAt(i,(char)((int)sb.charAt(i)-32));
            for(int k=i+1; k<j; k++){
                if(sb.charAt(k)>=65 && sb.charAt(k)<=90)
                sb.setCharAt(k,(char)((int)sb.charAt(k)+32));
            }
        }
        i=j+1;
        j=i;
    } 
    }
    int ln=j-i; 
    if(ln==1){
        if(sb.charAt(i)>=65 && sb.charAt(i)<=90)
           sb.setCharAt(i,(char)((int)sb.charAt(i)+32));   
    }else if(ln==2){
            if(sb.charAt(i)>=65 && sb.charAt(i)<=90)
                sb.setCharAt(i,(char)((int)sb.charAt(i)+32));
            if(sb.charAt(i+1)>=65 && sb.charAt(i+1)<=90)
                sb.setCharAt(i+1,(char)((int)sb.charAt(i+1)+32));
    }else{
            if(sb.charAt(i)>=97 && sb.charAt(i)<=122)
                sb.setCharAt(i,(char)((int)sb.charAt(i)-32));
            for(int k=i+1; k<j; k++){
                if(sb.charAt(k)>=65 && sb.charAt(k)<=90)
                sb.setCharAt(k,(char)((int)sb.charAt(k)+32));
            }
    }
    return sb.toString();
}
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna