package paterns.creational_abstractfactory;

import paterns.creational_abstractfactory.factories.MacFactory;
import paterns.creational_abstractfactory.factories.WindowsFactory;

public class GUI_Draw {



    public static void main(String[] args) {

        Client client = new Client( new WindowsFactory());
        client.createUI();

        client = new Client( new MacFactory());
        client.createUI();

    }
}
