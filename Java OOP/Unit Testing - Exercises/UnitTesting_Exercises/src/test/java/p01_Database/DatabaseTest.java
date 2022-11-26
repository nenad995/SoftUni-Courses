package p01_Database;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import javax.naming.OperationNotSupportedException;

public class DatabaseTest {

    private Database database;
    private final static Integer[] NUMBERS = {7, 2, 3, 4, 5};

    @Before
    public void setUp() throws OperationNotSupportedException {
        database = new Database(NUMBERS);
    }

    @Test
    public void testConstructorCreatesValidDB() throws OperationNotSupportedException {
        Integer[] dbElements = database.getElements();

        /*for (int i = 0; i < dbElements.length; i++){
            Assert.assertEquals(numbers[i], dbElements[i]);
        }*/
        Assert.assertArrayEquals(NUMBERS, dbElements);
    }

    @Test(expected = OperationNotSupportedException.class)
    public void testConstructorShouldThrowExceptionWithMoreThanSixteenElements() throws OperationNotSupportedException {
        Integer[] bigArr = new Integer[17];
        new Database(bigArr);
    }

    @Test(expected = OperationNotSupportedException.class)
    public void testConstructorShouldThrowExceptionWithLessThanOneElement() throws OperationNotSupportedException {
        Integer[] emptyArr = new Integer[0];
        new Database(emptyArr);
    }

    @Test(expected = OperationNotSupportedException.class)
    public void testAddNullInDatabaseShouldThrowException() throws OperationNotSupportedException {
        database.add(null);
    }

    @Test
    public void testAddElementSuccessfully() throws OperationNotSupportedException {
        database.add(42);
        Integer[] dbElements = database.getElements();
        Assert.assertEquals(dbElements[dbElements.length - 1], Integer.valueOf(42));
        Assert.assertEquals(NUMBERS.length + 1, dbElements.length);
    }

    @Test(expected = OperationNotSupportedException.class)
    public void testRemoveShouldThrowExceptionWithEmptyDB() throws OperationNotSupportedException {
        //We can't create empty DB because of DB constructor, that's why we use for
        for (int i = 0; i < NUMBERS.length; i++){
            database.remove();
        }

        database.remove(); //This should throw exception
    }

    @Test
    public void testRemoveShouldRemoveLastElement() throws OperationNotSupportedException {
        Integer[] elementsBeforeRemove = database.getElements();
        database.remove();
        Integer[] elementsAfterRemove = database.getElements();
        Assert.assertEquals(elementsBeforeRemove.length - 1, elementsAfterRemove.length);
        int secondToLastElement = elementsBeforeRemove[elementsBeforeRemove.length - 2];
        int lastElementAfterRemove = elementsAfterRemove[elementsAfterRemove.length - 1];
        Assert.assertEquals(secondToLastElement, lastElementAfterRemove);
    }

}