package design_pattern.observer;

import java.util.ArrayList;
import java.util.List;

public class ObserverPattern {
    public static void main(String[] args) {
        Subject subject = new ConcreteSubject();
        Observer obs1 = new ConcreteObserver1();
        Observer obs2 = new ConcreteObserver2();
        subject.add(obs1);
        subject.add(obs2);
        subject.notifyObserver();
    }
}

//抽象目标
abstract class Subject {
    protected List<Observer> observers = new ArrayList<Observer>();

    //增加观察者方法
    public void add(Observer observer) {
        observers.add(observer);
    }

    //删除观察者方法
    public void remove(Observer observer) {
        observers.remove(observer);
    }

    public abstract void notifyObserver(); //通知观察者方法
}

//具体目标
class ConcreteSubject extends Subject {
    public void notifyObserver() {
        System.out.println("具体目标发生改变...");
        System.out.println("--------------");

        for (Object obs : observers) {
            ((Observer) obs).response();
        }

    }
}

//抽象观察者
interface Observer {
    void response(); //反应
}

//具体观察者1
class ConcreteObserver1 implements Observer {
    public void response() {
        System.out.println("具体观察者1作出反应！");
    }
}

//具体观察者1
class ConcreteObserver2 implements Observer {
    public void response() {
        System.out.println("具体观察者2作出反应！");
    }
}
/*不严格的说，Java的第二种for循环基本是这样的格式：

        for (循环变量类型 循环变量名称 : 要被遍历的对象)  循环体

        借助这种语法，遍历一个数组的操作就可以采取这样的写法：

        清单3：遍历数组的简单方式
        复制代码 代码如下:

        *//* 建立一个数组 *//*
        int[] integers = {1， 2， 3， 4};

        *//* 开始遍历 *//*
        for (int i : integers) {
        System.out.println(i); *//* 依次输出“1”、“2”、“3”、“4” *//*
        }


        这里所用的for循环，会在编译期间被看成是这样的形式：



        清单4：遍历数组的简单方式的等价代码
        复制代码 代码如下:

        *//* 建立一个数组 *//*
        int[] integers = {1， 2， 3， 4};

        *//* 开始遍历 *//*
        for (int 变量名甲 = 0; 变量名甲 < integers.length; 变量名甲++) {
        System.out.println(integers[变量名甲]); *//* 依次输出“1”、“2”、“3”、“4” *//*
        }


        这里的“变量名甲”是一个由编译器自动生成的不会造成混乱的名字。*/


