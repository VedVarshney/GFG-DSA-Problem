class Solution {
    public ListNode middleNode(ListNode head) {
    int len=0;
    ListNode x=head;
    while(x!=null){
        x=x.next;
        len++;
    } 
    x=head;
    for(int i=0; i<len/2; i++){
        x=x.next;
    }
    return x;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna