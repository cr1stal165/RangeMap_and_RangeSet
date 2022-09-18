import org.junit.jupiter.api.Test;
import vsu.ru.silnov.RangeMap;

import static org.junit.jupiter.api.Assertions.*;

public class RangeMapTest {

    @Test
    public void checkRemove(){
        RangeMap<Integer,Integer> rangeMap = new RangeMap<>();
        rangeMap.put(12,14);
        rangeMap.put(15,21);
        rangeMap.put(211,3853);

        rangeMap.remove(12);
        rangeMap.remove(15);

        assertTrue(rangeMap.containsKey(211));
        assertFalse(rangeMap.containsKey(12));
        assertFalse(rangeMap.containsKey(15));
    }

    @Test
    public void searchElement(){
        RangeMap<Integer,Integer> rangeMap = new RangeMap<>();
        rangeMap.put(12,14);
        rangeMap.put(15,21);
        rangeMap.put(211,3853);

        assertEquals(rangeMap.searchKey(12),12);
        assertEquals(rangeMap.searchKey(15),15);
    }

}
