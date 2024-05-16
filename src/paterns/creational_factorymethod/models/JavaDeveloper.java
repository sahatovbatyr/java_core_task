package paterns.creational_factorymethod.models;

import paterns.creational_factorymethod.interfaces.IntDeveloper;

public class JavaDeveloper implements IntDeveloper {

    @Override
    public void writeCode() {

        System.out.println("The Developer writes Java code...");

    }
}
