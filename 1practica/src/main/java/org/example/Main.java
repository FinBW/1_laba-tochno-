package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Animal[] animals = {new Cat("Murzik", 5, 200),
                new Cat("Barzik", 2, 200),
                new Dog("Bobzik", 3, 500, 200),
                new Tiger("Tigzik", 4, 1000, 500),
                new GoldAntilopa("Lopa",50,400,1000),
                new KonekGorbunek("Konek",3,49,600),
                new SnakeGorinich("Gorin",56,10,40)
        };
        new SnakeGorinich("Gorin",56,10,40);
        for (Animal a : animals) {
            a.run(600);
            a.swim(40);
            System.out.println();
        }

        ((Fantasy) animals[4]).power();
        ((Fantasy) animals[5]).power();
        ((Fantasy) animals[6]).power();
        System.out.println();

        System.out.println("Всего животных: " + Animal.count + ". Из них фантастических тварей: " + Fantasy.count);
        System.out.println();

        System.out.println("Золотых Антилоп: " + GoldAntilopa.count);
        System.out.println("Коньков Горбунков: " + KonekGorbunek.count);
        System.out.println("Змеев-Горынычей: " + SnakeGorinich.count);

        System.out.println("Cats: " + Cat.count);
        System.out.println("Dogs: " + Dog.count);
        System.out.println("Tigers: " + Tiger.count);

    }
}