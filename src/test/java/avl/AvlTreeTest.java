package avl;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class AvlTreeTest {

    public static boolean debug = false;

    @Test
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test01");
        AvlTree AvlTree0 = new AvlTree();
        java.lang.Class<?> wildcardClass1 = AvlTree0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test02");
        AvlTree AvlTree0 = new AvlTree();
        AvlTree.Node node1 = null;
        int int2 = AvlTree0.getBalance(node1);
        java.lang.Class<?> wildcardClass3 = AvlTree0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test03");
        AvlTree AvlTree0 = new AvlTree();
        AvlTree.Node node2 = AvlTree0.find((int) '4');
        AvlTree0.delete((int) 'a');
        java.lang.Class<?> wildcardClass5 = AvlTree0.getClass();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test04");
        AvlTree AvlTree0 = new AvlTree();
        AvlTree.Node node2 = AvlTree0.find((int) '4');
        AvlTree.Node node3 = AvlTree0.getRoot();
        AvlTree0.delete(100);
        java.lang.Class<?> wildcardClass6 = AvlTree0.getClass();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test05");
        AvlTree AvlTree0 = new AvlTree();
        AvlTree.Node node2 = AvlTree0.find((int) '4');
        AvlTree0.delete((int) 'a');
        AvlTree.Node node5 = AvlTree0.getRoot();
        AvlTree0.delete(0);
        AvlTree.Node node8 = null;
        int int9 = AvlTree0.getBalance(node8);
        AvlTree.Node node10 = AvlTree0.getRoot();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(node10);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test06");
        AvlTree AvlTree0 = new AvlTree();
        AvlTree.Node node2 = AvlTree0.find((int) '4');
        AvlTree.Node node3 = null;
        int int4 = AvlTree0.getBalance(node3);
        java.lang.Class<?> wildcardClass5 = AvlTree0.getClass();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test07");
        AvlTree AvlTree0 = new AvlTree();
        AvlTree.Node node2 = AvlTree0.find((int) '4');
        AvlTree.Node node3 = AvlTree0.getRoot();
        AvlTree.Node node4 = AvlTree0.getRoot();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNull(node4);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test08");
        AvlTree AvlTree0 = new AvlTree();
        AvlTree.Node node2 = AvlTree0.find((int) '4');
        AvlTree0.delete((int) 'a');
        AvlTree0.delete(1);
        AvlTree.Node node7 = AvlTree0.getRoot();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node7);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test09");
        AvlTree AvlTree0 = new AvlTree();
        AvlTree.Node node2 = AvlTree0.find((-1));
        int int3 = AvlTree0.height();
        AvlTree.Node node4 = AvlTree0.getRoot();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(node4);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test10");
        AvlTree AvlTree0 = new AvlTree();
        AvlTree.Node node2 = AvlTree0.find((int) '4');
        AvlTree.Node node4 = AvlTree0.find((int) 'a');
        AvlTree0.delete((int) (short) 10);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node4);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test11");
        AvlTree AvlTree0 = new AvlTree();
        AvlTree.Node node2 = AvlTree0.find((int) '4');
        AvlTree.Node node3 = null;
        int int4 = AvlTree0.getBalance(node3);
        AvlTree0.insert((int) (short) 100);
        java.lang.Class<?> wildcardClass7 = AvlTree0.getClass();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test12");
        AvlTree AvlTree0 = new AvlTree();
        AvlTree.Node node2 = AvlTree0.find((int) '4');
        AvlTree.Node node3 = AvlTree0.getRoot();
        AvlTree0.delete(100);
        AvlTree0.insert((int) (byte) 10);
        java.lang.Class<?> wildcardClass8 = AvlTree0.getClass();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test13");
        AvlTree AvlTree0 = new AvlTree();
        AvlTree.Node node2 = AvlTree0.find((int) '4');
        AvlTree0.delete((int) 'a');
        AvlTree.Node node5 = AvlTree0.getRoot();
        AvlTree0.delete(0);
        AvlTree.Node node8 = null;
        int int9 = AvlTree0.getBalance(node8);
        AvlTree.Node node10 = null;
        int int11 = AvlTree0.getBalance(node10);
        AvlTree0.delete((int) (short) 0);
        java.lang.Class<?> wildcardClass14 = AvlTree0.getClass();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test14");
        AvlTree AvlTree0 = new AvlTree();
        AvlTree.Node node2 = AvlTree0.find((int) '4');
        AvlTree0.delete((int) 'a');
        AvlTree.Node node5 = AvlTree0.getRoot();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass6 = node5.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node5);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test15");
        AvlTree AvlTree0 = new AvlTree();
        AvlTree.Node node2 = AvlTree0.find((int) '4');
        AvlTree.Node node4 = AvlTree0.find((int) 'a');
        AvlTree.Node node6 = AvlTree0.find((int) ' ');
        AvlTree.Node node8 = AvlTree0.find((int) '#');
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(node8);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test16");
        AvlTree AvlTree0 = new AvlTree();
        AvlTree.Node node2 = AvlTree0.find((int) '4');
        AvlTree0.insert((int) (short) 0);
        org.junit.Assert.assertNull(node2);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test17");
        AvlTree AvlTree0 = new AvlTree();
        AvlTree.Node node2 = AvlTree0.find((int) '4');
        AvlTree0.delete((int) 'a');
        AvlTree.Node node5 = AvlTree0.getRoot();
        AvlTree.Node node6 = AvlTree0.getRoot();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node6);
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test18");
        AvlTree AvlTree0 = new AvlTree();
        AvlTree.Node node2 = AvlTree0.find((int) '4');
        AvlTree.Node node4 = AvlTree0.find((int) 'a');
        int int5 = AvlTree0.height();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test19");
        AvlTree AvlTree0 = new AvlTree();
        AvlTree.Node node2 = AvlTree0.find((int) '4');
        AvlTree.Node node4 = AvlTree0.find((int) 'a');
        AvlTree0.insert((int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            AvlTree0.insert((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: duplicate Key!");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node4);
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test20");
        AvlTree AvlTree0 = new AvlTree();
        AvlTree.Node node2 = AvlTree0.find((int) '4');
        AvlTree.Node node4 = AvlTree0.find((int) 'a');
        AvlTree.Node node6 = AvlTree0.find((int) ' ');
        AvlTree0.delete((int) '4');
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(node6);
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test21");
        AvlTree AvlTree0 = new AvlTree();
        AvlTree.Node node2 = AvlTree0.find((int) '4');
        AvlTree.Node node3 = AvlTree0.getRoot();
        AvlTree0.delete(100);
        AvlTree0.delete(0);
        AvlTree.Node node8 = AvlTree0.getRoot();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNull(node8);
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test22");
        AvlTree AvlTree0 = new AvlTree();
        AvlTree0.delete((int) (byte) -1);
        java.lang.Class<?> wildcardClass3 = AvlTree0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test23");
        AvlTree AvlTree0 = new AvlTree();
        AvlTree.Node node2 = AvlTree0.find((int) '4');
        AvlTree0.delete((int) 'a');
        AvlTree.Node node5 = AvlTree0.getRoot();
        AvlTree0.delete(0);
        AvlTree.Node node8 = null;
        int int9 = AvlTree0.getBalance(node8);
        int int10 = AvlTree0.height();
        AvlTree0.delete(100);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test24");
        AvlTree AvlTree0 = new AvlTree();
        AvlTree.Node node2 = AvlTree0.find((int) '4');
        AvlTree0.delete((int) 'a');
        AvlTree0.insert((int) (short) 1);
        org.junit.Assert.assertNull(node2);
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test25");
        AvlTree AvlTree0 = new AvlTree();
        AvlTree.Node node2 = AvlTree0.find((int) '4');
        AvlTree.Node node3 = AvlTree0.getRoot();
        AvlTree0.insert((int) (byte) 100);
        int int6 = AvlTree0.height();
        java.lang.Class<?> wildcardClass7 = AvlTree0.getClass();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test26");
        AvlTree AvlTree0 = new AvlTree();
        AvlTree.Node node1 = null;
        int int2 = AvlTree0.getBalance(node1);
        AvlTree AvlTree3 = new AvlTree();
        AvlTree.Node node5 = AvlTree3.find((int) '4');
        AvlTree.Node node6 = null;
        int int7 = AvlTree3.getBalance(node6);
        AvlTree3.insert((int) (short) 100);
        AvlTree.Node node11 = AvlTree3.find((int) ' ');
        int int12 = AvlTree3.height();
        AvlTree.Node node13 = AvlTree3.getRoot();
        int int14 = AvlTree0.getBalance(node13);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test27");
        AvlTree AvlTree0 = new AvlTree();
        AvlTree.Node node2 = AvlTree0.find((int) '4');
        AvlTree0.delete((int) 'a');
        AvlTree0.delete(1);
        AvlTree0.delete((int) '#');
        AvlTree0.delete((int) (short) -1);
        org.junit.Assert.assertNull(node2);
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test28");
        AvlTree AvlTree0 = new AvlTree();
        AvlTree.Node node2 = AvlTree0.find((int) '4');
        AvlTree.Node node3 = AvlTree0.getRoot();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass4 = node3.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node3);
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test29");
        AvlTree AvlTree0 = new AvlTree();
        AvlTree.Node node2 = AvlTree0.find((int) '4');
        AvlTree.Node node3 = null;
        int int4 = AvlTree0.getBalance(node3);
        AvlTree0.insert((int) (short) 100);
        AvlTree.Node node8 = AvlTree0.find((int) ' ');
        int int9 = AvlTree0.height();
        AvlTree0.delete(0);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test30");
        AvlTree AvlTree0 = new AvlTree();
        AvlTree.Node node2 = AvlTree0.find((int) '4');
        AvlTree.Node node3 = AvlTree0.getRoot();
        AvlTree0.delete(100);
        AvlTree0.insert((int) (byte) 10);
        AvlTree.Node node8 = AvlTree0.getRoot();
        AvlTree0.delete(100);
        java.lang.Class<?> wildcardClass11 = AvlTree0.getClass();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test31");
        AvlTree AvlTree0 = new AvlTree();
        AvlTree.Node node1 = null;
        int int2 = AvlTree0.getBalance(node1);
        AvlTree0.insert((int) (byte) 100);
        AvlTree0.insert((int) 'a');
        AvlTree.Node node8 = AvlTree0.find((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(node8);
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test32");
        AvlTree AvlTree0 = new AvlTree();
        AvlTree.Node node2 = AvlTree0.find((int) '4');
        AvlTree.Node node3 = null;
        int int4 = AvlTree0.getBalance(node3);
        AvlTree0.insert((int) (short) 100);
        AvlTree.Node node8 = AvlTree0.find((int) ' ');
        int int9 = AvlTree0.height();
        AvlTree0.insert((int) 'a');
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test33");
        AvlTree AvlTree0 = new AvlTree();
        AvlTree.Node node1 = AvlTree0.getRoot();
        int int2 = AvlTree0.height();
        org.junit.Assert.assertNull(node1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test34");
        AvlTree AvlTree0 = new AvlTree();
        AvlTree.Node node2 = AvlTree0.find((int) '4');
        AvlTree0.delete((int) 'a');
        AvlTree.Node node5 = AvlTree0.getRoot();
        AvlTree.Node node6 = null;
        int int7 = AvlTree0.getBalance(node6);
        AvlTree.Node node9 = AvlTree0.find((int) ' ');
        int int10 = AvlTree0.height();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test35");
        AvlTree AvlTree0 = new AvlTree();
        AvlTree.Node node2 = AvlTree0.find((int) '4');
        AvlTree.Node node3 = null;
        int int4 = AvlTree0.getBalance(node3);
        AvlTree0.insert((int) '4');
        AvlTree.Node node8 = AvlTree0.find((int) '#');
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(node8);
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test36");
        AvlTree AvlTree0 = new AvlTree();
        AvlTree.Node node2 = AvlTree0.find((int) '4');
        AvlTree.Node node4 = AvlTree0.find((int) 'a');
        AvlTree.Node node5 = AvlTree0.getRoot();
        java.lang.Class<?> wildcardClass6 = AvlTree0.getClass();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test37");
        AvlTree AvlTree0 = new AvlTree();
        AvlTree.Node node2 = AvlTree0.find((int) '4');
        AvlTree.Node node3 = null;
        int int4 = AvlTree0.getBalance(node3);
        AvlTree0.insert(0);
        AvlTree0.insert((int) (short) 10);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test38");
        AvlTree AvlTree0 = new AvlTree();
        AvlTree.Node node2 = AvlTree0.find((int) '4');
        AvlTree.Node node3 = null;
        int int4 = AvlTree0.getBalance(node3);
        AvlTree0.insert((int) 'a');
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test39");
        AvlTree AvlTree0 = new AvlTree();
        AvlTree.Node node2 = AvlTree0.find((int) '4');
        AvlTree0.delete((int) 'a');
        AvlTree.Node node5 = AvlTree0.getRoot();
        AvlTree.Node node6 = null;
        int int7 = AvlTree0.getBalance(node6);
        AvlTree.Node node9 = AvlTree0.find((int) ' ');
        AvlTree.Node node10 = AvlTree0.getRoot();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node10);
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test40");
        AvlTree AvlTree0 = new AvlTree();
        AvlTree.Node node2 = AvlTree0.find((int) '4');
        AvlTree.Node node4 = AvlTree0.find((int) 'a');
        AvlTree.Node node5 = AvlTree0.getRoot();
        AvlTree0.delete((int) (short) 10);
        AvlTree.Node node8 = AvlTree0.getRoot();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node8);
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test41");
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
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test42");
        AvlTree AvlTree0 = new AvlTree();
        AvlTree.Node node2 = AvlTree0.find((int) '4');
        AvlTree.Node node3 = null;
        int int4 = AvlTree0.getBalance(node3);
        AvlTree0.insert((int) '4');
        AvlTree.Node node8 = AvlTree0.find((int) (short) 0);
        AvlTree0.delete(100);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(node8);
    }

    @Test
    public void test43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test43");
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
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test44() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test44");
        AvlTree AvlTree0 = new AvlTree();
        AvlTree.Node node2 = AvlTree0.find((int) '4');
        AvlTree0.delete((int) 'a');
        AvlTree.Node node5 = AvlTree0.getRoot();
        AvlTree0.delete(0);
        AvlTree.Node node8 = null;
        int int9 = AvlTree0.getBalance(node8);
        AvlTree.Node node11 = AvlTree0.find((int) (short) 10);
        AvlTree.Node node13 = AvlTree0.find((int) (byte) 0);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(node13);
    }

    @Test
    public void test45() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test45");
        AvlTree AvlTree0 = new AvlTree();
        AvlTree.Node node2 = AvlTree0.find((int) '4');
        int int3 = AvlTree0.height();
        AvlTree0.delete((int) (byte) 1);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test46() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test46");
        AvlTree AvlTree0 = new AvlTree();
        AvlTree.Node node2 = AvlTree0.find((int) '4');
        AvlTree.Node node3 = AvlTree0.getRoot();
        AvlTree0.delete(100);
        int int6 = AvlTree0.height();
        AvlTree.Node node8 = AvlTree0.find((int) (short) -1);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(node8);
    }

    @Test
    public void test47() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test47");
        AvlTree AvlTree0 = new AvlTree();
        AvlTree.Node node2 = AvlTree0.find((int) '4');
        AvlTree0.delete((int) 'a');
        AvlTree.Node node5 = AvlTree0.getRoot();
        AvlTree0.delete(0);
        AvlTree.Node node8 = null;
        int int9 = AvlTree0.getBalance(node8);
        int int10 = AvlTree0.height();
        AvlTree AvlTree11 = new AvlTree();
        AvlTree.Node node13 = AvlTree11.find((int) '4');
        AvlTree.Node node14 = AvlTree11.getRoot();
        AvlTree11.delete(100);
        AvlTree11.insert((int) (byte) 10);
        AvlTree.Node node19 = AvlTree11.getRoot();
        int int20 = AvlTree0.getBalance(node19);
        AvlTree AvlTree21 = new AvlTree();
        AvlTree.Node node23 = AvlTree21.find((int) '4');
        AvlTree21.delete((int) 'a');
        AvlTree.Node node26 = AvlTree21.getRoot();
        AvlTree21.delete(0);
        AvlTree.Node node29 = null;
        int int30 = AvlTree21.getBalance(node29);
        int int31 = AvlTree21.height();
        AvlTree AvlTree32 = new AvlTree();
        AvlTree.Node node34 = AvlTree32.find((int) '4');
        AvlTree.Node node35 = AvlTree32.getRoot();
        AvlTree32.delete(100);
        AvlTree32.insert((int) (byte) 10);
        AvlTree.Node node40 = AvlTree32.getRoot();
        int int41 = AvlTree21.getBalance(node40);
        int int42 = AvlTree0.getBalance(node40);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNull(node23);
        org.junit.Assert.assertNull(node26);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertNull(node34);
        org.junit.Assert.assertNull(node35);
        org.junit.Assert.assertNotNull(node40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
    }

    @Test
    public void test48() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test48");
        AvlTree AvlTree0 = new AvlTree();
        AvlTree.Node node2 = AvlTree0.find((int) '4');
        AvlTree0.delete((int) 'a');
        AvlTree AvlTree5 = new AvlTree();
        AvlTree.Node node7 = AvlTree5.find((int) '4');
        AvlTree.Node node8 = AvlTree5.getRoot();
        AvlTree5.insert((int) (byte) 100);
        AvlTree AvlTree11 = new AvlTree();
        AvlTree.Node node13 = AvlTree11.find((int) '4');
        AvlTree.Node node14 = null;
        int int15 = AvlTree11.getBalance(node14);
        AvlTree11.insert((int) (short) 100);
        AvlTree.Node node19 = AvlTree11.find((int) ' ');
        int int20 = AvlTree11.height();
        AvlTree.Node node21 = AvlTree11.getRoot();
        int int22 = AvlTree5.getBalance(node21);
        int int23 = AvlTree0.getBalance(node21);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test49() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test49");
        AvlTree AvlTree0 = new AvlTree();
        AvlTree.Node node1 = null;
        int int2 = AvlTree0.getBalance(node1);
        AvlTree0.insert((int) (byte) 100);
        AvlTree0.delete((int) '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test50() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test50");
        AvlTree AvlTree0 = new AvlTree();
        AvlTree.Node node2 = AvlTree0.find((int) '4');
        AvlTree.Node node4 = AvlTree0.find((int) 'a');
        AvlTree.Node node5 = AvlTree0.getRoot();
        AvlTree.Node node6 = AvlTree0.getRoot();
        AvlTree.Node node7 = AvlTree0.getRoot();
        AvlTree AvlTree8 = new AvlTree();
        AvlTree.Node node9 = null;
        int int10 = AvlTree8.getBalance(node9);
        AvlTree AvlTree11 = new AvlTree();
        AvlTree.Node node13 = AvlTree11.find((int) '4');
        AvlTree.Node node14 = AvlTree11.getRoot();
        AvlTree11.insert((int) (byte) 100);
        AvlTree AvlTree17 = new AvlTree();
        AvlTree.Node node19 = AvlTree17.find((int) '4');
        AvlTree.Node node20 = null;
        int int21 = AvlTree17.getBalance(node20);
        AvlTree17.insert((int) (short) 100);
        AvlTree.Node node25 = AvlTree17.find((int) ' ');
        int int26 = AvlTree17.height();
        AvlTree.Node node27 = AvlTree17.getRoot();
        int int28 = AvlTree11.getBalance(node27);
        int int29 = AvlTree8.getBalance(node27);
        int int30 = AvlTree0.getBalance(node27);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNull(node25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
    }
}

