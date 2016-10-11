package com.javarush.test.level14.lesson08.home09;

/**
 * Created by Денис on 06.04.2016.
 */
public class Hrivna extends Money
{
    public Hrivna(double amount) {
        super (amount);
    }

    @Override
    public double getAmount()
    {
        return 0;
    }

    public String getCurrencyName() {
        return "HRN";
    }

}
