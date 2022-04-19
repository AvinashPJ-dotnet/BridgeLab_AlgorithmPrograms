package com.bl.algorithm_programs.programs.test_cases;

import com.bl.algorithm_programs.programs.AlgorithmProgram;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class AlgorithmProgramTest {
    //1. permutation of string
    @Test
    public void givenStringCheckPermutationReturnResult(){
        AlgorithmProgram algorithmProgram = new AlgorithmProgram();
        String str = "abc";
        algorithmProgram.stringPermutation(str,0,str.length());
    }

    //2. binary search
    @Test
    public void givenStringBinarySearchReturnResult(){
        AlgorithmProgram algorithmProgram = new AlgorithmProgram();
//        String[] strArr= {"hi","this", "is", "binary", "search","program"};
        Integer[] strArr= {1,56, 4, 78, 2,7};
        algorithmProgram.binarySearch(strArr,2);
    }

    //3. insertion sort
    @Test
    public void givenStringArrayPerformInsertionSortReturnResult(){
        AlgorithmProgram algorithmProgram = new AlgorithmProgram();
        String[] strArr= {"hi","this", "is", "binary", "search","program"};
//        Integer[] strArr= {1,56, 4, 78, 2,7};
        Object[] result = algorithmProgram.insertionSort(strArr);
        System.out.println(Arrays.toString(result));
    }

    //4. bubble sort
    @Test
    public void givenStringArrayPerformBubbleSortReturnResult(){
        AlgorithmProgram algorithmProgram = new AlgorithmProgram();
        String[] strArr= {"hi","this", "is", "binary", "search","program"};
//        Integer[] strArr= {1,56, 4, 78, 2,7};
        Object[] result = algorithmProgram.bubbleSort(strArr);
        System.out.println(Arrays.toString(result));
    }

    //6. anagram problem result true
    @Test
    public void givenStringArrayPerformAnagramReturnTrue(){
        AlgorithmProgram algorithmProgram = new AlgorithmProgram();
        String str1 = "heart";
        String str2 = "earth";
        boolean result = algorithmProgram.checkAnagram(str1,str2);
        System.out.println(result);
    }


    //6. anagram problem result true extends with generics
    @Test
    public void givenObjectArray_PerformAnagram_ReturnTrue(){
        AlgorithmProgram algorithmProgram = new AlgorithmProgram();
        String str1 = "345345";
        String str2 = "343455";
        boolean result = algorithmProgram.checkAnagram(str1,str2);
        System.out.println(result);
    }


    //6. anagram problem result false
    @Test
    public void givenStringArrayPerformAnagramReturnFalse(){
        AlgorithmProgram algorithmProgram = new AlgorithmProgram();
        String str1 = "program";
        String str2 = "gramper";
        boolean result = algorithmProgram.checkAnagram(str1,str2);
        System.out.println(result);
    }

    //7. range of prime number
    @Test
    public void givenStringArray_WhenRangeOfPrimeNumber_ReturnTrue(){
        AlgorithmProgram algorithmProgram = new AlgorithmProgram();
        algorithmProgram.getPrimeNumbers(0,1000);
    }

    //12. customize message demonstrate using string function
    @Test
    public void givenStringArray_WhenAllDataMatches_ReturnTrue(){
        String[] userDetailsArray = {"Avinash", "Avinash.S.Pujari","73472834234","12/02/2022"};
        AlgorithmProgram algorithmProgram = new AlgorithmProgram();
        algorithmProgram.makeParagraph(userDetailsArray);
    }
}
