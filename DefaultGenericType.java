package net.aab.TestApps;

public class DefaultGenericType {
    public static void main(String[] args) {
        new ParamClass<>();
    }
}

class ParamClass<T> {
    T var;
}