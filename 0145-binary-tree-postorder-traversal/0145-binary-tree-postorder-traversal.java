class Solution {
    public void postorder(TreeNode root,ArrayList<Integer> al){
    if(root==null)
    return;
    postorder(root.left,al);
    postorder(root.right,al);
    al.add(root.val);
    }
    public List<Integer> postorderTraversal(TreeNode root) {
    ArrayList<Integer> al = new ArrayList<>();
    postorder(root,al);   
    return al;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna