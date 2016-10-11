package com.javarush.test.level14.lesson08.bonus02;

/* НОД
Наибольший общий делитель (НОД).
Ввести с клавиатуры 2 целых положительных числа.
Вывести в консоль наибольший общий делитель.
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution
{
    public static void main(String[] args) throws Exception, IOException
    {
        VvodChisel();
    }

    private static void VvodChisel() throws NumberFormatException, IOException
    {
        //Создаем массив и вптсываем в него два числа
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[2];
        int chislo;

        for (int i = 0; i < arr.length; i++)
        {
            chislo = Integer.parseInt(r.readLine());
            arr[i] = chislo;
        }
        //Определяем значение первых двух чисел
        int pervoe = arr[0];
        int vtoroe = arr[1];
        //Проверка какое число больше
        if (pervoe >= vtoroe)
        {
            //Создаем цикл с началом отсчта равным минимальному введенному
            for (int k = vtoroe; k >= 1; k--)
            {
                //Проверка остатка делителя от двух чисел на одновременное равенство нулю
                // и при первом совпадении стопим
                if (((vtoroe % k) == 0) & ((pervoe % k) == 0))
                {
                    System.out.println(k);
                    break;
                }
            }
        } else if (pervoe < vtoroe)
        {
            //Создаем цикл с началом отсчта равным минимальному введенному
            for (int k = pervoe; k >= 1; k--)
            {
                //Проверка остатка делителя от двух чисел на одновременное равенство нулю
                // и при первом совпадении стопим
                if (((vtoroe % k) == 0) & ((pervoe % k) == 0))
                {
                    System.out.println(k);
                    break;
                }
            }
        }
    }
}
