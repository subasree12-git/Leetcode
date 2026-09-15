class Solution
{
    public List<Integer> inorderTraversal(TreeNode root)
    {
        ArrayList<Integer> list = new ArrayList<>();
        help(root,list);
        return list;
    }
    public void help(TreeNode root,ArrayList<Integer> list)
    {
        if(root==null)
        {
            return;
        }
        help(root.left,list);
        list.add(root.val);
        help(root.right,list);
    }
}