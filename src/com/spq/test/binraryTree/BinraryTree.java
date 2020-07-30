package com.spq.test.binraryTree;



/**
 * Created by SPQ on 2019/3/9.
 */
public class BinraryTree {
    private Node root;

    public BinraryTree(Node root) {
        this.root = root;
    }

    public Node getRoot() {
        return root;
    }

    public void setRoot(Node root) {
        this.root = root;
    }

    public static  class Node{
        private int data;

        private Node left;

        private Node right;

        public Node(int data, Node left, Node right) {
            this.data = data;
            this.left = left;
            this.right = right;
        }

        public int getData() {
            return data;
        }

        public void setData(int data) {
            this.data = data;
        }

        public Node getLeft() {
            return left;
        }

        public void setLeft(Node left) {
            this.left = left;
        }

        public Node getRight() {
            return right;
        }

        public void setRight(Node right) {
            this.right = right;
        }
    }

    /**
     * 获取树的高度
     */
    public int getHeight(){
        return getHeight(root);
    }

    private int getHeight(Node root) {
        if (root == null){
            return 0;
        }
        int leftHeight = getHeight(root.getLeft());
        int rightHeight = getHeight(root.getRight());
        return (leftHeight < rightHeight) ? (rightHeight + 1) : (leftHeight + 1);
    }

    /**
     * 获取树的节点个数
     */

    public int getNum(){
        return getNum(root);
    }

    private int getNum(Node root) {
        if (root == null)
            return 0;
        int i = getNum(root.getLeft());
        int j = getNum(root.getRight());
        return i+j+1;
    }

}
