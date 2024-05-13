package paterns.abstractfactory;

import paterns.abstractfactory.factories.GUIFactory;
import paterns.abstractfactory.interfaces.Button;

public class Client {

    GUIFactory factory;

    public Client( GUIFactory factory){
        this.factory = factory;

    }

    public void createUI(){
        Button button = factory.createButton();
        button.paintButton();
    }
}
