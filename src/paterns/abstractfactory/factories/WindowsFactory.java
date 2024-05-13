package paterns.abstractfactory.factories;

import paterns.abstractfactory.interfaces.Button;
import paterns.abstractfactory.models.WindowsButton;

public class WindowsFactory implements GUIFactory{
    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}
