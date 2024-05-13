package paterns.abstractfactory.models;

import paterns.abstractfactory.interfaces.Button;

public class WindowsButton implements Button {
    @Override
    public void paintButton() {

        System.out.println("Windows Button is painted");
    }
}
