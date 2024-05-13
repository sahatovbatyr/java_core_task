package paterns.factories;

import paterns.interfaces.IntDeveloper;
import paterns.interfaces.IntDeveloperFactory;
import paterns.models.JavaDeveloper;

public class JavaDeveloperFactory implements IntDeveloperFactory {

    @Override
    public IntDeveloper createDeveloper() {
        return new JavaDeveloper();
    }
}
