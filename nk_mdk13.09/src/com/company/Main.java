package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //1
        Scanner line = new Scanner(System.in);
        String str = line.nextLine();
        String split_str[] = str.split("");
        String  array[][] = new String[str.length()][1];
        String previous_letter = null;
        int i = 0;
        int count_letter = 1;
        for (String letter : split_str){
            if (letter.equals(previous_letter)){
                count_letter++;
                i--;
            }
            else
                count_letter = 1;
            array[i] = new String[]{letter, Integer.toString(count_letter)};
            i++;
            previous_letter = letter;
        }
        for (String[] el : array){
            if (el[0] == null)
                break;
            if (!el[1].equals("1"))
                System.out.print(el[0] + el[1]);
            else
                System.out.print(el[0]);
        }

        //2

    }
}
