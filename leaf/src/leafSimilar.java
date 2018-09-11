//  Definition for a binary tree node.

 
 
class Solution {
    class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
     }
     
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        //int[] arr1=new int[];
        //int[] arr2=new int[];
        //while()
        //arr1=Displeaf(TreeNode root1);
        //arr2=Displeaf(TreeNode root2);
        //Displeaf(TreeNode root1);//System.out.print();
        int left=9;//Displeaf(TreeNode root1,TreeNode root2);
        System.out.print(left);
        Displeaf(TreeNode root1);
        return true;

    
}
    
    
    public int Displeaf(TreeNode b){   
    
	if (b!=null) 
	{
		if (b.left==null&& b.right==null) 
		System.out.print(b.val);
        //return b.val;
		Displeaf(b.left);		
		Displeaf(b.right);		
	}
        
    }


}