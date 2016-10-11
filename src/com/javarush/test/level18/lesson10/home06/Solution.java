package com.javarush.test.level18.lesson10.home06;

/* Встречаемость символов
Программа запускается с одним параметром - именем файла, который содержит английский текст.
Посчитать частоту встречания каждого символа.
Отсортировать результат по возрастанию кода ASCII (почитать в инете). Пример: ','=44, 's'=115, 't'=116
Вывести на консоль отсортированный результат:
[символ1]  частота1
[символ2]  частота2
Закрыть потоки. Не использовать try-with-resources

Пример вывода:
, 19
- 7
f 361
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.TreeSet;

public class Solution {
    public static void main(String[] args) throws IOException
    {
        FileReader in = new FileReader(args[0]);
        BufferedReader reader = new BufferedReader(in);
        TreeSet<Integer> set = new TreeSet<Integer>();
        ArrayList<Integer> list = new ArrayList<Integer>();
        int c;
        while ((c = in.read()) != -1) {
            set.add(c);
            list.add(c);
        }
        for (int v : set) {
            int count = 0;
            for (int v1 : list) {
                if (v1 == v) {
                    count++;
                }

            }
            System.out.println((char) v + " " + count);
        }
        reader.close();
        in.close();

    }
}
