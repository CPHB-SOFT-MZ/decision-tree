package org.ziemer;

import java.util.Arrays;

public class Tree {
    private Node root;

    public Tree(Node root) {
        this.root = root;
    }

    public Tree() {
    }

    public String decide(int... args) {
        return decide(root, 0, args).getValue();
    }

    private Node decide(Node root, int index, int... args) {
        if (root.getLeft() == null && root.getRight() == null) {
            return root;
        }

        if (args[index] == 0) {
            return decide(root.getRight(), ++index, args);
        } else {
            return decide(root.getLeft(), ++index, args);
        }
    }

    public void buildTree() {
        this.root = new Node("Hand ins made in time?");
        Node rootLeft = new Node("Read textbook?");
        Node rootLeftLeft = new Node("Attend lectures?");
        Node rootLeftRight = new Node("Attend lectures?");
        Node rootLeftLeftRight = new Node("Made exercises?");

        Node failDecision = new Node("You could easily fail the exam");
        Node passDecision = new Node("You should be able to pass the exam");

        this.root.setRight(failDecision);

        rootLeftLeftRight.setRight(failDecision);
        rootLeftLeftRight.setLeft(passDecision);

        rootLeftRight.setRight(failDecision);
        rootLeftRight.setLeft(passDecision);

        rootLeftLeft.setRight(rootLeftLeftRight);
        rootLeftLeft.setLeft(passDecision);

        rootLeft.setLeft(rootLeftLeft);
        rootLeft.setRight(rootLeftRight);
        this.root.setLeft(rootLeft);
    }
}
