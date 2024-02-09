package streamsAndLambdasTest;

import org.junit.Assert;
import org.junit.Test;
import streamsAndLambdas.GroupingList;

import java.util.List;
import java.util.Map;

public class GroupingListTest {
    GroupingList groupingList = new GroupingList();
    @Test
    public void testGrouping() {
        Map<Integer, List<String>> integerListMap = groupingList
                .getListGroupByLength(List.of("hello", "i", "am", "smile", "max"));
        Assert.assertEquals(List.of("hello", "smile"), integerListMap.get(5));
        Assert.assertNull(integerListMap.get(4));
    }
}
