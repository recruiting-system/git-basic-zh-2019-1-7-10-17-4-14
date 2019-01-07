package cn.school.thoughtworks.section2;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertEquals;

public class PracticeATest {
    private PracticeA practiceA = null;

    @Before
    public void beforeEach() {
        practiceA = new PracticeA();
    }

    @Test
    public void count_same_elements_should_return_an_map_with_elements_and_count() {
        //把1集合中相同的元素统计出数量
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

        Map<String, Integer> expectedResult = new HashMap<String, Integer>() {{
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

        Map<String, Integer> result = practiceA.countSameElements(collection1);
        assertEquals(result, expectedResult);
    }

}
