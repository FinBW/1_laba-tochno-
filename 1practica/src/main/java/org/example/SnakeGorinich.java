package org.example;

public class SnakeGorinich extends Fantasy{

    private static final String power="Злой и летающий";

    public static int count = 0;

    public SnakeGorinich(String name, int age, int maxSwimDist,int maxRunDist)
    {
        super(name, age, maxSwimDist, maxRunDist, power);
        count++;
    }
}
