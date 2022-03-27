import org.junit.Test;

import static java.lang.Math.pow;
import static org.junit.Assert.assertEquals;


public class ListUsingArrayTest {
    @Test
    public void addTest(){
        ListUsingArray obj = new ListUsingArray();
        obj.add("Buying Grociers");
        obj.add("Do the Laundry");
        obj.add("Study");
        obj.add("Sleep");
        obj.add(3, "eating");
        assertEquals(5 ,obj.size);
    }

    @Test
    public void addTest2(){
        ListUsingArray obj = new ListUsingArray();
        obj.add("Doing homework");
        obj.add("Walking");
        assertEquals(2,obj.size);
    }

    @Test
    public void addPositionTest(){
        ListUsingArray obj = new ListUsingArray();
        obj.add("Buying Grociers");
        obj.add("Do the Laundry");
        obj.add("Study");
        obj.add("Sleep");
        obj.add(3, "eating");
        assertEquals("eating", obj.get(3) );

        assertEquals("Buying Grociers", obj.get(1) );

        assertEquals("Do the Laundry", obj.get(2) );
        assertEquals("Study", obj.get(4) );

        assertEquals("Sleep", obj.get(5) );
    }

    @Test(expected = RuntimeException.class)
    public void addExceptionTest(){
        ListUsingArray obj = new ListUsingArray();
        obj.add("Buying Grociers");
        obj.add("Do the Laundry");
        obj.add("Study");
        obj.add("Sleep");
        obj.add(3, "eating");
        obj.add(100, "jsahdjasd"); // should trigger the Runtime exception
        assertEquals(1, 1);
    }

    // todo - complete writing this class by adding more unit tests
}