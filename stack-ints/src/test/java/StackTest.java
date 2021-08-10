import com.models.Stack;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StackTest {
    Stack stackToTest;

    @Before
    public void stackTestSetUp() {
        stackToTest = new Stack();
    }

    @Test
    public void countTest_False() {
        int result = stackToTest.count();

        assertEquals("isEmpty() false test should return 0.",0, result);
    }

    @Test
    public void countTest_True() {
        stackToTest.push(1);
        stackToTest.push(2);
        stackToTest.push(3);

        int result = stackToTest.count();

        assertEquals("isEmpty() true test should return 3.", 3, result);
    }

    @Test
    public void isEmptyTest_False() {
        assertTrue(stackToTest.isEmpty());
    }

    @Test
    public void isEmptyTest_True() {
        stackToTest.push(1);
        stackToTest.push(2);
        stackToTest.push(3);

        assertFalse(stackToTest.isEmpty());
        assertEquals(3, stackToTest.count());
    }

    @Test
    public void pushTest_False() {
        assertNull(stackToTest.getHead());

        stackToTest.push(345);
        assertEquals(345, stackToTest.getHead().getData());
    }


    @Test
    public void pushTest_True() {
        stackToTest.push(01010);

        assertEquals(01010, stackToTest.getHead().getData());
    }

    @Test
    public void popTest_False() {
        assertEquals(-1, stackToTest.pop());
    }

    @Test
    public void popTest_True() {
        stackToTest.push(1);
        stackToTest.push(2);
        stackToTest.push(3);

        assertEquals(3, stackToTest.pop());
    }

    @Test public void peekTest_False() {
        assertEquals(-1, stackToTest.peek());
    }

    @Test
    public void peekTest_True() {
        stackToTest.push(124314);
        stackToTest.push(23214);
        stackToTest.push(3434);

        assertEquals(3434, stackToTest.peek());
    }
}
