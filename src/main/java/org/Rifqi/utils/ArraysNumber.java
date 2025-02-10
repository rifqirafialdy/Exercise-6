package org.Rifqi.utils;

import java.util.ArrayList;
import java.util.List;

public class ArraysNumber {
    public List<Integer> rotate(List<Integer> list, int n) {
        List<Integer> rotatedList = new ArrayList<>();
        for (int i = n; i < list.size(); i++) {

            rotatedList.add(list.get(i));
        }
        for (int i = 0; i < n; i++) {
            rotatedList.add(list.get(i));
        }
        return rotatedList;
    }

    public boolean isDuplicate(List<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i).equals(list.get(j))) {
                    return true;
                }
            }
        }
        return false;
    }
    
}
