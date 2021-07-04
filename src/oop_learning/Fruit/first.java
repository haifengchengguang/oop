package oop_learning.Fruit;

public class first {
    public static void main(String[] args) {
        Animal p1=new Animal();
        Animal p2=new Dogs();
        Dogs p3=new Dogs();
        p1.speak(p1);
        p1.speak(p2);
        p1.speak(p3);

        p2.speak(p1);
        p2.speak(p2);
        p2.speak(p3);

        p3.speak(p1);
        p3.speak(p2);
        p3.speak(p3);
    }
}

class Animal{
    public void speak (Animal p){
        System.out.println("Animal Speak");
    }
}

class Dogs extends Animal{
    public void speak(Animal p)
    {
        System.out.println("汪！");
    }
    public void speak(Dogs t)
    {
        System.out.println("汪汪！");
    }
}
