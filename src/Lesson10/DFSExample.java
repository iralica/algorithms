package Lesson10;

public class DFSExample {
 /*       Deep First Search DFS

                   1
                  /   \
                2       3
               /  \    /  \
              4    5   6    7
   */
 public static void main(String[] args) {
     TreeNode root = new TreeNode(1);
     TreeNode left = new TreeNode(2);
     TreeNode right = new TreeNode(3);
     root.setLeft(left);
     root.setRight(right);
     TreeNode l1 = new TreeNode(4);
     TreeNode r1 = new TreeNode(5);
     left.setLeft(l1);
     left.setRight(r1);
     TreeNode l2 = new TreeNode(6);
     TreeNode r2 = new TreeNode(7);
     right.setLeft(l2);
     right.setRight(r2);
 }


}
