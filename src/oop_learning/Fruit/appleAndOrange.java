package oop_learning.Fruit;

import java.util.ArrayList;

public class appleAndOrange {
    public static void main(String[] args) {
        ArrayList<Fruit> arrayList1=new ArrayList<Fruit>();
        arrayList1.add(new Apple());
        arrayList1.add(new Orange());
        FruitAdapter fruitAdapter1 =new FruitAdapter(arrayList1.get(0));
        FruitAdapter fruitAdapter2 =new FruitAdapter(arrayList1.get(1));
        fruitAdapter1.printfruit();
        fruitAdapter2.printfruit();
    }
}
interface Fruit{

}
class Apple implements Fruit{
    public void printOn(){
        System.out.println("This is an apple.");
    }
}

class Orange implements Fruit{
    public void writeTo(){
        System.out.println("This is an orange.");
    }
}

class FruitAdapter {
    private Object fruitadapter;
    public FruitAdapter(Object o1) {
        fruitadapter = o1;
    }


    public void printfruit() {
        if (fruitadapter instanceof Apple) {
            ((Apple) fruitadapter).printOn();
        } else if (fruitadapter instanceof Orange) {
            ((Orange) fruitadapter).writeTo();
        }
    }
}