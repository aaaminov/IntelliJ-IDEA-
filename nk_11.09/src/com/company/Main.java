package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        /*
        System.out.print("Введите cтроку: ");
        Scanner line = new Scanner(System.in);
        String stroka = line.nextLine();
        System.out.println("\nКоличество слов: " + countWords(stroka));
        */

        /*
        //3 задание: ввод int масива в бесконечном цикле, который  закончится когда ввод == 0
        System.out.println("Введите размер массива: ");
        Scanner line = new Scanner(System.in);
        int array[] = new int[line.nextInt()];
        int i = 0;
        while (true){
            if (i == array.length){
                break;
            }
            if (line.hasNextInt()){
                if (line.nextInt() == 0){
                    System.out.println("Ввод закончен.");
                    break;
                }
                else{
                    array[i] = line.nextInt();
                }
            }
            else{
                i--;
                continue;
            }
            i++;
        }
        System.out.print("Массив: ");
        for (int el : array){
            System.out.print(el + ", ");
        }
        */


    }

    private static int countWords(String str){
        String split_str[] = str.split(" ");
        int count_words = 0;
        for (String el : split_str){
            System.out.print("'" + el + "' ");
            if (el != ""){
                count_words++;
            }
        }
        return count_words;
    }

}
