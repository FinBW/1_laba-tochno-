package org.example;

public class KonekGorbunek extends Fantasy{

    private static final String power = "Быстрый бегун";

    public static int count = 0;

    public KonekGorbunek(String name, int age, int maxSwimDist,int maxRunDist)
    {
        super(name, age, maxSwimDist, maxRunDist, power);
        count++;
    }
}
