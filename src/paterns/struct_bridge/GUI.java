package paterns.struct_bridge;

// Абстракция для GUI
abstract class GUI {
    protected GUIComponent component;

    public GUI(GUIComponent component) {
        this.component = component;
    }

    abstract void drawGUI();
}
