class Solution {
    public void preorder(TreeNode root,ArrayList<Integer> al){
    if(root==null)
    return;
    al.add(root.val);
    preorder(root.left,al);
    preorder(root.right,al);
    }
    public List<Integer> preorderTraversal(TreeNode root) {
    ArrayList<Integer> al = new ArrayList<>();
    preorder(root,al);   
    return al;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna