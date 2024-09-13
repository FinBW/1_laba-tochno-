package org.example;

public class GoldAntilopa extends Fantasy{

    private static final String power="даёт деньги";

    public static int count = 0;

    public GoldAntilopa(String name, int age, int maxSwimDist,int maxRunDist)
    {
        super(name, age, maxSwimDist, maxRunDist, power);
        count++;
    }
}
