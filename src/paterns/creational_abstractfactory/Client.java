package paterns.creational_abstractfactory;

import paterns.creational_abstractfactory.factories.GUIFactory;
import paterns.creational_abstractfactory.interfaces.Button;

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
