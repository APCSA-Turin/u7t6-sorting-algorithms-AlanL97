package com.example.project.Insertion_Sort;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class InsertionSort {

    // PART A. implementing insertion sort
    public static int[] insertionSort(int[] elements) {
        int count = 0;
        int temp;
        for (int i = 1; i < elements.length; i++) {
            int j = i-1;
            while (i != 0 && elements[i] < elements[j]) {
                count++;
                temp = elements[j];
                elements[j] = elements[i];
                elements[i] = temp;
                i = j;
                j = i-1;
            }
        }
        System.out.println("INSERTION SORT: Number of loop iterations: " + count);
        return elements;
    }

   
    public static int[] selectionSort(int[] elements) {
        int count = 0;
        int min;
        int temp;
        for (int i = 0; i < elements.length; i++) {
            min = i;
            for (int j = i+1; j < elements.length; j++) {
                count++;
                if (elements[j] < elements[min]) {
                    min = j;
                }
            }
            temp = elements[i];
            elements[i] = elements[min];
            elements[min] = temp;
        }
        System.out.println("SELECTION SORT: Number of loop iterations: " + count);
        return elements;
    }

    // PART B. sorting a 1000-word list
    public static ArrayList<String> insertionSortWordList(ArrayList<String> words) {
        int count = 0;
        String temp;
        for (int i = 1; i < words.size(); i++) {
            int j = i-1;
            while (i != 0 && words.get(i).compareTo(words.get(j)) < 0) {
                count++;
                temp = words.set(j, words.get(i));
                words.set(i, temp);
                i = j;
                j = i-1;
            }
        }
        System.out.println("INSERTION SORT: Number of loop iterations: " + count);
        return words;
    }

    public static ArrayList<String> selectionSortWordList(ArrayList<String> words) {
        int count = 0;
        int min;
        String temp;
        for (int i = 0; i < words.size(); i++) {
            min = i;
            for (int j = i+1; j < words.size(); j++) {
                count++;
                if (words.get(j).compareTo(words.get(min)) < 0) {
                    min = j;
                }
            }
            temp = words.set(i, words.get(min));
            words.set(min, temp);
        }
        System.out.println("SELECTION SORT: Number of loop iterations: " + count);
        return words;
    }

    public static ArrayList<String> loadWordsInto(ArrayList<String> wordList) {
        try {
            Scanner input = new Scanner(new File("src/main/java/com/example/project/Selection_Sort/words.txt"));
            while (input.hasNext()) {
                String word = input.next();
                wordList.add(word);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return wordList;
    }


}