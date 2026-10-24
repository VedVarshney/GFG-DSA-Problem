class Solution {
    public ListNode removeElements(ListNode head, int val) {
    ListNode dummy = new ListNode(-1);
    ListNode x=dummy;
    ListNode y=head;
    while(y!=null){
        if(y.val==val){
          y=y.next;
        }else{
            x.next=y;
            y=y.next;
            x=x.next;
        }
    } 
    x.next=y;
    return dummy.next;   
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna