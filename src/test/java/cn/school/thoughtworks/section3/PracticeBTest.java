package cn.school.thoughtworks.section3;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertEquals;

public class PracticeBTest {
    private PracticeB practiceB = null;

    @Before
    public void setUp() throws Exception {
        practiceB = new PracticeB();
    }

    @Test
    public void create_update_collection_should_return_a_new_map_with_element_as_key_and_count_as_value() throws Exception {
        //选出collection1中key跟collection2中value对应的list中的元素相同的元素,把他们的count，满3减1，输出减过之后的新集合
        Map<String, Integer> collection1 = new HashMap<String, Integer>() {{
            put("a", 3);
            put("e", 7);
            put("h", 11);
            put("t", 20);
            put("f", 9);
            put("c", 8);
            put("g", 7);
            put("b", 6);
            put("d", 5);
        }};

        List<String> list = Arrays.asList("a", "d", "e", "f");
        Map<String, List<String>> collection2 = new HashMap<>();
        collection2.put("value", list);

        Map<String, Integer> result = practiceB.createUpdatedCollection(collection1, collection2);
        Map<String, Integer> expectedResult = new HashMap<String, Integer>() {{
            put("a", 2);
            put("e", 5);
            put("h", 11);
            put("t", 20);
            put("f", 6);
            put("c", 8);
            put("g", 7);
            put("b", 6);
            put("d", 4);
        }};

        assertEquals(result, expectedResult);
    }
}
