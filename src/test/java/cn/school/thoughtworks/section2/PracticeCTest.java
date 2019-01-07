package cn.school.thoughtworks.section2;

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
    public void beforeEach() {
        practiceC = new PracticeC();
    }

    @Test
    public void count_same_elements_should_return_an_map_with_elements_and_count() {
        //把1集合中相同的元素统计出数量
        List<String> collection1 = Arrays.asList(
                "a", "a", "a",
                "e", "e", "e", "e", "e", "e", "e",
                "h", "h", "h", "h", "h", "h", "h[3]", "h", "h",
                "t", "t-2", "t", "t", "t", "t", "t", "t", "t[10]",
                "f", "f", "f", "f", "f", "f", "f", "f", "f",
                "c:8",
                "g", "g", "g", "g", "g", "g", "g",
                "b", "b", "b", "b", "b", "b",
                "d-5"
        );

        Map<String, Integer> expectedResult = new HashMap<String, Integer>() {{
            put("a", 3);
            put("e", 7);
            put("h", 11);
            put("t", 19);
            put("f", 9);
            put("c", 8);
            put("g", 7);
            put("b", 6);
            put("d", 5);
        }};

        Map<String, Integer> result = practiceC.countSameElements(collection1);
        assertEquals(result, expectedResult);
    }

}
