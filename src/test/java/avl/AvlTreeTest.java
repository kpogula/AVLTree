package avl;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class AvlTreeTest {

    public static boolean debug = false;

    @Test
    public void test01() {
        AvlTree AvlTree0 = new AvlTree();
        java.lang.Class<?> wildcardClass1 = AvlTree0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test02() {
        AvlTree avlTree = new AvlTree();
        avlTree.insert(19);
        avlTree.insert(15);
        avlTree.insert(17);
        avlTree.delete(19);
        assertNull(avlTree.find(19));
    }

    @Test
    public void test03() {
        AvlTree AvlTree0 = new AvlTree();
        AvlTree.Node node2 = AvlTree0.find((int) '4');
        AvlTree0.delete((int) 'a');
        java.lang.Class<?> wildcardClass5 = AvlTree0.getClass();
        assertNull(node2);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test04() {
        AvlTree AvlTree0 = new AvlTree();
        AvlTree.Node node2 = AvlTree0.find((int) '4');
        AvlTree.Node node3 = AvlTree0.getRoot();
        AvlTree0.delete(100);
        java.lang.Class<?> wildcardClass6 = AvlTree0.getClass();
        assertNull(node2);
        assertNull(node3);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }


    @Test
    public void test05() {
        AvlTree AvlTree0 = new AvlTree();
        AvlTree.Node node1 = null;
        int int2 = AvlTree0.getBalance(node1);
        AvlTree0.insert((int) (byte) 100);
        AvlTree0.insert((int) 'a');
        AvlTree.Node node7 = AvlTree0.getRoot();
        // The following exception was thrown during execution in test generation
        try {
            AvlTree0.insert((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: duplicate Key!");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(node7);
    }

    @Test
    public void test06() {
        AvlTree AvlTree0 = new AvlTree();
        AvlTree.Node node2 = AvlTree0.find((int) '4');
        AvlTree.Node node3 = null;
        int int4 = AvlTree0.getBalance(node3);
        AvlTree0.insert((int) '4');
        AvlTree.Node node8 = AvlTree0.find((int) (short) 0);
        AvlTree0.delete(100);
        assertNull(node2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        assertNull(node8);
    }

    @Test
    public void test07() {
        AvlTree AvlTree0 = new AvlTree();
        AvlTree.Node node2 = AvlTree0.find((int) '4');
        AvlTree.Node node3 = AvlTree0.getRoot();
        AvlTree0.insert((int) (byte) 100);
        AvlTree AvlTree6 = new AvlTree();
        AvlTree.Node node8 = AvlTree6.find((int) '4');
        AvlTree.Node node9 = null;
        int int10 = AvlTree6.getBalance(node9);
        AvlTree6.insert((int) (short) 100);
        AvlTree.Node node14 = AvlTree6.find((int) ' ');
        int int15 = AvlTree6.height();
        AvlTree.Node node16 = AvlTree6.getRoot();
        int int17 = AvlTree0.getBalance(node16);
        java.lang.Class<?> wildcardClass18 = AvlTree0.getClass();
        assertNull(node2);
        assertNull(node3);
        assertNull(node8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        assertNull(node14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test08() {
        AvlTree AvlTree0 = new AvlTree();
        AvlTree.Node node1 = null;
        int int2 = AvlTree0.getBalance(node1);
        AvlTree0.insert((int) (byte) 100);
        AvlTree0.delete((int) '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test09() {
        AvlTree avlTree = new AvlTree();
        avlTree.insert(15);
        avlTree.insert(17);
        avlTree.insert(22);
        avlTree.delete(22);
        assertNull(avlTree.find(22));
    }

    @Test
    public void test10() {
        AvlTree avlTree = new AvlTree();
        avlTree.insert(15);
        avlTree.insert(12);
        avlTree.insert(22);
        avlTree.delete(15);
        assertNull(avlTree.find(15));
    }
}

