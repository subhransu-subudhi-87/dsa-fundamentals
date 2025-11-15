package com.sss.dsa.bst;

public class BSTMain {
    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();
        bst.insertElement(7);
        bst.insertElement(4);
        bst.insertElement(9);
        bst.insertElement(1);
        bst.insertElement(6);
        bst.insertElement(8);
        bst.insertElement(10);
        System.out.println("Insertion Done!!");
        System.out.println( "Is the value 1 Available in the BST : "+bst.find(1));
        System.out.println( "Is the value 10 Available in the BST : "+bst.find(10));
        System.out.println( "Is the value 13 Available in the BST : "+bst.find(13));
    }
}
