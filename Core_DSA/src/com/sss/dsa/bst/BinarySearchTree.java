package com.sss.dsa.bst;

public class BinarySearchTree {
    private class Node{
        private int value;
        private Node leftChild;
        private Node rightChild;

        public Node(int value) {
            this.value = value;
        }
        @Override
        public String toString(){
            return "Node = "+value;
        }
    }
    private Node root;//This represents the Root Node of the BST

    /**
     *Implementation of inserting elements to the tree
     */
    public void insertElement(int value){
        if(root == null){
            root = new Node(value);
            return;
        }
        Node currentNode = root; // currentNode will be used for the traversal of the Nodes in the tree
        while (true){
            //Left Subtree Implementation
            /**
             * If the value to be inserted is less than the root node, then keep searching for the insertion place in left side of the tree
             */
            if(value < currentNode.value){
                // if currentNode.leftChild == null ,  then do insert the element there itself and break.Because there are no elements to be traversed further.
                if(currentNode.leftChild == null){
                    currentNode.leftChild = new Node(value);
                    break;
                }
                currentNode = currentNode.leftChild;
            } //Right Subtree Implementation
            /**
             * If the value to be inserted is greater than the root node, then keep searching for the insertion place in right side of the tree
             */
            else if (value > currentNode.value) {
                // if currentNode.rightChild == null ,  then do insert the element there itself and break.Because there are no elements to be traversed further.
                if(currentNode.rightChild == null){
                    currentNode.rightChild = new Node(value);
                    break;
                }
                currentNode = currentNode.rightChild;
            }
        }
    }

    /**
     *Implementation of finding elements in the tree
     */
    public boolean find(int value){
        Node currentNode = root;
        while (currentNode != null){ // Here while condition doesn't work with an infinite loop. Because we have a chance of the value to be not present in the tree.
            if(value < currentNode.value){
                currentNode = currentNode.leftChild;
            } else if (value > currentNode.value) {
                currentNode = currentNode.rightChild;
            }else {
                return true;
            }
        }
        return false;
    }
}
