package cn.rocker.tree.bst;

/**
 * 二分搜索树
 * @author rocker
 * @date 2019/01/26 19:55
 * @since V1.0
 */
public class BinarySearchTree<E extends Comparable<E>> {

    private class Node{
        public E e;
        public Node left,right;


        public Node(E e){
            this.e = e;
            left = null;
            right = null;
        }
    }

    private Node root;
    private int size;

    public BinarySearchTree(){
        root = null;
        size = 0;
    }

    public int size(){
        return size;
    }

    public boolean isEmpty(){
        return size == 0;
    }

    //原始版，向二分搜索树添加新的元素
    public void oldAdd(E e){
        if(root == null){
            root = new Node(e);
            size ++;
        }else{
            newAdd(root, e);
        }
    }


    //改良版，向二分搜索树添加新的元素
    public void newAdd(E e){
        root = newAdd(root, e);
    }


    //原始版， 向以node为根的二分搜索树添加元素e，使用递归算法
    private void oldAdd(Node node, E e){
        if(e.equals(node.e)){
            return;
        }else if(e.compareTo(node.e) < 0 && node.left == null){
            node.left = new Node(e);
            size++;
            return;
        }else if(e.compareTo(node.e) > 0 && node.right == null){
            node.right = new Node(e);
            size++;
            return;
        }

        if(e.compareTo(node.e) < 0)
            oldAdd(node.left, e);
        else
            oldAdd(node.right, e);
    }


    //改良版， 向以node为根的二分搜索树添加元素e，使用递归算法
    //返回插入新节点后二分搜索树的根
    private Node newAdd(Node node, E e){

        if(node == null){
            size ++;
            return new Node(e);
        }

        if(e.compareTo(node.e) < 0)
            node.left = newAdd(node.left, e);
        else if(e.compareTo(node.e) > 0)
            node.right = newAdd(node.right, e);

        return node;
    }


    //查看二分搜索树是否包含元素
    public boolean contains(E e){
        return contains(root, e);
    }

    //查看以node为根的二分搜索树是否包含元素e，递归算法
    private boolean contains(Node node, E e){
        if(node == null)
            return false;

        if(e.equals(node.e))
            return true;
        else if(e.compareTo(node.e) < 0)
            return contains(node.left, e);
        else //e.compareTo(node.e) > 0
            return contains(node.right, e);
    }


    //二分搜索树的前序遍历
    public void preOrder(){
        preOrder(root);
    }

    //前序遍历以node为根的二分搜索树，递归算法
    private void preOrder(Node node){
        if(node == null)
            return;

        System.out.println(node.e);
        preOrder(node.left);
        preOrder(node.right);
    }
}
