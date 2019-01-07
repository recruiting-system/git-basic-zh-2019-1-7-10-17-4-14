package cn.school.thoughtworks.section1;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertEquals;

public class PracticeCTest {
    private PracticeC practiceC = null;

    @Before
    public void setUp() throws Exception {
        practiceC = new PracticeC();
    }

    @Test
    public void collect_same_elements_should_return_an_array_with_same_elements_in_two_collections() throws Exception {
        //选出1集合中跟2对象中value属性中的元素相同的元素
        List<String> collection1 = Arrays.asList("a", "e", "h", "t", "f", "c", "g", "b", "d");
        List<String> list = Arrays.asList("a", "d", "e", "f");
        Map<String,List<String>> collection2 = new HashMap<>();
        collection2.put("value",list);

        List<String> result = practiceC.collectSameElements(collection1, collection2);
        List<String> expectedResult = Arrays.asList("a", "e", "f", "d");
        assertEquals(result, expectedResult);
    }
}
