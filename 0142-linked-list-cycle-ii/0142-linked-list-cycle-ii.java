public class Solution {
    public ListNode detectCycle(ListNode head) {
    HashSet<ListNode> set = new HashSet<>();
    while(head!=null){
        if(set.contains(head))
           return head;
        set.add(head);
        head=head.next;
    }
    return null;    
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna