package paterns.creational_factorymethod;

import paterns.creational_factorymethod.interfaces.IntDeveloperFactory;
import paterns.creational_factorymethod.factories.JavaDeveloperFactory;
import paterns.creational_factorymethod.factories.PhpDeveloperFactory;
import paterns.creational_factorymethod.interfaces.IntDeveloper;

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
