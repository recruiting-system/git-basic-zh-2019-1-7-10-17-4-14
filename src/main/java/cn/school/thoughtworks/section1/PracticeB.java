package cn.school.thoughtworks.section1;

import java.util.ArrayList;
import java.util.List;

public class PracticeB {
    List<String> collectSameElements(List<String> collection1, List<List<String>> collection2) {
        //实现练习要求，并改写该行代码。
        if (collection1.isEmpty() || collection2.isEmpty())
            return null;

        List<String> noExists = new ArrayList<>(collection1);
        List<String> Exists = new ArrayList<>(collection1);
        for (List<String> y:collection2) {
            noExists.removeAll(y);
        }
        Exists.removeAll(noExists);
        return Exists;
    }
}
