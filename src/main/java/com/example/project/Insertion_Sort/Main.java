package com.example.project.Insertion_Sort;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arrA = {30,25,28,90,43,54,15,42,76,26,59,89,35,100,96,78,46,41,4,68,71,44,55,31,49,97,79,81,65,57,40,37,51,60,34};
        InsertionSort.selectionSort(arrA);
        System.out.println(Arrays.toString(arrA));
        System.out.println();
        int[] arrB = {30,25,28,90,43,54,15,42,76,26,59,89,35,100,96,78,46,41,4,68,71,44,55,31,49,97,79,81,65,57,40,37,51,60,34};
        InsertionSort.insertionSort(arrB);
        System.out.println(Arrays.toString(arrB));
    }
}