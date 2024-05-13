package paterns.factories;

import paterns.interfaces.IntDeveloper;
import paterns.interfaces.IntDeveloperFactory;
import paterns.models.PhpDevepoer;

public class PhpDeveloperFactory implements IntDeveloperFactory {
    @Override
    public IntDeveloper createDeveloper() {
        return new PhpDevepoer();
    }
}
