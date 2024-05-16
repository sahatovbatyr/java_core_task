package paterns.creational_abstractfactory.factories;

import paterns.creational_abstractfactory.interfaces.Button;
import paterns.creational_abstractfactory.models.MacButton;

public class MacFactory implements GUIFactory{
    @Override
    public Button createButton() {
        return new MacButton();
    }
}
