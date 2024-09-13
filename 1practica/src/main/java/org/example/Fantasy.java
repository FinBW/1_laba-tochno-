package org.example;

public abstract class Fantasy extends Animal {

    public static int count = 0;



    public String power;

   public Fantasy(String name, int age, int maxSwimDist,int maxRunDist, String power)
   {
       super(name, age, maxRunDist, maxSwimDist);

       this.power = power;
       count++;
   }

    public void power() {
        System.out.println("Способность " + this.name + " - " + this.power);
    }
}
