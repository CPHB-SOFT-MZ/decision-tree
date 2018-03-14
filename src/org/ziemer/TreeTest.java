package org.ziemer;

import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class TreeTest {

    public TreeTest() {
    }

    private Tree decisionTree;

    @Before
    public void setUp() {
        decisionTree = new Tree();
        decisionTree.buildTree();
    }

    @Test
    public void decide() {
        String pass = "You should be able to pass the exam";
        String fail = "You could easily fail the exam";

        String res1 = decisionTree.decide(0, 1, 1, 1);
        Assert.assertEquals(fail, res1);

        String res2 = decisionTree.decide(1, 0, 1, 1);
        Assert.assertEquals(pass, res2);

        String res3 = decisionTree.decide(1, 0, 0, 1);
        Assert.assertEquals(fail, res3);

        String res4 = decisionTree.decide(1, 1, 1, 1);
        Assert.assertEquals(pass, res4);

        String res5 = decisionTree.decide(1, 1, 0, 1);
        Assert.assertEquals(pass, res5);

        String res6 = decisionTree.decide(1, 1, 0, 0);
        Assert.assertEquals(fail, res6);
    }

}