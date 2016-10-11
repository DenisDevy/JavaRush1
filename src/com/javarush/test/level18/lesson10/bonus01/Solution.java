package com.javarush.test.level18.lesson10.bonus01;

/* Шифровка
Придумать механизм шифровки/дешифровки

Программа запускается с одним из следующих наборов параметров:
-e fileName fileOutputName
-d fileName fileOutputName
где
fileName - имя файла, который необходимо зашифровать/расшифровать
fileOutputName - имя файла, куда необходимо записать результат шифрования/дешифрования
-e - ключ указывает, что необходимо зашифровать данные
-d - ключ указывает, что необходимо расшифровать данные
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String key = reader.readLine();
        List<Integer> listin1 = new ArrayList<Integer>();
        List<Integer> listin2 = new ArrayList<Integer>();
        if (key.equals("-e")) {
            String fileName = reader.readLine();
            String fileOutputName = reader.readLine();
            FileInputStream in = new FileInputStream(fileName);
            FileOutputStream out = new FileOutputStream(fileOutputName);
            while (in.available() > 0) {
                int data = in.read();
                int shifr = (data +2);
                listin1.add(shifr);
            }
            for (int i = 0; i < listin1.size(); i++) {
                out.write(listin1.get(i));
            }
            in.close();
            out.close();
        } else if (key.equals("-d")) {
            String fileName = reader.readLine();
            String fileOutputName = reader.readLine();
            FileInputStream in = new FileInputStream(fileName);
            FileOutputStream out = new FileOutputStream(fileOutputName);
            while (in.available() > 0) {
                int data = in.read();
                int deshifr = (data -2);
                listin2.add(deshifr);
            }
            for (int i = 0; i < listin2.size(); i++) {
                out.write(listin2.get(i));
            }
            in.close();
            out.close();
        }
        reader.close();
    }

}
