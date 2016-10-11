package com.javarush.test.level05.lesson12.bonus03;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/* Задача по алгоритмам
Написать программу, которая:
1. вводит с консоли число N > 0
2. потом вводит N чисел с консоли
3. выводит на экран максимальное из введенных N чисел.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> list = new ArrayList<Integer>();
        int n = Integer.parseInt(reader.readLine());
        int maximum = Integer.MIN_VALUE;
        if (n > 0) {
            for (int i = n; i > 0; i--) {
                int chisl = Integer.parseInt(reader.readLine());
                list.add(chisl);
            }
        }
        for (int i = 0; i < list.size(); i++) {
            if (maximum < list.get(i)) {
                maximum = list.get(i);
            }
        }

        //напишите тут ваш код




        System.out.println(maximum);
    }
}
