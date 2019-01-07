package cn.school.thoughtworks.section3;

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
    public void create_update_collection_should_return_a_new_map_with_element_as_key_and_count_as_value() throws Exception {
        //统计出collection1中相同的元素的个数，形成collection3，collection3是一个map其中元素key是collection1中的元素value是该元素在collection1中出现次数，然后选出collection3跟collection2中value属性对应的list中的元素相同的元素,把他们的count，满3减1，输出减过之后的新集合
        List<String> collection1 = Arrays.asList(
                "a", "a", "a",
                "e", "e", "e", "e", "e", "e", "e",
                "h", "h", "h", "h", "h", "h", "h", "h", "h", "h", "h",
                "t", "t", "t", "t", "t", "t", "t", "t", "t", "t", "t", "t", "t", "t", "t", "t", "t", "t", "t", "t",
                "f", "f", "f", "f", "f", "f", "f", "f", "f",
                "c", "c", "c", "c", "c", "c", "c", "c",
                "g", "g", "g", "g", "g", "g", "g",
                "b", "b", "b", "b", "b", "b",
                "d", "d", "d", "d", "d"
        );

        List<String> list = Arrays.asList("a", "d", "e", "f");
        Map<String, List<String>> collection2 = new HashMap<>();
        collection2.put("value", list);

        Map<String, Integer> result = practiceC.createUpdatedCollection(collection1, collection2);
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
