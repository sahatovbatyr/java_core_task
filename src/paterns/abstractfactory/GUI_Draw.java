package paterns.abstractfactory;

import paterns.abstractfactory.factories.MacFactory;
import paterns.abstractfactory.factories.WindowsFactory;

public class GUI_Draw {



    public static void main(String[] args) {

        Client client = new Client( new WindowsFactory());
        client.createUI();

        client = new Client( new MacFactory());
        client.createUI();

    }
}
