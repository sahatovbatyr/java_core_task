package paterns.creational_factorymethod.models;

import paterns.creational_factorymethod.interfaces.IntDeveloper;

public class CppDeveloper implements IntDeveloper {
    @Override
    public void writeCode() {

        System.out.println("The developer writes C++ code...");

    }
}
