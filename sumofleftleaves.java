import java.util.*;
public class sumofleftleaves
{
	 public static class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }
    public static int sumOfLeftLeaves(TreeNode root) {
        int ans=0;
if(root==null) return 0;
    if (root.left != null) {
      if (root.left.left == null && root.left.right == null)
        ans += root.left.val;
      else
        ans += sumOfLeftLeaves(root.left);
    }
    ans += sumOfLeftLeaves(root.right);

    return ans;
  }
  	public static void main(String[] args) {
  	     TreeNode root = new TreeNode(3);
  	     //[3,9,20,null,null,15,7]
    root.left = new TreeNode(9);
    root.right = new TreeNode(20);
    root.right.left = new TreeNode(15);
    root.right.right = new TreeNode(7);
   
  	  System.out.print(sumOfLeftLeaves(root));
}
 	}
