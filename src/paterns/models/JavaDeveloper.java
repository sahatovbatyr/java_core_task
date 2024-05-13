package paterns.models;

import paterns.interfaces.IntDeveloper;

public class JavaDeveloper implements IntDeveloper {

    @Override
    public void writeCode() {

        System.out.println("The Developer writes Java code...");

    }
}
