package com.javarush.test.level19.lesson10.home05;

/* Слова с цифрами
В метод main первым параметром приходит имя файла1, вторым - файла2.
Файл1 содержит строки со слов, разделенные пробелом.
Записать через пробел в Файл2 все слова, которые содержат цифры, например, а1 или abc3d
Закрыть потоки. Не использовать try-with-resources
*/

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {
    public static void main(String[] args) throws IOException {
        String fileName1 = args[0];
        String fileName2 = args[1];
        FileReader reader = new FileReader(fileName1);
        FileWriter writer = new FileWriter(fileName2);

        char ch;
        String text = "";

        while (reader.ready()) {
            ch = (char) reader.read();
            text +=ch;
        }

        Pattern pat = Pattern.compile("[ ]");
        String strs[] = pat.split(text);
        for (int i = 0; i < strs.length; i++) {
            Pattern pat1 = Pattern.compile("[\\D]");
            Matcher mat1 = pat1.matcher(strs[i]);
            if (mat1.find()) {
                Pattern pat2 = Pattern.compile("[0-9]+");
                Matcher mat2 = pat2.matcher(strs[i]);
                if (mat2.find()) {
                    writer.write(strs[i] + " ");
                }
            }
        }
        reader.close();
        writer.close();
    }
}
