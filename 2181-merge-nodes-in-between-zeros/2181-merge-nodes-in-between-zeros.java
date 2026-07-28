class Solution {
    public ListNode mergeNodes(ListNode head) {
    ListNode d=new ListNode(-1);
    ListNode a=d;
    ListNode t=head.next;
    int sum=0;
    while(t!=null){
        if(t.val==0){
        a.next=new ListNode(sum);
        a=a.next;
        sum=0;
        }else{
        sum+=t.val; 
        }
        t=t.next;
    } 
    return d.next;   
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna