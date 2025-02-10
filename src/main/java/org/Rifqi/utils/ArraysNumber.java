package org.Rifqi.utils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ArraysNumber {
    private void checkIsEmpty(List<Integer> list) {
        if (list == null || list.isEmpty()) {
            throw new IllegalArgumentException("Error: The list is empty or null.");
        }
    }

    public List<Integer> rotate(List<Integer> list, int n) {
        checkIsEmpty(list);
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
        checkIsEmpty(list);
        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i).equals(list.get(j))) {
                    return true;
                }
            }
        }
        return false;
    }

    public List<Integer> removeDuplicate(List<Integer> list) {
        checkIsEmpty(list);
        if (!isDuplicate(list)) {
            return list;
        }
        list = new ArrayList<>(list);
        for (int i = list.size() - 1; i > 0; i--) {
            for (int j = i - 1; j >= 0; j--) {
                if (list.get(i).equals(list.get(j))) {
                    list.remove(i);
                    break;
                }
            }
        }
        return list;
    }

    public List<Integer> sortArray(List<Integer> list, String sort) {
        checkIsEmpty(list);
        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (sort.equalsIgnoreCase("asc") && list.get(i) > list.get(j)) {
                    int temp = list.get(i);
                    list.set(i, list.get(j));
                    list.set(j, temp);
                } else if (sort.equalsIgnoreCase("desc") && list.get(i) < list.get(j)) {
                    int temp = list.get(i);
                    list.set(i, list.get(j));
                    list.set(j, temp);
                }
            }
        }
        return list;
    }

    public List<Integer> removeAllOccurance(List<Integer> list, int key) {
        checkIsEmpty(list);
        List<Integer> result = new ArrayList<>();
        for (int number : list) {
            if (number != key) {
                result.add(number);
            }
        }
        return result;
    }

    public List<Integer> findAllDuplicate(List<Integer> list) {
        checkIsEmpty(list);
        if (!isDuplicate(list)) {
            return list;
        }
        List<Integer> result = new ArrayList<>();
        HashMap<Integer, Integer> countOccurance = new HashMap<>();
        for (int num : list) {
            countOccurance.put(num, countOccurance.getOrDefault(num, 0) + 1);
        }
        for (int num : countOccurance.keySet()) {
            if (countOccurance.get(num) > 1) {
                result.add(num);
            }
        }
        return result;
    }

    public List<Integer> checkTemperature(List<Integer> list) {
        checkIsEmpty(list);
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            int count = 0;
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i) < (list.get(j))) {
                    count = j - i;
                    break;

                }
            }
            result.add(count);
        }
        return result;
    }

}



