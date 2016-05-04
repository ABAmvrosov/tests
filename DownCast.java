package net.aab.TestApps;

class A {
    int i = 0;
    public int increment() {
        return ++i;
    }
}

public class DownCast extends A {
    int i = 10;
    public int increment() {
        return ++i;
    }

    public static void main(String[] args) {
        A obj = (A) new DownCast();
        System.out.println(obj.increment());
        System.out.println(obj.i);
    }
}
