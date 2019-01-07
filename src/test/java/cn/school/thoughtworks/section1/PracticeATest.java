package cn.school.thoughtworks.section1;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertArrayEquals;

public class PracticeATest {
    PracticeA practiceA = null;

    @Before
    public void beforeEach() {
        practiceA = new PracticeA();
    }

    @Test
    public void collect_same_elements_should_return_an_array_with_same_elements_in_two_collections() {
        //选出1集合中与2集合中相同的元素
        List<String> collection1 = Arrays.asList("a", "e", "h", "t", "f", "c", "g", "b", "d");
        List<String> collection2 = Arrays.asList("a", "d", "e", "f");

        List<String> result = practiceA.collectSameElements(collection1, collection2);
        String[] expectedResult = new String[]{"a", "e", "f", "d"};
        assertArrayEquals(result.toArray(), expectedResult);
    }

}
