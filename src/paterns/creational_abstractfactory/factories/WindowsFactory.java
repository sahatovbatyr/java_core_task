package paterns.creational_abstractfactory.factories;

import paterns.creational_abstractfactory.interfaces.Button;
import paterns.creational_abstractfactory.models.WindowsButton;

public class WindowsFactory implements GUIFactory{
    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}
