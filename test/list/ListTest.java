package list;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ListTest {
    List list;

    @BeforeEach
    void setup() {
        list = new List();
    }

    @Test
    public void testThatListIsEmpty() {
        boolean answer = list.isEmpty();
        assertTrue(answer);
    }

    @Test
    public void testThatListSizeIncreaseWhenYouAddAnElementAndListIsNotEmpty() {
        list.add(4);
        list.add(5);
        int size = list.size();
        assertEquals(2, size);
        assertFalse(list.isEmpty());
    }

    @Test
    public void testThatListSizeDecreaseWhenYouRemoveElementFromTheList() {
        list.add(6);
        list.add(9);
        list.remove(0);
        int size = list.size();
        assertEquals(1, size);
        assertFalse(list.isEmpty());
    }

    @Test
    public void testThatListCanBeEmptyAfterItsFilledWithElements() {
        list.add(1);
        list.add(2);
        list.add(3);
        assertFalse(list.isEmpty());
        list.remove(2);
        list.remove(1);
        list.remove(0);
        int size = list.size();
        assertEquals(0, size);
        assertTrue(list.isEmpty());
    }

    @Test
    public void testThatFunctionReturnTheElementAddedToTheList() {
        list.add(5);
        int element = list.get(0);
        assertEquals(5, element);
    }

    @Test
    public void testThatFunctionReturnTheElementWhenMoreThanOneInputIsAddedToTheList() {
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);
        list.add(10);
        int elementOne = list.get(0);
        int elementTwo = list.get(1);
        int elementThree = list.get(2);
        int elementFour = list.get(3);
        int elementFive = list.get(4);
        assertEquals(6, elementOne);
        assertEquals(7, elementTwo);
        assertEquals(8, elementThree);
        assertEquals(9, elementFour);
        assertEquals(10, elementFive);

    }

    @Test
    public void testThatFunctionRemoveElementAtTheIndexGiven() {
        list.add(5);
        list.add(6);
        list.remove(0);
        int element = list.get(0);
        assertEquals(6, element);
    }
    @Test
    public void testThatFunctionOfSetIsActive_itTakeIndexAndElement(){
        list.add(6);
        list.add(5);
        list.add(9);
        list.add(10);
        list.set(1,11);
       int answer = list.get(1);
        assertEquals(11,answer);

    }
    @Test
    public void testThatFunctionReturnTheIndexOfElement(){
        list.add(6);
        list.add(5);
        list.add(9);
        list.add(10);
        int answer = list.indexOf(9);
        assertEquals(2,answer);

    }
    @Test
    public void testThatFunctionReturnTheIndexOfElementInput_andStartSearchFromLastIndex(){
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);
        list.add(8);
        int answer = list.lastIndexOf(8);
        assertEquals(4,answer);
    }
    @Test
    public void testThatElementIsInTheList(){
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);
        list.add(8);
        boolean answer = list.contains(7);
        assertTrue(answer);

    }
    @Test
    public void testThatElementIsNotInlist(){
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);
        list.add(8);
        boolean answer = list.contains(10);
        assertFalse(answer);
    }
    @Test
    public void testFunctionWhenLengthIsMoreThanTen(){
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);
        list.add(10);
        list.add(16);
        list.add(11);
        int answer = list.get(6);
        int size = list.size();
        assertEquals(11,answer);
        assertEquals(7,size);
    }


}



