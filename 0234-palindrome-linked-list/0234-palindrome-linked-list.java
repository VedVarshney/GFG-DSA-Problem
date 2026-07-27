class Solution {
    public boolean isPalindrome(ListNode head) {
    ArrayList<Integer> al = new ArrayList<>();
    while(head!=null){
        al.add(head.val);
        head=head.next;
    }
    int l=0,h=al.size()-1;
    while(l<=h){
        if(al.get(l)!=al.get(h))
        return false;
        l++;
        h--;
    }
    return true;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna