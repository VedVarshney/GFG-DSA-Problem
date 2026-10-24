class Solution {
    public ListNode rotateRight(ListNode head, int k){
    if(head==null || head.next==null) 
    return head;
    ListNode temp=head;
    int len=0;
    while(temp!=null){
        temp=temp.next;
        len++;
    }
    k=k%len;
    if(k==0) return head;
    ListNode slow=head;
    ListNode fast=head;  
    for(int i=0; i<k; i++){
        fast=fast.next;
    }
    while(fast.next!=null){
        slow=slow.next;
        fast=fast.next;
    }
    ListNode newhead=slow.next;
    slow.next=null;
    fast.next=head;
    return newhead;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna