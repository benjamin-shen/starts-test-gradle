package first;

import org.junit.Test;

import java.util.Set;

import static org.junit.Assert.assertEquals;

public class FirstTest {
    @Test
    public void test() {
        First first = new First();
        first.add(1);
        first.add(2);
        first.add(3);
        Set<Integer> out = first.getSet();
        int result = 0;
        for(Integer i : out) {
            result += i;
        }
        assertEquals("sum", 6, result);
    }
}
