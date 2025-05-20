package org.example.binary_tree;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class TreeNode {
    int val;
    int height; //节点高度:该节点离叶子节点的最远距离，叶子节点高度为0，空节点高度为-1
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
    }


    /* 层序遍历  从上到下从左到右遍历*/
    /*本质上是广度优先（breadth first search）遍历*/
    List<Integer> levelOrder(TreeNode root) {
        // 初始化队列，加入根节点
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        // 初始化一个列表，用于保存遍历序列
        List<Integer> list = new ArrayList<>();
        while (!queue.isEmpty()) {
            TreeNode node = queue.poll(); // 队列出队
            list.add(node.val);           // 保存节点值
            if (node.left != null)
                queue.offer(node.left);   // 左子节点入队
            if (node.right != null)
                queue.offer(node.right);  // 右子节点入队
        }
        return list;
    }

    //先序遍历：中左右；中序遍历：左中右；后序遍历：左右中
    //这三种属于深度遍历（depth first search）可以用递归和迭代实现
    //递归实现
    List<Integer> list = new ArrayList<>();

    /*前序遍历*/
    void preOrder(TreeNode root) {
        if (root == null) {
            return;
        }
        list.add(root.val);
        preOrder(root.left);
        preOrder(root.right);
    }

    /*中序遍历*/
    void inOrder(TreeNode root) {
        if (root == null) {
            return;
        }
        inOrder(root.left);
        list.add(root.val);
        inOrder(root.right);
    }

    /*后序遍历*/
    void postOrder(TreeNode root) {
        if (root == null) {
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        list.add(root.val);
    }

}
