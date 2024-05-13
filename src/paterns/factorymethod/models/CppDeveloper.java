package paterns.factorymethod.models;

import paterns.factorymethod.interfaces.IntDeveloper;

public class CppDeveloper implements IntDeveloper {
    @Override
    public void writeCode() {

        System.out.println("The developer writes C++ code...");

    }
}
