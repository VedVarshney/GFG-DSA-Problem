class Solution {
    public ListNode swapNodes(ListNode head, int k) {
    int len=0;
    ListNode temp=head;
    while(temp!=null){
        temp=temp.next;
        len++;
    }    
    temp=head;
    for(int i=0; i<k-1; i++){
       temp=temp.next;
    }
    ListNode x=head;
    for(int i=0; i<len-k; i++){
       x=x.next;
    }
    int y=temp.val;
    temp.val=x.val;
    x.val=y;
    return head;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna