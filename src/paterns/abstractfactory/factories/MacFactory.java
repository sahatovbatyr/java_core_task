package paterns.abstractfactory.factories;

import paterns.abstractfactory.interfaces.Button;
import paterns.abstractfactory.models.MacButton;

public class MacFactory implements GUIFactory{
    @Override
    public Button createButton() {
        return new MacButton();
    }
}
