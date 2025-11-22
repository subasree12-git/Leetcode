class Solution 
{
    public List<String> binaryTreePaths(TreeNode root) 
    {
        List<String> d=new ArrayList<>();
        leaf(d,root,"");
        return d;
    }
    static void leaf(List<String> d,TreeNode root,String s)
    {
        if(root==null)
           return;
        if(root.left==null&&root.right==null)
        {
            s+=Integer.toString(root.val);
            d.add(s);
        }
        else
        {
            s+=Integer.toString(root.val)+"->";
            leaf(d,root.left,s);
            leaf(d,root.right,s);
        }
    }
}