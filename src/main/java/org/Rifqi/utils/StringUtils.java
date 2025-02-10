package org.Rifqi.utils;

public class StringUtils {
    public String reverseString(String str) {
        char[] charArray = str.toCharArray();
        int right = charArray.length - 1;
        int left = 0;
        while (left < right) {
            char temp = charArray[left];
            charArray[left] = charArray[right];
            charArray[right] = temp;
            left++;
            right--;
        }
        return new String(charArray);
    }
}
