package paterns.creational_abstractfactory.models;

import paterns.creational_abstractfactory.interfaces.Button;

public class MacButton implements Button {


    @Override
    public void paintButton() {
        System.out.println("Mac Button is panted");
    }
}
