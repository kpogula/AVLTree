package avl;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class AvlTreeTest {

    public static boolean debug = false;

    @Test
    public void test01() {
        AvlTree AvlTree = new AvlTree();
        java.lang.Class<?> avlTreeClass = AvlTree.getClass();
        org.junit.Assert.assertNotNull(avlTreeClass);
    }

    @Test
    public void test02() {
        AvlTree AvlTree = new AvlTree();
        AvlTree.insert(19);
        AvlTree.insert(15);
        AvlTree.insert(17);
        AvlTree.delete(19);
        assertNull(AvlTree.find(19));
    }

    @Test
    public void test03() {
        AvlTree AvlTree = new AvlTree();
        AvlTree.Node node2 = AvlTree.find((int) '4');
        AvlTree.delete((int) 'a');
        java.lang.Class<?> wildcardClass5 = AvlTree.getClass();
        assertNull(node2);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test04() {
        AvlTree AvlTree = new AvlTree();
        AvlTree.Node node2 = AvlTree.find((int) '4');
        AvlTree.Node node3 = AvlTree.getRoot();
        AvlTree.delete(100);
        java.lang.Class<?> wildcardClass6 = AvlTree.getClass();
        assertNull(node2);
        assertNull(node3);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }


    @Test
    public void test05() {
        AvlTree AvlTree = new AvlTree();
        AvlTree.Node node1 = null;
        int int2 = AvlTree.getBalance(node1);
        AvlTree.insert((int) (byte) 100);
        AvlTree.insert((int) 'a');
        AvlTree.Node node7 = AvlTree.getRoot();
        // The following exception was thrown during execution in test generation
        try {
            AvlTree.insert((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: duplicate Key!");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(node7);
    }

    @Test
    public void test06() {
        AvlTree AvlTree = new AvlTree();
        AvlTree.Node node2 = AvlTree.find((int) '4');
        AvlTree.Node node3 = null;
        int int4 = AvlTree.getBalance(node3);
        AvlTree.insert((int) '4');
        AvlTree.Node node8 = AvlTree.find((int) (short) 0);
        AvlTree.delete(100);
        assertNull(node2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        assertNull(node8);
    }

    @Test
    public void test07() {
        AvlTree AvlTree = new AvlTree();
        AvlTree.Node node2 = AvlTree.find((int) '4');
        AvlTree.Node node3 = AvlTree.getRoot();
        AvlTree.insert((int) (byte) 100);
        AvlTree AvlTree6 = new AvlTree();
        AvlTree.Node node8 = AvlTree6.find((int) '4');
        AvlTree.Node node9 = null;
        int int10 = AvlTree6.getBalance(node9);
        AvlTree6.insert((int) (short) 100);
        AvlTree.Node node14 = AvlTree6.find((int) ' ');
        int int15 = AvlTree6.height();
        AvlTree.Node node16 = AvlTree6.getRoot();
        int int17 = AvlTree.getBalance(node16);
        java.lang.Class<?> wildcardClass18 = AvlTree.getClass();
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
        AvlTree AvlTree = new AvlTree();
        AvlTree.Node node1 = null;
        int int2 = AvlTree.getBalance(node1);
        AvlTree.insert((int) (byte) 100);
        AvlTree.delete((int) '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test09() {
        AvlTree AvlTree = new AvlTree();
        AvlTree.insert(15);
        AvlTree.insert(17);
        AvlTree.insert(22);
        AvlTree.delete(22);
        assertNull(AvlTree.find(22));
    }

    @Test
    public void test10() {
        AvlTree AvlTree = new AvlTree();
        AvlTree.insert(15);
        AvlTree.insert(12);
        AvlTree.insert(22);
        AvlTree.delete(15);
        assertNull(AvlTree.find(15));
    }

    @Test
    public void test11() {
        AvlTree AvlTree = new AvlTree();
        AvlTree.insert(5);
        AvlTree.insert(3);
        AvlTree.insert(8);
        AvlTree.insert(6);
        AvlTree.delete(8);

        assertNull(AvlTree.find(8));

    }



}

