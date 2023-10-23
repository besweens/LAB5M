public abstract class BinarySearchTree<Integer> {
    /**
     * Binary Tree class for Lab5M
     * Utilizing nodes, binary trees can be built with a root and pointers for
     * left and right children. Integer data is stored within the node.
     *
     * @author Sweeney
     * @version 20231016
     */

    //root is the top level of our binary tree
    protected Node<Integer> root;

    private  int size;

    /**
     *Constructor for BinaryTree objects
     */
    public BinarySearchTree(){
        root = null;
        size = 0;
    }

    public abstract boolean add(int data);
    public int getSize() {return size;}

    /**
     * Internal class to build nodes for our binary tree.
     * @param <Integer> nodes of type Integer
     *
     */
    protected static class Node<Integer>{
        Integer data;
        Node<Integer> left;
        Node<Integer> right;

        /**
         * Builder for nodes
         * @param data
         */
        public Node(Integer data) {
            this.data = data;
            left = null;
            right = null;
        }


    }
}


