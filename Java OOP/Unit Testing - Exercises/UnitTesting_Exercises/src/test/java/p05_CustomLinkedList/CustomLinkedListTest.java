package p05_CustomLinkedList;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CustomLinkedListTest {

    private CustomLinkedList<String> list;

    @Before
    public void setUp(){
        list = new CustomLinkedList<>();
        list.add("Pesho");
        list.add("Gosho");
        list.add("Tosho");
    }

    @Test
    public void testAddShouldAdd(){
        int previousSize = list.getCount();
        list.add("Momchil");
        int currentSize = list.getCount();
        Assert.assertEquals(list.getCount() - 1, list.indexOf("Momchil"));
        Assert.assertEquals(previousSize + 1, currentSize);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetShouldThrowExceptionWithNegativeIndex(){
        list.get(-1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetShouldThrowExceptionWithIndexOutOfBounds(){
        list.get(list.getCount() + 1);
    }

    @Test
    public void testGetShouldReturn(){
        String testElement = list.get(1);
        Assert.assertEquals("Gosho", testElement);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetShouldThrowExceptionWithNegativeIndex(){
        list.set(-1, "Tosho");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetShouldThrowExceptionWithIndexOutOfBounds(){
        list.set(list.getCount() + 1, "Tosho");
    }

    @Test
    public void testSetShouldSet(){
        list.set(1, "Ivan");
        Assert.assertEquals("Ivan", list.get(1));
    }

    @Test
    public void testIndexOfShouldFindIndex(){
        Assert.assertEquals(1, list.indexOf("Gosho"));
    }

    @Test
    public void testIndexOfShouldNOTFindIndex(){
        Assert.assertEquals(-1, list.indexOf("Todor"));
    }

    @Test
    public void testContainsShouldReturnTrueWhenFound(){
        Assert.assertTrue(list.contains("Gosho"));
    }

    @Test
    public void testContainsShouldReturnFalseWhenNotFound(){
        Assert.assertFalse(list.contains("Gregori"));
    }

    @Test
    public void testRemoveWithMissingElement(){
        Assert.assertEquals(-1, list.remove("Milosh"));
    }

    @Test
    public void testRemoveWithExistingElement(){
        int index = list.indexOf("Gosho");
        Assert.assertEquals(index, list.remove("Gosho"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testRemoveAtWithNegativeIndex(){
        list.removeAt(-1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testRemoveAtWithOutOfBoundsIndex(){
        list.removeAt(list.getCount() + 1);
    }

    @Test
    public void testRemoveAtIndexShouldRemove(){
        int countBeforeRemove = list.getCount();
        Assert.assertEquals("Gosho", list.removeAt(1));
        int countAfterRemove = list.getCount();
        Assert.assertEquals(countBeforeRemove - 1, countAfterRemove);
    }

}