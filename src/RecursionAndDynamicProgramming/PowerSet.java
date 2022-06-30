package RecursionAndDynamicProgramming;

import java.util.ArrayList;
import java.util.List;

public class PowerSet {

    public static List<List<Integer>> solve(List<Integer> list) {

        List<List<Integer>> res = new ArrayList<>();
        List<Integer> list1 = new ArrayList<>();
//        List<Integer> list2 = new ArrayList<>();
//        list2.add(list.get(0));
        res.add(list1);
//        res.add(list2);

        for (int i = 0; i < list.size(); i++) {
            int size = res.size();
//            newList.addAll(res);
//            res.addAll(newList);
            for (int j = 0; j < size; j++) {
                List<Integer> newList = new ArrayList<>();
                newList.addAll(res.get(j));
                newList.add(list.get(i));
                res.add(newList);
            }
        }
        return res;
    }
}
