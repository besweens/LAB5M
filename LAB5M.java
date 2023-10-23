/**
 * LAB5M
 *
 * Project Manager: Ben Sweeney
 * Subtask 1: Herve
 * Subtask 2: Zachary
 * Subtask 3: Audrey
 *
 * Create myBinarySearchTree, myTreeIterator, TreeIteratorTesting objects
 * Pass the first two objects to the TreeIteratorTesting constructor
 * Print the average and the sum values
 */

import java.io.IOException;

public class LAB5M {
    public static void main(String[] args) throws IOException {

        myBinarySearchTree testTree = new myBinarySearchTree();
        myTreeIterator testIter = new myTreeIterator();
        TreeIteratorTesting testObj = new TreeIteratorTesting(myBinarySearchTree, myTreeIterator);

        System.out.println("Lab 5M output\n");
        System.out.println("Tree average: " + testObj.average());
        System.out.println("Tree max: " + testObj.max());


    }
}
