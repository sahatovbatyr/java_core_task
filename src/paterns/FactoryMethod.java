package paterns;

import paterns.interfaces.IntDeveloperFactory;
import paterns.factories.JavaDeveloperFactory;
import paterns.factories.PhpDeveloperFactory;
import paterns.interfaces.IntDeveloper;

public class FactoryMethod {

    public static void main(String[] args) {

        IntDeveloperFactory developerFactory = createDeveloperFactory("Java");
        IntDeveloper developer  = developerFactory.createDeveloper();

        developer.writeCode();


    }

    static IntDeveloperFactory createDeveloperFactory(String devLang ){

        if ( devLang.equalsIgnoreCase("Java")) return new JavaDeveloperFactory();
        else if ( devLang.equalsIgnoreCase("Php") ) return new PhpDeveloperFactory();
        else {
            throw new RuntimeException("Error, not that lang "+devLang);
        }

    }
}
