package oop_learning.clone;

class UnCloneA {
    private int i;

    public UnCloneA(int ii) {
        i = ii;
    }

    public void doublevalue() {
        i *= 2;
    }

    public String toString() {
        return Integer.toString(i);
    }
}

class CloneB implements Cloneable {
    public int aInt;
    public UnCloneA unCA = new UnCloneA(111);

    public Object clone() {
        CloneB o = null;
        try {
            o = (CloneB) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return o;
    }
}

public class CloneMain {
    public static void main(String[] a) {
        CloneB b1 = new CloneB();
        b1.aInt = 11;
        System.out.println("before oop_learning.clone,b1.aInt = " + b1.aInt);
        System.out.println("before oop_learning.clone,b1.unCA = " + b1.unCA);

        CloneB b2 = (CloneB) b1.clone();
        b2.aInt = 22;
        b2.unCA.doublevalue();
        System.out.println("=================================");
        System.out.println("after oop_learning.clone,b1.aInt = " + b1.aInt);
        System.out.println("after oop_learning.clone,b1.unCA = " + b1.unCA);
        System.out.println("=================================");
        System.out.println("after oop_learning.clone,b2.aInt = " + b2.aInt);
        System.out.println("after oop_learning.clone,b2.unCA = " + b2.unCA);
    }
}