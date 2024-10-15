package calculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MyClalcsTest {
    @Test
    public void testAdd() {
        MyCalcs myClass = new MyCalcs();
        assertEquals(3, myClass.add(1, 2));
        assertEquals(0, myClass.add(-1, 1));
        assertEquals(0, myClass.add(0, 0));
    }
    @Test
    public void testSub() {
        MyCalcs myClass = new MyCalcs();
        assertEquals(3, myClass.sub(4, 1));
        assertEquals(0, myClass.sub(2, 2));
        assertEquals(0, myClass.sub(3, 3));
    }

}
