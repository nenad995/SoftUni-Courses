package p02_ExtendedDatabase;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import javax.naming.OperationNotSupportedException;

import static org.junit.Assert.*;

public class DatabaseTest {

    private Person pesho = new Person(1, "Pesho");
    private Person ivan = new Person(2, "Ivan");
    private Person georgi = new Person(3, "Georgi");
    private Database database;


    @Before
    public void setUp() throws OperationNotSupportedException {
        database = new Database(pesho, ivan, georgi);
    }

    @Test(expected = OperationNotSupportedException.class)
    public void testConstructorShouldThrowExceptionWithMoreThanSixteenElements() throws OperationNotSupportedException {
        Person[] people = new Person[17];
        new Database(people);
    }

    @Test(expected = OperationNotSupportedException.class)
    public void testConstructorShouldThrowExceptionWithLessThanOneElement() throws OperationNotSupportedException {
        Person[] people = new Person[0];
        new Database(people);
    }

    @Test
    public void testConstructorShouldSuccessfullyCreateDB() throws OperationNotSupportedException {
        Person[] people = new Person[7];
        database = new Database(people);
        Assert.assertEquals(people.length, database.getElements().length);
    }

    @Test(expected = OperationNotSupportedException.class)
    public void testAddShouldThrowExceptionWithNull() throws OperationNotSupportedException {
        database.add(null);
    }

    //This function is not implemented in original skeleton
    /*@Test(expected = OperationNotSupportedException.class)
    public void testAddShouldThrowErrorWhenTryingToAddNewPersonWithIdSameAsAlreadyExisting() throws OperationNotSupportedException {
        Person person = new Person(3, "Denis");
        database.add(person);
    }*/

    //This function is not implemented in original skeleton
    /*@Test(expected = OperationNotSupportedException.class)
    public void testAddShouldThrowExceptionWithNegativeId() throws OperationNotSupportedException {
        Person person = new Person(-3, "Spas");
        database.add(person);
    }*/

    @Test
    public void testAddShouldAddNewPersonToDB() throws OperationNotSupportedException {
        Person person = new Person(4, "Milica");
        database.add(person);
        Assert.assertEquals(database.getElements()[3], person);
    }

    @Test(expected = OperationNotSupportedException.class)
    public void testRemoveShouldThrowExceptionIfDBIsEmpty() throws OperationNotSupportedException {
        Person[] people = database.getElements();
        for (int i = 0; i < people.length; i++){
            database.remove();
        }

        database.remove();
    }

    @Test
    public void testRemoveShouldRemoveLastElement() throws OperationNotSupportedException {
        Person[] people = database.getElements();
        database.remove();
        Assert.assertEquals(people.length - 2, database.getElements().length - 1);
    }

    @Test(expected = OperationNotSupportedException.class)
    public void testFindByUsernameShouldThrowExceptionWithNull() throws OperationNotSupportedException {
        database.findByUsername(null);
    }

    @Test(expected = OperationNotSupportedException.class)
    public void testFindByUsernameShouldThrowExceptionIfUsernameIsMissing() throws OperationNotSupportedException {
        database.findByUsername("Nenad");
    }

    @Test
    public void testFindByUsernameShouldReturnUser() throws OperationNotSupportedException {
        Person person = database.findByUsername(pesho.getUsername());
        Assert.assertEquals(pesho.getId(), person.getId());
        Assert.assertEquals(pesho.getUsername(), person.getUsername());
    }

    @Test(expected = OperationNotSupportedException.class)
    public void testFindByIdShouldThrowExceptionIfThereIsNoPersonWithGivenId() throws OperationNotSupportedException {
        database.findById(4);
    }

    @Test
    public void testFindByIdShouldReturnPersonWithCorrectId() throws OperationNotSupportedException {
        Person person = database.findById(2);
        Assert.assertEquals(ivan, person);
    }

}