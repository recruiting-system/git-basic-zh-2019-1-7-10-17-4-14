package cn.school.thoughtworks.section1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class PracticeA {
    List<String> collectSameElements(List<String> collection1, List<String> collection2) {
        //实现练习要求，并改写该行代码。
        if (collection1.isEmpty() || collection2.isEmpty())
            return null;
        List<String> Exists = new ArrayList<>(collection1);
        List<String> noExists = new ArrayList<>(collection1);
        //rm current exists
        Exists.removeAll(collection2);
        noExists.removeAll(Exists);
        return noExists;
    }
}
