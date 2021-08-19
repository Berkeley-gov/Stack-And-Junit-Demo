import com.data.structures.Stack;
import com.exceptions.StackIsEmptyException;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StackTest {
    Stack stackTest;

    @Before
    public void stackTestSetUp() {
        stackTest = new Stack();
    }

    @Test
    public void countFalse_Returns0() {
        assertEquals(0, stackTest.count());
    }

    @Test
    public void countTrue_ReturnsCorrectInt() {
        Stack stackCountTest = new Stack(25);

        assertEquals(25, stackCountTest.count());
    }

    @Test
    public void isEmpty_ReturnsTrueWhenEmpty() {
        assertTrue(stackTest.isEmpty());
    }

    @Test
    public void isEmptyTrue_ReturnsFalse() {
        stackTest.push("Chimmy Changa!");

        assertFalse(stackTest.isEmpty());
    }

    @Test
    public void pushFalse_ThrowsException() {
        assertThrows(StackIsEmptyException.class, () -> stackTest.push(null));
    }

    @Test
    public void pushTrue() {
        stackTest.push("Hello World");

        assertEquals("Hello World", stackTest.peek());
    }

    @Test
    public void containsFalse_ReturnsNull() {
        assertNull(stackTest.contains(234.44));
    }

    @Test
    public void containsTrue_ReturnsData() {
        stackTest.push(1);
        stackTest.push(323.33);
        stackTest.push("Hello world!");

        assertEquals(323.33, stackTest.contains(323.33));
        assertEquals(1, stackTest.contains(1));
        assertEquals("Hello world!", stackTest.contains("Hello world!"));
    }

    @Test
    public void peekFalse_ReturnsException() {
        assertThrows(StackIsEmptyException.class, () -> stackTest.peek());
    }

    @Test
    public void peekTrue_ReturnsHeadData() throws Exception {
        stackTest.push(234);
        stackTest.push(43.4);
        stackTest.push("Peter Parker");

        Assert.assertEquals("Peter Parker", stackTest.peek());
    }

    @Test
    public void popFalse_ReturnsFalse() {
        assertFalse(stackTest.pop());
    }

    @Test public void popTrue() {
        stackTest.push(1);
        stackTest.push(2);
        stackTest.push(3);

        assertTrue(stackTest.pop());
        assertEquals(2, stackTest.peek());
    }

    @Test
    public void peekThrowsException() {
        assertThrows(StackIsEmptyException.class, () -> stackTest.peek());
    }
}
