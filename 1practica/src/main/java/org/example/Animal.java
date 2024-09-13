package org.example;

public abstract class Animal {

    protected String name;
    private int age;
    static int count = 0;
    private int maxRunDist;
    private int maxSwimDist;

    public Animal(String name, int age, int maxRunDist, int maxSwimDist)
    {
        this.name = name;
        this.age = age;
        this.maxRunDist = maxRunDist;
        this.maxSwimDist = maxSwimDist;
        count++;
    }

    public void run(int dist)
    {
        System.out.println(this.name + " пробежал " + dist);
    }
    public void swim(int swimDist)
    {
        if (swimDist <= this.maxSwimDist)
        {
            System.out.println(this.name + " проплыл " + swimDist);
        }
        else{System.out.println(this.name + " утопился ");
        }

    }

}
