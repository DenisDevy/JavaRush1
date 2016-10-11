package com.javarush.test.level14.lesson08.home09;

public abstract class Money
{
    private double param;
    public Money(double amount)
    {
        param = amount;
    }

    public abstract double getAmount();

    public abstract String getCurrencyName();
}

