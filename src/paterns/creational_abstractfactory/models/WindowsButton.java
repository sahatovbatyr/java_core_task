package paterns.creational_abstractfactory.models;

import paterns.creational_abstractfactory.interfaces.Button;

public class WindowsButton implements Button {
    @Override
    public void paintButton() {

        System.out.println("Windows Button is painted");
    }
}
