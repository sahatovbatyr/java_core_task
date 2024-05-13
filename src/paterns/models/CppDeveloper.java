package paterns.models;

import paterns.interfaces.IntDeveloper;

public class CppDeveloper implements IntDeveloper {
    @Override
    public void writeCode() {

        System.out.println("The developer writes C++ code...");

    }
}
