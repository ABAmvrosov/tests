package net.aab.TestApps;

public class NewAbstractInterface {
    public static void main(String[] args) {
        MeAbstract meAbstract = new MeAbstract() {
            @Override
            void abstractClassMethod() {

            }
        };

        MeInterFace meInterFace = new MeInterFace() {
            @Override
            public void interfaceMethod() {

            }
        };

    }
}

abstract class MeAbstract {
    abstract void abstractClassMethod();
}
interface MeInterFace {
    void interfaceMethod();
}