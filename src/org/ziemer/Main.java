package org.ziemer;

public class Main {

    public static void main(String[] args) {
	    Tree decisionTree = new Tree();
	    decisionTree.buildTree();

        System.out.println(decisionTree.decide(1, 0, 1, 1));
    }
}
