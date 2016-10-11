package com.javarush.test.level18.lesson10.home03;

/* Два в одном
Считать с консоли 3 имени файла
Записать в первый файл содержимого второго файла, а потом дописать в первый файл содержимое третьего файла
Закрыть потоки. Не использовать try-with-resources
*/

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName1 = reader.readLine();
        String fileName2 = reader.readLine();
        String fileName3 = reader.readLine();
        reader.close();
        FileInputStream in1 = new FileInputStream(fileName2);
        FileInputStream in2 = new FileInputStream(fileName3);
        FileOutputStream out1 = new FileOutputStream(fileName1);

        List<Integer> listin1 = new ArrayList<Integer>();
        List<Integer> listin2 = new ArrayList<Integer>();
        while (in1.available() > 0) {
            int data = in1.read();
            listin1.add(data);
        }
        while (in2.available() > 0) {
            int data = in2.read();
            listin2.add(data);
        }
        for (int i = 0; i < listin1.size(); i++) {
            out1.write(listin1.get(i));
        }
        for (int i = 0; i < listin2.size(); i++) {
            out1.write(listin2.get(i));
        }
        in1.close();
        in2.close();
        out1.close();
    }
}
