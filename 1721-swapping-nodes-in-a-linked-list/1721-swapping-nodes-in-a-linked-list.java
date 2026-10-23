class Solution {
    public ListNode swapNodes(ListNode head, int k) {  
    ListNode slow=head;
    ListNode fast=head;
    for(int i=0; i<k-1; i++){
       fast=fast.next;
    }
    ListNode x=fast;
    while(fast.next!=null){
        slow=slow.next;
        fast=fast.next;
    }
    int y=x.val;
    x.val=slow.val;
    slow.val=y;
    return head;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna