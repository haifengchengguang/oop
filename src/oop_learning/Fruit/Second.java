package oop_learning.Fruit;

class Animal1 {
    private Object animal;

    public Animal1(Object o1) {
        animal = o1;
    }


    public void move() {
        if (animal instanceof Sparrow) {
            ((Sparrow)animal).fly();
        } else if (animal instanceof Penguin) {
            ((Penguin) animal).swim();
        }
    }
}

class Sparrow {



    public void fly(){
        System.out.println("飞");
    }
}

class Penguin {

    public void swim(){
        System.out.println("游泳");
    }
}

public class Second {


    public static void main(String[] args) {
        Sparrow s1=new Sparrow();
        Penguin s2=new Penguin();
        Animal1 a1=new Animal1(s1);
        Animal1 a2=new Animal1(s2);
        a1.move();
        a2.move();


    }
}