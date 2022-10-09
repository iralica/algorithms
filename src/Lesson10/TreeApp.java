package Lesson10;

import java.util.LinkedList;
import java.util.Queue;

public class TreeApp {
    /*
         Breadth First Search BFS
           1
          /  \
        2      3
       / \    / \
     4    5  6   7
       обойти это дерево используя поиск в ширину
       соберем значения всех вершин
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

    private void traverseTree(TreeNode root) {
        if (root == null){  //дерево не пустое
            return;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        // add root to queue
        queue.offer(root);
        while (!queue.isEmpty()){
            int size = queue.size();
            for (int i =0; i < size; i++){
                TreeNode node = queue.poll();
                System.out.println(node.getValue() + " ");
                if (node.getLeft() != null){
                queue.offer(node.getLeft());}
                if (node.getRight() != null){
                    queue.offer(node.getRight());}
            }
        }
    }

}
