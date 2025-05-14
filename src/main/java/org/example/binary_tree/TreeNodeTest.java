package org.example.binary_tree;

public class TreeNodeTest {
    public static void main(String[] args) {
        TreeNode n1 = new TreeNode(1);
        TreeNode n2 = new TreeNode(2);
        TreeNode n3 = new TreeNode(3);
        TreeNode n4 = new TreeNode(4);
        TreeNode n5 = new TreeNode(5);
        n1.left = n2;
        n1.right = n3;
        n2.left = n4;
        n2.right = n5;
        TreeNode P = new TreeNode(0);
        //在n1左节点插入节点P
        n1.left = P;
        P.left = n2;
        //删除P节点
        n1.left = n2;
        //完美二叉树（perfect binary tree）：所有层被填满，所有叶子节点的度为0，其它节点的度为2，树的高度为h，节点个数为2^(h+1)-1
        //完全二叉树（complete binary tree）：只允许最底层节点不完全填满，最底层从左到右填充。
        //完满二叉树（full binary tree）：除了叶子节点度数为0外，其余节的度都为2。
        //平衡二叉树（balanced binary tree）：任意节点的左子树和右子树高度差不超过1
        
    }
}
