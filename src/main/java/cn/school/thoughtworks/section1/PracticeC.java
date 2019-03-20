package cn.school.thoughtworks.section1;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class PracticeC {
    List<String> collectSameElements(List<String> collection1, Map<String,List<String>> collection2) {
        //实现练习要求，并改写该行代码。
        if (collection1.isEmpty() || collection2.isEmpty())
            return null;

        List<String> noExists = new ArrayList<>(collection1);
        List<String> Exists = new ArrayList<>(collection1);
        for (String key : collection2.keySet()) {
            noExists.removeAll(collection2.get(key));
        }
        Exists.removeAll(noExists);
        return Exists;
    }
}
