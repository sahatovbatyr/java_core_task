package paterns.abstractfactory.models;

import paterns.abstractfactory.interfaces.Button;

public class MacButton implements Button {


    @Override
    public void paintButton() {
        System.out.println("Mac Button is panted");
    }
}
