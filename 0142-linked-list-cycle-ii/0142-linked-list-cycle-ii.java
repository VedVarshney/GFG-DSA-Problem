public class Solution {
    public ListNode detectCycle(ListNode head) {
    if(head==null || head.next==null) return null;
    ListNode slow=head;
    ListNode fast=head;
    while(fast!=null && fast.next!=null){
        slow=slow.next;
        fast=fast.next.next;
        if(slow==fast) break;
    }    
    if(slow!=fast) return null;
    ListNode x=head;
    while(x!=slow){
        x=x.next;
        slow=slow.next;
    }
    return slow;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna