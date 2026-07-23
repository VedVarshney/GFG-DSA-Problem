class Solution {
    public void inorder(TreeNode root,ArrayList<Integer> al){
    if(root==null)
    return;
    inorder(root.left,al);
    al.add(root.val);
    inorder(root.right,al);
    }
    public List<Integer> inorderTraversal(TreeNode root) {
    ArrayList<Integer> al = new ArrayList<>();
    inorder(root,al);   
    return al;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna