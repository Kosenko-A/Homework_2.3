package ru.geekbrains.homeworks;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        doTask1();
        TelephoneBook book = new TelephoneBook();
        book.add("Вадим", "896196543");
        book.add("Катя", "896197788");
        System.out.println(book.get("Вадим"));
        System.out.println(book.get("Катя"));
    }
    static void doTask1(){
        String [] words = {"cat", "dog", "cat", "watermelon", "kiwi", "kiwi", "banana", "cat", "watermelon", "cat"};
        List<String> wordsList = Arrays.asList(words);
        System.out.println("Все элементы коллекции: " + wordsList);
        Set<String> wordsSet = new HashSet<>(wordsList);
        System.out.println("Неповторяющиеся элементы коллекции: " + wordsSet);

        Map<String, Integer> checkWords = new HashMap<>();

        for (String i: wordsList){
            if (checkWords.containsKey(i)){
                Integer point = checkWords.get(i);
                point++;
                checkWords.put(i, point);
            } else {
                checkWords.put(i, 1);
            }
        }
        System.out.println(checkWords);
    }
}
