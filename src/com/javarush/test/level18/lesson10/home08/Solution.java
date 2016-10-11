package com.javarush.test.level18.lesson10.home08;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* Нити и байты
Читайте с консоли имена файлов, пока не будет введено слово "exit"
Передайте имя файла в нить ReadThread
Нить ReadThread должна найти байт, который встречается в файле максимальное число раз, и добавить его в словарь resultMap,
где параметр String - это имя файла, параметр Integer - это искомый байт.
Закрыть потоки. Не использовать try-with-resources
*/

public class Solution {
    public static Map<String, Integer> resultMap = new HashMap<String, Integer>();

    public static void main(String[] args) throws IOException, InterruptedException
    {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        String key;
        while (!(key=r.readLine()).equals("exit")) {
            ReadThread readThread = new ReadThread(key);
            readThread.start();

        }
        r.close();
    }

    public static class ReadThread extends Thread {
        private String fileName;
        public ReadThread(String fileName) {
            this.fileName = fileName;
            //implement constructor body
        }
        public void run(){
            try{
                FileInputStream fileReader = new FileInputStream(fileName);
                ArrayList<Integer> list = new ArrayList<Integer>();
                while (fileReader.available() > 0){
                    int data = fileReader.read();
                    list.add(data);
                }
                fileReader.close();

                int max = 0;
                int id = 0;

                for(int a = 0;a<list.size();a++){
                    int count = Collections.frequency(list,list.get(a));
                    if(count>max){ max = count; id = list.get(a);}
                }

                resultMap.put(fileName,id);

            }catch (Exception e){}
        }
        // implement file reading here - реализуйте чтение из файла тут
    }
}
