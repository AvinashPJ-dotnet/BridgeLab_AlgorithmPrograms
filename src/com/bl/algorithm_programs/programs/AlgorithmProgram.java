package com.bl.algorithm_programs.programs;

import java.util.*;
import java.util.concurrent.ConcurrentMap;

public class AlgorithmProgram {
    public void stringPermutation(String str, int start, int length) {
        if (start == length)
            System.out.println(str);
        else {
            for (int i = start; i < length; i++) {
                str = swap(str, start, i);
                stringPermutation(str, start + 1, length);
                str = swap(str, start, i);
            }
        }
    }

    public String swap(String a, int i, int j) {
        char temp;
        char[] charArray = a.toCharArray();
        temp = charArray[i];
        charArray[i] = charArray[j];
        charArray[j] = temp;
        return String.valueOf(charArray);
    }

    //2 binary search
    public <E extends Comparable<E>> void binarySearch(E[] strArr, E key){
        Arrays.sort(strArr);
        int size = strArr.length;
        boolean result = searchRecursive(strArr, 0, size, key);
         System.out.println(result);
    }

    private <E extends Comparable<E>> boolean searchRecursive(E[] arr, int l, int r, E word)
    {
        if (r >= l) {
            int mid = (r+l) / 2;

            if (arr[mid].equals(word))
                return true;

            if (arr[mid].compareTo(word) > 0)
                return searchRecursive(arr, l, mid - 1, word);

            return searchRecursive(arr, mid + 1, r, word);
        }
        return false;
    }

    public <E extends Comparable<E>> E[] insertionSort(E[] arr)
    {
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            E key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j].compareTo(key)>0) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
        return arr;
    }

    public <E extends Comparable<E>> E[] bubbleSort(E[] arr)
    {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j].compareTo(arr[j + 1]) > 0) {
                    E temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }

    public <E extends Comparable<E>> boolean checkAnagram(E strn1, E strn2)
    {
        char[] str1 = convertToCharArray(String.valueOf(strn1));
        char[] str2 = convertToCharArray(String.valueOf(strn2));

        int n1 = str1.length;
        int n2 = str2.length;

        if (n1 != n2)
            return false;

        Arrays.sort(str1);
        Arrays.sort(str2);

        for (int i = 0; i < n1; i++)
            if (str1[i] != str2[i])
                return false;
        return true;
    }

    static char[] convertToCharArray(String strArray){
        char[] charArray = new char[strArray.length()];
        for (int i = 0; i < strArray.length(); i++) {
            charArray[i] = strArray.charAt(i);
        }
        return charArray;
    }

    public void getPrimeNumbers(int lBond, int uBond) {
        int flag;
        for (int i = lBond; i <= uBond; i++) {
            if (i == 1 || i == 0)//skip if number 0 and 1
                continue;
            flag = 1;
            for (int j = 2; j <= i / 2; ++j) {
                if (i % j == 0) {
                    flag = 0;
                    break;
                }
            }
            if (flag == 1) {
                System.out.println(i);
//                checkAnagram(String.valueOf(i),String.valueOf(i+1));
                checkPalindrom(i);
            }
        }
    }

    public void checkPalindrom(int number){
        StringBuilder sb = new StringBuilder();
        for (int i = String.valueOf(number).length(); i > 0; i--) {
            sb.append(String.valueOf(number).charAt(i-1));

        }
        if(Integer.parseInt(String.valueOf(sb)) == number){
            System.out.println(number+" is palindrome");
        }
    }

    public void makeParagraph(String[] strArray) {

    }
}
