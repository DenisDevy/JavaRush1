package com.javarush.test.level14.lesson08.home09;

/**
 * Created by Денис on 08.04.2016.
 */
public class USD extends Money
{
    public USD(double amount) {
        super (amount);
    }

    @Override
    public double getAmount()
    {
        return 4;
    }

    public String getCurrencyName() {
        return "USD";
    }

}
