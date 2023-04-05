package com.example.borya;

import java.util.Random;
import java.util.Scanner;

public class Algorithm {
    // пустой конструктор
    public Algorithm() {
    }

    // метод перевода строки в массив подстрок
    public String[] textExampleArray() {
        // определение длины массива
        Scanner scanner = new Scanner(textExampleIn);
        int countArray = 0; // счётчик количества подстрок в большой строке
        while (scanner.hasNext()) { // есть ли строка
            String textInput = scanner.nextLine(); // считывание строки и переход на следующую
            // фильтр пустых строк
            if(!textInput.equals("")) countArray++;
        }
        scanner.close(); // закрытие сканера

        // создание массива для всех подстрок большой строки
        String[] textArrayIn = new String[countArray];
        // инициализация массива подстроками
        Scanner scannerIn = new Scanner(textExampleIn);
        int count = 0; // счётчик заполнения массива
        while (scannerIn.hasNext()) {
            String textExampleOne = scannerIn.nextLine(); // считывание строки и переход на следующую
            if(!textExampleOne.equals("")) {
                textArrayIn[count] = textExampleOne;
                count++;
            }
        }
        scannerIn.close();
        // вывод итогого значения
        return textArrayIn;
    }

    // метод вывода рандомной ячейки массива
    public int textExampleRandom(String[] arrayInput) {
        // создание объекта класса Random
        Random random = new Random();
        // генерация случайных значений
        int key = random.nextInt(arrayInput.length);
        return key;
        // return random.nextInt(arrayInput.length);
    }

    private final String textExampleIn = "  Большая буква и кавычки в собственных наименованиях\n" +
            "Большая буква и кавычки в собственных наименованиях\n" +
            "И усы лишь обмочил.";
}
